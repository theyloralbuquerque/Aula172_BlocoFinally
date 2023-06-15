package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\Temp\\in.txt"); // Vari�vel file tipo File que abre um arquivo txt do computador.
        Scanner sc = null;

        // Tente: c�digo que pode lan�ar uma exce��o
        try {
            sc = new Scanner(file); // A classe Scanner apontando para uma vari�vel tipo arquivo.
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        // Capturar: c�digo para lidar com exce��es e.
        catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        // Bloco Finally: executado mesmo tenha dado uma exce��o ou n�o.
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Bloco Finally executado");
        }
    }
}

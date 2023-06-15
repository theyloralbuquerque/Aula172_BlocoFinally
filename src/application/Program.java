package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\Temp\\in.txt"); // Variável file tipo File que abre um arquivo txt do computador.
        Scanner sc = null;

        // Tente: código que pode lançar uma exceção
        try {
            sc = new Scanner(file); // A classe Scanner apontando para uma variável tipo arquivo.
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        // Capturar: código para lidar com exceções e.
        catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        // Bloco Finally: executado mesmo tenha dado uma exceção ou não.
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Bloco Finally executado");
        }
    }
}

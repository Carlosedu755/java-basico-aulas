package edu.estudos.smarttv;
import java.util.Scanner;

public class Usuario {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        String valorEntrada;

        System.out.println("  ligar   | desligar  ");
        System.out.println("----------------------");
        System.out.println("Canal +   |   Volume +");
        System.out.println("Canal -   |   Volume -");
        System.out.println("----------------------");
        System.out.println("    1     2     3     ");
        System.out.println("    4     5     6     ");
        System.out.println("    7     8     9     ");
        System.out.println("          0           ");

        Scanner teclado = new Scanner(System.in);
        valorEntrada = teclado.nextLine();

        SmartTV.validar(valorEntrada);

        teclado.close();

    }

    
}

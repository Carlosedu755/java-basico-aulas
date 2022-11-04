package edu.estudos.smarttv;

import java.util.Scanner;

public class SmartTV {
    
    public static void ligarTV(boolean ligada){
        Scanner teclado = new Scanner(System.in);

        if(ligada == true){
            System.out.println("Televisão ligada");
            
            String valorEntrada = teclado.nextLine();

            if(valorEntrada.equalsIgnoreCase("desligar")){
                ligada = false;
                ligarTV(ligada);
            } else if(valorEntrada.equalsIgnoreCase("mudar +") || valorEntrada.equalsIgnoreCase("mudar -")){
                mudarCanal(valorEntrada);
            } else {
                mudarVolume(valorEntrada);
            }
            
        } else {
            System.out.println("Televisão Desligada");

            String valorEntrada = teclado.nextLine();
            if(valorEntrada.equalsIgnoreCase("ligar")){
                ligada = true;
                ligarTV(ligada);
            }
        }
    }

    public static void mudarCanal(String valorEntrada){
        int canalTV = 1;
        if(valorEntrada.equalsIgnoreCase("mudar +")){
            canalTV++;
            System.out.println("Canal " + canalTV);
        } else if(valorEntrada.equalsIgnoreCase("mudar -")){
            canalTV--;
            System.out.println("Canal " +canalTV);
        } else {
            canalTV = Integer.parseInt(valorEntrada);
            System.out.println("Canal " +canalTV);
        }
    }

    public static void mudarVolume(String valorEntrada){
        int volume = 0;
        if (valorEntrada.equalsIgnoreCase("volume +")){
            volume++;
            if(volume > 20){
                System.out.println("Volume Max");
                volume = 100;
            } else {
                System.out.println("Volume " + volume);
            }
        } else if(valorEntrada.equalsIgnoreCase("volume -")){
            volume--;
            if (volume < 0){
                System.out.println("Volume min");
                volume = 0;
            } else{
                System.out.println("Volume " + volume);
            }
        }
    }

}

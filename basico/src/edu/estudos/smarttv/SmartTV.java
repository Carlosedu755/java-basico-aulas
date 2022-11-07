package edu.estudos.smarttv;

public class SmartTV {
    
    static boolean ligada = false;
    static int canalTV = 2;
    static int volume = 5;

    /**
     * @param valor
     */
    public static void validar(String valor){
        if(valor.equalsIgnoreCase("ligar")){
            ligarTV();;
        } else if(valor.equalsIgnoreCase("desligar")){
            desligarTV();
        } else if(valor.equalsIgnoreCase("volume +") || valor.equalsIgnoreCase("volume+")){
            aumentarVolume(valor);
        } else if(valor.equalsIgnoreCase("volume -") || valor.equalsIgnoreCase("volume-")){
            diminuirVolume(valor);
        } else if(valor.equalsIgnoreCase("canal +") || valor.equalsIgnoreCase("canal+")){
            aumentarCanal(valor);
        } else if(valor.equalsIgnoreCase("canal -") || valor.equalsIgnoreCase("canal-")){
            diminuirCanal(valor);
        } else {
            mudarCanal(valor);
        }
    }


    public static void ligarTV(){
        System.out.println("Televisão Ligada"); 
    }

    public static void desligarTV(){
        System.out.println("Televisão Desligada");
    }

    public static void aumentarCanal(String valorCanal){       
        canalTV++;
        System.out.println("Canal " + canalTV);
    }

    public static void diminuirCanal(String valorCanal){
        canalTV--;
        System.out.println("Canal " + canalTV);
    }

    public static void mudarCanal(String valorCanal){
        canalTV = Integer.parseInt(valorCanal);
        System.out.println("Canal " + canalTV);
    }

    public static void aumentarVolume(String valorVolume){
        volume++;
        if(volume > 20){
            System.out.println("Volume Max");
            volume = 20;
        } else {
            System.out.println("Volume " + volume);
        }
    }

    public static void diminuirVolume(String valorVolume){
        volume--;
        if(volume < 0){
            System.out.println("Volume min");
            volume = 0;
        } else {
            System.out.println("Volume " + volume);
        }
    }

}

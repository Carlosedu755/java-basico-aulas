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
            } else {
                mudarCanal(valorEntrada);
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

    public static void main(String[] args) {
        
        boolean ligada = true;
        int volumeTV = 1;

        ligarTV(ligada);
    }
}

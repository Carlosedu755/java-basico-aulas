public class Operadores {
    
    public static void main(String[] args) {
    
        String nome = "Benicio";
        String sobrenome = "weegle";

        System.out.println(nome + sobrenome);// + sinal de adicao cocatena strings

        double soma = 10.5 + 15.7;
        int subtracao = 113 -25;
        int multplicacao = 20 * 7;
        double divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4); // os parenteses vão indicar a ordem de precendencia do calculo
    
        System.out.println("Adição =" + soma);
        System.out.println("Subtração =" + subtracao);
        System.out.println("multiplicação =" + multplicacao);
        System.out.println("Divisão =" + divisao);
        System.out.println("Modulo =" + modulo);
        System.out.println("Resultado =" + resultado);

        //calculo com cocatenação

        String cocatenacao = "";

        cocatenacao = 1 + 1 + 1 + "1"; //ele vai somar os 3 primeiros e quando ver que tem um caracter vai cocatenar; 

        System.out.println(cocatenacao); 

        cocatenacao = 1 + "1" + 1 + "1"; //ele vai cocatenar pois está somando com caracteres

        System.out.println(cocatenacao);

        cocatenacao = "1" + 1 + 1 + 1; // ele vai cocatenar tudo pois iniciou com caracter

        System.out.println(cocatenacao);

        cocatenacao = "1" + (1 + 1 + 1); //aqui ele usa a ordem de precedencia do parenteses, soma tudo dentro do parenteses e depois cocatena

        System.out.println(cocatenacao);

    }

}

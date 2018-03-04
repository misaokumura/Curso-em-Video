package palindromo;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String texto;
    String auxiliar = "";
        System.out.print("Digite uma palavra: ");
        texto = entrada.next();
        auxiliar = new StringBuffer(texto).reverse().toString();
            if (texto.equals(auxiliar)){
                System.out.println("Esta palavra é um PALINDROMO!");}
            else{
                System.out.println("Esta palavra não é um PALINDROMO!");
            }
            System.out.print(texto + " contém ");
            System.out.print(texto.length());
            System.out.println(" caracteres");
            
    }
    
}

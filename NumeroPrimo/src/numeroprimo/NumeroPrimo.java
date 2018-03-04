package numeroprimo;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero1=in.nextInt();
        
        double numero2 = numero1;
        
        if ((numero2 / numero2)==(numero1 / numero1)){
            if (numero2 / 2 != numero1 / 2 || numero1 == 2){
                System.out.println(numero1 + " é um número PRIMO!");
            } 
            else {
                System.out.println(numero1 + " não é um número PRIMO!");
            }
        }
    }
}
 

package usuario;

import java.util.Scanner;
import validacpf.ValidaCPF;

public class Usuario {
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    String CPF;

    System.out.printf("Informe um CPF (Não utilize pontos e traços): ");
    CPF = entrada.next();

    System.out.printf("\nResultado: ");
    
        if (ValidaCPF.isCPF(CPF) == true)
          System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
        else System.out.printf("Erro, CPF invalido !!!\n");
  }
}

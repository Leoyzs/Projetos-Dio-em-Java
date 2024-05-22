package ControleFluxo;
import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
            int parametroUm, parametroDois;

        try {
            System.out.println("Informe o primeiro numero inteiro");
            parametroUm = terminal.nextInt();	
        
            System.out.println("Informe o segundo numero inteiro");
            parametroDois = terminal.nextInt();	
        
            contar(parametroUm, parametroDois);
        } catch(InputMismatchException exception) {
            System.out.println("Os parâmetros informados devem ser números inteiros");
        }
    }

    static void contar(int parametroUm, int parametroDois) {
        try {
            if(parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            } else {
                int contagem = parametroDois - parametroUm;
                for(int i = 1; i <= contagem; i++) {
                    System.out.println("Imprimindo o valor " + i);
                }
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }  
}

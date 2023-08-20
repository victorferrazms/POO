import java.util.Scanner;

/*
* Victor Manoel De Sousa Ferraz - TADS 2°SEMESTRE
* @author 202322160001@ifto.local
*/

//2.Faça um algoritmo em Java para calcular um valor em reais e exibir o resultado, no console, equivalente em dólares. Considere o valor atual do dólar.

public class Ex02 {

  public static void main(String[] args) {
      
        //Valor do dolar.
        Double dolar = Double.parseDouble("4.79"); // em 02/08/2023
    
        //Criar um objeto Scanner que leia a entrada do usuario.
        Scanner entrada = new Scanner(System.in);
        
        //Solicitar ao usuario o primeiro valor em real.
        System.out.println("Insira o primeiro valor em real:");
        Double numero1 = entrada.nextDouble();
        
        //Solicitar ao usuario o segundo valor em real.
        System.out.println("Insira o segundo valor em real");
        Double numero2 = entrada.nextDouble();
        
        //Calcular os valores ainda em real.
        Double soma = numero1 + numero2;
        
        //Imprimir o resultado da soma.
        System.out.println("O Resultado é R$" + soma + ", convertido para $" + soma * dolar);
    
    } //fim de main
} //fim de class
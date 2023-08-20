import java.util.Scanner;

/*
* Victor Manoel De Sousa Ferraz - TADS 2°SEMESTRE
* @author 202322160001@ifto.local
*/

//3.Faça um algoritmo em Java para calcular o salário de um funcionário e imprimi-lo, no console, com aumento de 15%.

public class Ex03 {

    public static void main(String[] args) {

    //Faça um objeto Scanner que leia a entrada do usuário.
    Scanner entrada = new Scanner(System.in);

    //Solicitar ao usuário o valor do salario.
    System.out.println("Insira o valor do salário:");
    Double salario = entrada.nextDouble();

    //Calcular o salário do usuário com aumento de 15%.
    Double porcentagem = salario + (salario * 0.15);

    //Imprimir o salário do usuário com um aumento de 15%.
    System.out.println("Seu salário, com aumento de 15%, fica: " + porcentagem);
    
  } // fim de main
} // fim de class
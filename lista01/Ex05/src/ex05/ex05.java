import java.util.Scanner;

/*
* Victor Manoel De Sousa Ferraz - TADS 2°SEMESTRE
* @author 202322160001@ifto.local
*/

// 5.Uma imobiliária de Araguaína vende apenas terrenos retangulares. Faça um algoritmo em Java para ler as dimensões e depois exibir o resultado, no console, da área do terreno, lembrando que a fórmula para calcular a área é: A = b * h
// Onde, b é a base do terreno e h é a altura do terreno.

public class ex05 {

  public static void main(String[] args) {

    //Criar um objeto Scanner que leia a entrada do usuário.
    Scanner entrada = new Scanner(System.in);

    //Solicitar ao usuário o valor da base do terreno.
    System.out.println("Insira o valor da base do terreno:");
    Double base = entrada.nextDouble();
    
    //Solicitar ao usuário o valor da altura do terreno.
    System.out.println("Insira o valor da altura do terrno:");
    Double altura = entrada.nextDouble();
    
    //Realizar a soma da área, cuja formula é A= b * h.
    Double area = base * altura;
    
    //Imprimir o resultado para o usuário.
    System.out.println("O valor da área do terrno, cuja soma é A= b * h é " + area);
  }
}
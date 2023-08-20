/*Victor Manoel De Sousa Ferraz - TADS 2°SEMESTRE
* @author 202322160001@ifto.local
  Faça um algoritmo em Java que implementa uma função chamada calculaFuncao que recebe como parâmetro de entrada um valor inteiro x e imprime, no navegador, o resultado da expressão x² + 4x + 2.*/
import java.util.Scanner;

public class Ex05 {
  public static void main (String[] args) {

    //Ler entrada do usuario.
    Scanner entrada = new Scanner(System.in);
    //Solicitar o valor de X.
    System.out.println("Insira o valor de X");
    int X = entrada.nextInt();
    
    //Calcular o resultado.
    int resultado = X * X + 4 * X + 2;
    
    //Imprimir o resultado.
    System.out.println("O resultado da expresão x² + 4x + 2 é: " + resultado);
  }
}
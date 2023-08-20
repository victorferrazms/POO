import java.util.Scanner;

/* Faça um algoritmo em Java para calcular quantas ferraduras são
necessárias para equipar todos os cavalos comprados para um haras
da cidade de Araguaína. O usuário entrará com a quantidade total de
cavalos que tem no haras.*/

public class ex06 {

    public static void main (String[] args) {
    
    //Criar um objeto Scanner que leia a entrada do usuario.
    Scanner entrada = new Scanner(System.in);
    
    //Solicitar ao usuario a quantidade de cavalos que tem no haras.
    System.out.println("Insira a quantidade de cavlos que tem no haras:");
    Double cavalos = entrada.nextDouble();
    
    /*Realizar o calculo de quantas ferraduras são necessárias para equipar 
    todos os cavlos do haras (levando em conta que cada cavalo tem 4 patas). */
    Double ferraduras = cavalos * 4;
            
    //Imprimir o resultado na tela do usuario.
    System.out.println("Para equipar os " + cavalos + " do haras, será necesserio a quantidade de " + ferraduras + " ferraduras.");
    }//Fim de main
}//Fim de class       
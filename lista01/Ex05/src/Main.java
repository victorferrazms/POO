import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    //Criar um objeto Scanner que leia a entrada do usuário.
    Scanner entrada = new Scanner(System.in);

    //Solicitar ao usuário o valor da base do terreno.
    System.out.println("Insira o valor da base do terreno:");
    Double base = entrada.nextDouble();

    //Solicitar ao usuário o valor da altura do terreno.
    System.out.println("Insira o valor da altura do terreno:");
    Double altura = entrada.nextDouble();

    //Realizar a soma da área, cuja formula é A= b * h.
    Double area = base * altura;

    //Imprimir o resultado para o usuário.
    System.out.println("O valor da área do terreno, cuja soma é A= b * h é " + area);
  }
}

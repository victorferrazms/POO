/*Victor Manoel De Sousa Ferraz - TADS 2°SEMESTRE
* @author 202322160001@ifto.local
* Faça um algoritmo em Java que implementa uma função de cadastro de funcionários chamada cadastroFuncional, esta função é responsável por cadastrar funcionários de uma empresa. A
função recebe como parâmetros de entrada o nome do funcionário, a idade e telefone de contato.
A Função escreve no navegador, como exemplo, a seguinte informação: */

import java.util.Scanner;

public class Ex06 {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o nome do funcionário: ");
    String nome = entrada.nextLine();

    System.out.println("Digite a idade do funcionário: ");
    int idade = entrada.nextInt();

    System.out.println("Digite o telefone do funcionário: ");
    String telefone = entrada.nextLine();

    System.out.println("Dados do funcionario: ");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Telefone: " + telefone);
  }
}
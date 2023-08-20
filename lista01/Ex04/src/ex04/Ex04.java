import java.util.Scanner;

/*
* Victor Manoel De Sousa Ferraz - TADS 2°SEMESTRE
* @author 202322160001@ifto.local
*/

//4.Faça um algoritmo em Java para calcular dois valores reais e exibir, o primeiro com acréscimo de 30%, e o segundo com desconto de 25%.

public class ex04 {

  public static void main(String[] args) {
    
        //Criar um objeto Scanner que leia a entrada do usuario.
        Scanner entrada = new Scanner(System.in);
        
        //Solicitar ao usuario o primeiro valor.
        System.out.println("Insira o primeiro valor:");
        Double numero1 = entrada.nextDouble();
        
        //Solicitar ao usuario o segundo valor.
        System.out.println("Insira o segundo valor");
        Double numero2 = entrada.nextDouble();
        
        //Calcular os dois valores.
        Double soma = numero1 + numero2;
        
        //Calcular o salário do usuário com aumento de 15%.
        Double porcentagem30 = soma + (soma * 0.30);
    
        //Calcular o salário do usuário com aumento de 15%.
        Double porcentagem25 = soma + (soma * 0.25);
        
        //Imprimir o resultado da soma.
        System.out.println("O Primeiro seultado com aumento de 30%, : " + porcentagem30 + " e o segundo com desconto de 25%, fica: " + porcentagem25);
    
    } //fim de main
} //fim de class
import java.util.Scanner;

/*
 * Victor Ferraz - TADS 2°SEMESTRE
 * @author 2023
 */

//1. Faça um algoritmo em Java para calcular um numero real e escreva, no navegador, o resultado do seu cubo, onde o cubo de um número é igual a potência do número elevado a 3.

public class Ex01 {

    public static void main(String[] args) {
        //Criar um objeto Scanner que leia a entrada do usuario.
        Scanner entrada = new Scanner(System.in);
        
        //Solicitar o usuario o numero.
        System.out.println("Insira um numero real:");
        Double numero = entrada.nextDouble();
        
        //Calcular o cubo do numero.
        Double cubo = Math.pow(numero, 3);
        
        //Imprimir o resultado do cubo.
        System.out.println("O cubo de " + numero + " é " + cubo);
    
    } //fim de main
} //fim de class

import java.util.Scanner;

/*Victor Manoel De Sousa Ferraz - TADS 2°SEMESTRE
* @author 202322160001@ifto.local
*Faça um algoritmo em Java para ler o nome e a idade de uma pessoa, e exibir quantos dias de
vida ela possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma
pessoa com 19 anos possui 6935 dias de vida; EXEMPLO: "MARIA, VOCÊ JÁ VIVEU 6935 DIAS" */

public class Ex02 {
    
    public static void main(String[] args) {
        
        //Ler entrada do usuario.
        Scanner entrada = new Scanner(System.in);
        
        //Solicitar o nome do usuario.
        System.out.println("Digite seu nome:");
        String nome =  entrada.nextLine();
        
        //Solicitar a idade do usuario.
        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();

        
        //Realizar a conversão de ano para dias.
        long dias = idade * 365;
        
        //Imprimir o resultado.
        System.out.println(nome + ", você já viveu " + dias + " dias.");
    }
}
import java.util.Scanner;

/*Victor Manoel De Sousa Ferraz - TADS 2°SEMESTRE
* @author 202322160001@ifto.local
*Uma padaria de Araguaína vende uma certa quantidade de pães franceses e uma quantidade de
broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono
quer saber quanto arrecadou com a venda dos pães e broas(juntos), e quanto deve guardar em
uma poupança (10% do arrecadado). Você foi contratado para construir um sistema para fazer os
cálculos para o dono. Com base nestes fatos, faça um algoritmo em Java para ler as quantidades
de pães e de broas, e depois calcular os dados solicitados.*/
public class Ex01 {
    
    public static void main(String[] args) {

        //Ler a entrada do usuario.
        Scanner entrada = new Scanner(System.in);
        
        //Solicitar ao usuario a quantidade de pães vendidos.
        System.out.println("Insira a quantidade de pães vendidos:");
        Double valorPão = entrada.nextDouble();
        
        //Solicitar ao usuario a quantidade de broas vendidos.
        System.out.println("Insira a quantidade de broas vendidos");
        Double valorBroa = entrada.nextDouble();
        
        //Calcular o valor arrecadado de pães ao final do dia.
        Double quantidadeX = valorPão * 0.12;
        
        //Calcular o valor arrecadado de broas ao final do dia.
        Double quantidadeY = valorBroa * 1.50;

        //Calcular o valor total de ambos.
        Double total = quantidadeX + quantidadeY;
        
        //Calcular a porcentagem que deverá ser guardada na poupança.
        Double porcentagem = 0.10 * total;
  
        //Imprimir o resultado
        System.out.println("O valor total arrecado com a venda de pães e broas no dia foi" + total + "portanto, você deverá guardar " + porcentagem + ", correspondente a 10%, na poupança.");
  
    } // Fim de class   
} // Fim de Main
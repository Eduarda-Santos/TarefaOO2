import java.util.Scanner;

public class NPositivos{

    public static void main(String[] args){
        int n = 0, aux = 0, i, maior = 0, menor = 0, soma = 0, sub = 0, acres = 0;
        Scanner scan;

        scan = new Scanner(System.in);

        while(n != -1){
            System.out.println("Digite um num:");
            n = scan.nextInt();
                
            if(n < 100){
                if(n > aux){
                    maior = n;
                }
                if(aux > n){
                    menor = n;
                }
                soma = soma + n;
                sub = maior - n;
                acres = menor + n;
                if(n != -1){
                    aux = n;
                }
            }  
            else{
            System.out.println("Tente novamente");
            System.exit(0);
            }  
        }
    System.out.println("Maior número digitado: "+maior);
    System.out.println("Menor número digitado: "+menor);
    System.out.println("Soma de todos os números digitados: "+soma);
    System.out.println("Cada número digitado subtraído pelo maior: "+sub);
    System.out.println("Cada número digitado acrescido pelo menor: "+acres);
    }
}
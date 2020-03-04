import java.util.Scanner;

public class NPositivos{

    public static void main(String[] args){
        int n = new int[], num = 0, aux = 0, i, maior = 0, menor = 0, soma = 0, sub, acres, dif, media;
        Scanner scan;

        scan = new Scanner(System.in);

        while(num != -1){
            if(num < 100){
                for(i = 0; i < 100; i++){
                    System.out.println("Digite um num:");
                    num = n[i];
                    n[i] = scan.nextInt();
                
                    if(n[i] > n[i+1]){
                        maior = n[i];
                    }
        
                    if(n[i+1] > n[i]){
                        menor = n[i];
                    }

                    soma = soma + num;
                    sub = maior - num;
                    acres = menor + num;
                    media = soma / i;
                    dif = num - media;

                    System.out.println("Maior número digitado: "+maior);
                    System.out.println("Menor número digitado: "+menor);
                    System.out.println("Soma de todos os números digitados: "+soma);
                    System.out.println("Cada número digitado subtraído pelo maior: "+sub);
                    System.out.println("Cada número digitado acrescido pelo menor: "+acres);
                    System.out.println("Diferença do número digitado e a media: "+dif);
                }
            }
            else{
            System.out.println("Tente novamente");
            System.exit(0);
            }  
        }
    }
}
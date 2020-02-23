public class Numeros{

    public static void main(String[] args){
        int num, cont = 0, i, aux;

        System.out.println("Números divididos por 11 com resto 5:");
        for(num = 1; num < 2500; num++){
           if(num%11 == 5){
                System.out.println(" "+num);
            }
        }
        System.out.println("Números pares:");
        for(num = 1; num < 2500; num++){
            if(num%2 == 0){
                System.out.println(" "+num);
            }
        }
        System.out.println("Números ímpares:");
        for(num = 1; num < 2500; num++){
            if(num%2 == 1){
                System.out.println(" "+num);
            }
        }
        System.out.println("Números primos:");
        for(num = 1; num < 2500; num++){
           for(i = 1; i < 20; i++){
               aux = num % i;
               if(aux == 0){
                    cont++;
                } 
                if(cont == 2){
                    System.out.println(" "+num);
                }
            } 
        }
    }
}
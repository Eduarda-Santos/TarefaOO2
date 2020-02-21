public class Numeros{

    public static void main(String[] args){
        int num, cont = 0;

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
            if(num%2 == 0){
                cont++;
            }
            else if (num%3 == 0){
                cont++;
            }
            else if(num%5 == 0){
                cont++;
            }
            else if(num%7 == 0){
                cont++;
            }
            else if(num%11 == 0){
                cont++;
            }
            else if(num%13 == 0){
                cont++;
            }
            if(cont == 1){
                System.out.println(" "+num);
            }
        }
    }
}
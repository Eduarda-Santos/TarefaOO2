public class Numeros{

    public static void main(String[] args){
        int num;

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
    }
}
public class Triangulo{
    
    public static void main(String[] args){

        int a = 5, b = 2, c = 3;

        if(a == b && b == c){
            System.out.println("Triângulo equilátero");
        }
        if(a == b || b == c || c == a){
            System.out.println("Triângulo isóceles");
        }
        else{
            System.out.println("Triângulo escaleno");
        }
    }
}

 
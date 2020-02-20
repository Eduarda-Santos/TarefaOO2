public class NPositivos{

    public static void main(String[] args){
        int n = 0, aux, i;
        Scanner scan = new Scanner(System.in);

        while(n != -1){
            Sytem.out.println("Digite um num:");
            n = scan.nextInt();
            
            if(n > aux){
                System.out.println(" "+n);
            }
            
        }
    }
}
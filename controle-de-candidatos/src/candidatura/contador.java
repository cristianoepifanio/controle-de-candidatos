package candidatura;
import java.util.Scanner; 
public class contador {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("entre com um numero inteiro");
        int num1 =  sc.nextInt();
        System.out.println("entre com outro numero inteiro");
        int num2 =  sc.nextInt();

        try {
            contar(num1, num2);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
    static void contar(int num1,int num2) throws parametrosInvalidos {
        int contar = num2-num1;
        
    }
}

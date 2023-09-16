package candidatura;
import java.util.Scanner; 
public class contador {
    public static void main(String[] args) {
        contar();
        
        
    }
    static void contar()  /* throws  parametrosInvalidos */{
        Scanner sc = new Scanner(System.in);
        System.out.println("entre com um numero inteiro");
        int num1 =  sc.nextInt();
        System.out.println("entre com outro numero inteiro");
        int num2 =  sc.nextInt();
        sc.close();
        int contagem = num2-num1;
        for (int i = 0; i <=contagem; i++) {
            System.out.println(i+"° ocorrencia.");
            
        }
       
    }
}

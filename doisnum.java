import java.util.Scanner;

public class doisnum {
    public static void main(String[] args) {
       int soma,subtracao,mult,n1,n2;
       
       Scanner scn = new Scanner(System.in);
       
       System.out.println("escreva o primeiro numero");
        n1 = scn.nextInt();

        System.out.println("escreva o segundo numero:");
        n2 = scn.nextInt();
        
       
        soma = n1+n2;
       
        subtracao = n1-n2;
       
        mult = n1*n2;

       
        System.out.println("a soma é:"+ soma); 
       
        System.out.println("a subtração é:"+ subtracao);
       
        System.out.println("a multiplicação é:"+ mult);
    
    }
}

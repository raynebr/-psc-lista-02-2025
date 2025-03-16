import java.util.Scanner;

public class viagem {
        public static void main(String[] args) {
        
        double n1,n2,n3,n4,n5,n6,res1,res2,res3,res4;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas irão para Portugal? ");
        n1 = scan.nextDouble();

        System.out.println("Qual o valor que cada pessoa gastou para ir para portugal? ");
        n2 = scan.nextDouble();

        res1 = n1*n2;

        System.out.println("Quantas pessoas irão para italia? ");
        n3 = scan.nextDouble();

        System.out.println("Qual o valor que cada pessoa gastou para ir para italia? ");
        n4 = scan.nextDouble();

        res2 = n3*n4;

        System.out.println("Quantas pessoas irão para alemanha? ");
        n5 = scan.nextDouble();

        System.out.println("Qual o valor que cada pessoa gastou para ir para alemanha? ");
        n6 = scan.nextDouble();

        res3 = n5*n6;

        res4 = res1+res2+res3;

        System.out.println("O valor total de todas as viagens é "+ res4);


    }
}

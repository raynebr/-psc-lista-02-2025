import java.util.Scanner;

public class bombadegasolina {
    public static void main(String[] args) {
       
        double n1,n2,total;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("preço da gasolina:");
        n1 = scan.nextDouble();

        System.out.println("litros abastecidos:");
        n2 = scan.nextDouble();

        total = n1*n2;

        System.out.println("total a pagar:"+ total);
    }
        
}

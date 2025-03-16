import java.util.Scanner;

public class notasbim {
    public static void main(String[] args) {
        double n1,n2,n3,n4,res;

        Scanner scn = new Scanner(System.in);

        System.out.println("nota 1° bimestre:");
        n1 = scn.nextInt();

        System.out.println("nota 2° bimestre:");
        n2 = scn.nextInt();
        
        System.out.println("nota 3° bimestre:");
        n3 = scn.nextInt();

        System.out.println("nota 4° bimestre:");
        n4 = scn.nextInt();

        res = (n1+n2+n3+n4)/4;

        
        System.out.println("a media das notas é:"+ res);

    }
}

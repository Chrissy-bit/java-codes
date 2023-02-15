import java.util.Scanner;

public class interest{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double p,r,t;

        System.out.print("Enter principal amt: ");
        p=obj.nextDouble();

        System.out.print("Enter rate of interest: ");
        r=obj.nextDouble();

        System.out.print("Enter time period in years: ");
        t=obj.nextDouble();

        double amt=p*(r/100)*t;

        System.out.println("\nFuture amt= "+amt+"for Principle= "+p+",Rate="+r+"%,Time Period="+t+" years");
    }
}

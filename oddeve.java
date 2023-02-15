import java.util.Scanner;

public class oddeve{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = obj.nextInt();

        if(num%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }

}
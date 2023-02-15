import java.util.Scanner;

public class swap{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter value of 1st num: ");
        num1 = obj.nextInt();
        System.out.print("Enter value of 2nd num: ");
        num2 = obj.nextInt();
        System.out.println("\nBefore swapping:\n1st num="+num1+"\t2nd num="+num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\nAfter swapping:\n1st num="+num1+"\t2nd num="+num2);
    }

}
import java.util.Scanner;

public class calci{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int num1, num2;

        System.out.print("Calculator\nEnter 1st number: ");
        num1 = obj.nextInt();

        System.out.print("Enter 2nd number: ");
        num2 = obj.nextInt();

        int choice = 0;
        while (choice <= 5) {
            System.out.println("\nSelect an operator:\n1. Add (+)\n2. Subtract (-)\n3. Multiply (*)\n4. Divide (/)\n5. Exit");
            choice = obj.nextInt();

            if (choice == 1)
                System.out.println(num1+"+"+num2+"="+(num1+num2));
            else if (choice == 2)
                System.out.println(num2+"-"+num1+"="+(num2-num1));
            else if (choice == 3)
                System.out.println(num1+"*"+num2+"="+(num1*num2));
            else if (choice == 4)
                System.out.println(num2+"/"+num1+"="+(num2/num1));
            else if(choice == 5) {
                System.out.println("Thankyou!");
                break;
            }
            else
                System.out.println("Invalid!");
        }
    }
}

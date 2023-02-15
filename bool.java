import java.util.Scanner;

public class bool {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
         boolean b1, b2, b3;
         System.out.print("Enter 1st boolean value: ");
         b1 = obj.nextBoolean();
         
         System.out.print("Enter 2nd boolean value: ");
         b2 = obj.nextBoolean();

         System.out.print("Enter 3rd boolean value: ");
         b3 = obj.nextBoolean();
         
         int counter=0;

         if(b1==true)
         counter++;

         if(b2==true)
         counter++;

         if(b3==true)
         counter++;

         if(counter==2)
         System.out.println("\n2 out of 3 bool values are true!");
         else
         System.out.println("\n2 out of 3 bool values are NOT true!");
     }
}


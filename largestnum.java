import java.util.Scanner;
public class largestnum{
    public static void main(String[] args)   {
        Scanner obj = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Enter value of 1st num: ");
        a= obj.nextInt();
        System.out.print("Enter value of 2nd num: ");
        b = obj.nextInt();
        System.out.print("Enter value of 3rd num: ");
        c = obj.nextInt();

        
       if(a>=b && a>=c)  
       System.out.println(a+" is the largest Number");  

       else if (b>=a && b>=c)  
       System.out.println(b+" is the largest Number");  
       else  
       System.out.println(c+" is the largest number");  

}


}  

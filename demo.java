/* 1) method basic

public class demo{
    static void method(){
        System.out.println("hello this is a method demo");
        }
            public static void main(String[] args){
                method();
                method();
    }
}
    
    
  2) Simple addition of methods
   public class demo{
    static int method(int x){
    return 5+x;
   }
   public static void main(String[] args){
    System.out.println(method(6));
      }
    }
       


 3) Simple addition

      import java.util.Scanner;
 public class demo{
    public static void main(String[] args){
       
        
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter num1: ");
       int n1=obj.nextInt();

        System.out.println("Enter num 2");
        int n2 =obj.nextInt();

         int sum=n1+n2;
        System.out.println("sum is "+sum);


    }
 }
    
 
4) Smallest number in array 

 class Num {
    static int arr[]={24,12,5,87,27,50};
    static int smallest()
    {
        int i;
        int min=arr[0];
        for (i = 1; i < arr.length; i++)
        
        if (arr[i] < min)
            min= arr[i];
            return min ;
    }
 }
 public class demo{
    public static void main(String[] args)
        {
            Num sc=new Num();
            System.out.println("second smallest num is "+Num.smallest());
        }
    }
 


 5) EXAM-Java program to print helo n times then term after 5
import java.util.*;
public class demo{
public static void main(String[] args){

    Scanner obj=new Scanner(System.in);
    System.out.println("Enter how many times");
    int n=obj.nextInt();

    for (int i=0;i<5;i++){
    System.out.println("Hello");

    }
    }
}

 6)CLASS AND METHODS PLAY

import java.util.*;

public class demo{
    public void fullthrottle(){
        System.out.println("car is going as fast as it can");
    }
    public void speed(int maxspeed){
        System.out.println("Max speed is: " + maxspeed);
   
}

public static void main(String[]args){
    demo mycar=new demo();
    mycar.fullthrottle();
    mycar.speed(400);
}
}




7)EXAM-Second smallest num in array(Classes and objects)

import java.util.*;
class smol{
    static int arr[]={24,12,56,8,5};
    static int op()
{
    
    Arrays.sort(arr);
    return arr[1];
}
}
public class demo{
    public static void main(String[] args){
    System.out.println("second smallest no. is" +smol.op());
}
}

8) Smallest no alt

import java.util.*;
class smol{
    static int arr[]={24,12,56,8,5};
    static int op()
{
    
    Arrays.sort(arr);
    return arr[0];
}
}
public class demo{
    public static void main(String[] args){
    System.out.println("second smallest no. is" +smol.op());
}
}



    9) Largest num in array

class Num{
    static int arr[]={10,20,30,80,12,42};
    static int largest()
  
    {
        int i;
        int max=arr[0];

        for (i = 1; i < arr.length; i++)
        if (arr[i] > max)
            max = arr[i];
            return max;
        }
    }
    public class Largestnum
    {
     
        public static void main(String[] args)
        {
            Num sc=new Num();
            System.out.println("Largest in given array is "
                               + Num.largest());
        }
    }

10)Largest number  alt
import java.util.*;
class smol{
    static int arr[]={24,12,56,8,5};
    static int op()
{
    
    Arrays.sort(arr);
    return arr[4];
}
}
public class demo{
    public static void main(String[] args){
    System.out.println("second smallest no. is" +smol.op());
}
}


11) EXAM-rectangle
import java.util.*;
class rec{
    int length=15;
    int breadth=20;
    int area=(length*breadth); 

    void mymeth(){
     
    System.out.println("the area is " +area);
    }
}
    
       public class demo{
        public static void main(String[]args){
            rec obj=new rec();
            obj.mymeth();
       }
   
    }


     


 
12)a)EXAM- BOX
 import java.util.*;
 class Box{
    double height;
    double width;
    double depth;
    double vol;
 }
 public class demo{
 public static void main(String[]args) {
    Box obj=new Box();
    
    obj.width=10;
    obj.height=15;
    obj.depth=20;
    vol=mybox.width*mybox.height*mybox.depth;
    System.out.println("Volume is"+vol);
 }

 }

  b)Box with methods

  import java.util.*;
  class Box{
     double height;
     double width;
     double depth;
     double vol;

     void vol(){
        System.out.println(width*height*depth);
     }
  }
  public class demo{
  public static void main(String[]args) {
     Box obj=new Box();
     
     obj.width=10;
     obj.height=15;
     obj.depth=20;
     
     obj.vol();
  }
 
  }
 
c)EXAM-Rectangle with method
  import java.util.*;
  class Rectangle{
    double length;
    double breadth;
    double area;

    void area(){
        System.out.println(length*breadth);
    }
  }
  public class demo{
    public static void main(String[]args){
        Rectangle obj=new Rectangle();
        obj.length=15;
        obj.breadth=20;
        obj.area();
    }
  }
 


  13)EXAM-factorial
import java.util.*;
public class demo
{
     public static void main(String []args)
     {
        //Take input from the user
        //Create an instance of the Scanner Class
        Scanner obj=new Scanner(System.in);
        //Declare and Initialize the variable
        System.out.println("Enter the number: ");
        int num=obj.nextInt();

        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of the number: "+fact); 
     }  
}

 14) EXAM-GRADE AND AVG
import java.util.Scanner;
public class demo{

    public static void main(String args[])
    {

        Scanner obj= new Scanner(System.in);
        
        int sum=0,marks;
        int avg;
        char grade;

        System.out.println("Input marks ");
        for(int i=0;i<3;i++){
            System.out.println("Enter marks of the 3 subjects "+(i+1)+"");
            marks=obj.nextInt();
            sum+=marks;
           

        }
        avg=sum/3;
        System.out.println("Total marks is:  "+sum+"\n Average marks: "+avg);

        
        if(avg>=80){
            grade = 'A';
         }else if(avg>=60 && avg<80){
            grade = 'B';
         }
         else if(avg>=40 && avg<60){
            grade = 'C';
         }
         else {
            grade = 'D';
         }
         System.out.println("Grade="+grade);
    }
   
}

15) CALCI
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


16)Swapping num
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
 17)EXAM-even or odd
 import java.util.Scanner;

public class OddorEven{
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


18)Largest num user input
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


19)BOOL
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


20)
import java.util.Scanner;
public class vowel{

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        char ch;
        System.out.print("Enter 1st alphabet: ");
        ch = obj.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}


21)Interest
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



import java.util.*;
class num{
   static int arr[] = {10, 20, 25, 63, 96, 57};
     static int size = arr.length;
      
      
      static int rev(){
       
       Arrays.sort(arr);
       int res= arr[size-2];
       return res;
      }
}
public class demo{
   public static void main(String args[]){
   
      
      System.out.println("2nd largest element is ::"+num.rev());
   }
}


*/

import java.util.*;
class Num{
    static int arr[]={15,2,56,80,64};
    static int smallest()
    {
        int i;
        int max=arr[0];
        for(i=0;i<arr.length;i++)
        if(arr[i]>max)
        max=arr[i];
        int index=i;
        return index;
    }
}
public class demo{
    public static void main(String[]args){
        Num obj=new Num();
        System.out.println("index of largest num is:"+Num.smallest());
}
}
/*PRACT 3.2
Q1)A class ‘Tellcall’ calculates the monthly phone bill of a consumer. Some of the members of the class are given below:

Class Name                                       : TelCall
Data Members/instance variables     : 
phno                                                  : Phone Number
name                                            : Name of consumer
n                                                   : number of calls made (integer)
amt                                               : Bill amount
Member functions/methods:
Tellcall(String x, String y, int k)  : Parameterized constructor to assign values to data   
                                                    members.
void compute()                          : To calculate the phone bill amount based on the slab 
                                                    given below.
Number of Calls                        : Rate
1-100                                         : Rs 500 rental charge only
101-200                                     : Rs 1.00 per call + rental charge
201-300                                    : Rs 1.20 per call + rental charge
above 300                                 : Rs 1.50 per call + rental charge
void display()                          : To display the details in the specified format.

Specify the class TellCall, giving the details of the constructors, void compute() and void display()c
In the main function, create and object of type telcall and display the phone bill in the following format : 

Phone number            Name         Total Calls                Amount
xxxxxxxxxx               xxxxx          xxx                           xxxxx 

*/
import java.io.*;
import java.text.DecimalFormat;

public class TelCall {
 String phno;
 String name;
 int n;
 double amt;

 TelCall(String x, String y, int k){
 phno = x;
 name = y;
 n = k;
 }

 void compute(){
 if(n>1 && n<=100)
 amt = 500;
 else if(n>100 && n<=200)
 amt = 500 + (n);
 else if(n>200 && n<=300)
 amt = 500 + (1.2*n);
 else
 amt = 500 + (1.5*n);
 }

 void display() {
 System.out.println("Phone number\tName\t\tTotal Calls\t\tAmount");
 System.out.println(phno + "\t\t" + name + "\t\t\t" + n +
"\t\t\t" + amt); 
}

public static void main(String[] args) throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);

BufferedReader br = new BufferedReader(isr);

System.out.println(">>>Input Details<<<");
System.out.print("Enter phone number: ");
String p = br.readLine();
System.out.print("Enter Name: ");
String n = br.readLine();
System.out.print("Enter total calls: ");
int c = Integer.parseInt(br.readLine());
TelCall ob = new TelCall(p,n,c);
ob.compute();
System.out.println("\n\n>>>Customer Details<<<");
ob.display();
}
}





/* 
Q2)Prime Factor of  a number are those factors which are prime in nature and by which the number itself is completely divisible ( 1 will not be taken as prime numbers).
e.g.,
                                                       : Prime factors of 24 are 2, 2, 2,3
                                                       : Prime factors of 6 are 2, 3
A class Prime_factors is declared with the following details:
*/




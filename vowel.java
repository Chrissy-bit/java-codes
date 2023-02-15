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
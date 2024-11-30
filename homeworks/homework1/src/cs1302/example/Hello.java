package cs1302.example;
import cs1302.utility.MyMethods;
import java.util.Scanner;
public class Hello{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int a,b;
	System.out.println("Please input a number");
	a = scan.nextInt();
	System.out.println("Please input another number");
	b = scan.nextInt();
	System.out.println("The greater of the 2 numbers is: " + MyMethods.greater(a, b));
    }
}

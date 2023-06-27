//write a java program that takes two number as input and display the product of two numbers
package task;
import java.util.Scanner;
public class Userinput {

	public static void main(String[] args) {
	   int a,b,mul;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter two numbers");
	   
	   a = sc.nextInt();
	   b = sc.nextInt();
	   mul = a * b;
	   
	   System.out.println(+a+ "x" +b+ "=" + mul);
	   sc.close();
	}

}

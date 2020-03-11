import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		/*
		Write a program which reads a number from the standard input
		and checks if the number is positive or negative.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("n= "+n);
		
		if(n > 0){
		    System.out.println("Positive");
		}
		else if(n < 0){
		    System.out.println("Negative");
		}
		else{
		    System.out.println("Zero");
		}
		
	}
}

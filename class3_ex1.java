import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		/*
		Write a program which reads a number from the standard input
		and displays the word YES if the number is even and NO if it is odd.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("n= "+n);
		
		if(n%2 == 0){ //is the remainder 0?
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
		
	}
}

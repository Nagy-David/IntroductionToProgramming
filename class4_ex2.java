import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		//Read a number (integer) from the standard input.
		//If the number is divisible by 2 but not by 4, then display 
		//"YES" and "NO" otherwise.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if(n%2 == 0 && n%4 != 0){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
		
	}
}

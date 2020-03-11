import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		//Read a number from the standard input.
		//Display YES if the number is divisible by 5 or 6 and by 2. 
		
		//For example: 10, 12, 20, 24, etc.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
        		int n = sc.nextInt();
        		//the brackets are mandatory because the && operator 
        		//is "stronger" than the || operator.
		if((n%5 == 0 || n%6 == 0) && n%2==0){ 
            		System.out.println("YES");
        	}        
        	else {
            		System.out.println("NO");
        	}      
		
	}
}

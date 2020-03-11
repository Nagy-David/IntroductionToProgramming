import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		//Read a number from the standard input.
		//Display the corresponding grade according to the following table:
		/*
		Points      Grade
		0-50        1
		51-70       2
		71-80       3
		81-90       4
		91-100      5
		otherwise   Not a valid grade
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
        		int p = sc.nextInt();
		
		if(p >= 0 &&  p<= 50){
		    System.out.println("1");
		}
		else if(p >= 51 && p <= 70){
		    System.out.println("2");
		}
		else if(p >= 71 && p <= 80){
		    System.out.println("3");
		}
		else if(p >= 81 && p <= 90 ){
		    System.out.println("4");
		}
		else if(p >= 91 && p <= 100 ){
		    System.out.println("5");
		}
		else{
		    System.out.println("Not a valid grade!");
		}
		
	}
}

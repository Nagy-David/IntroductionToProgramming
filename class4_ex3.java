import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		//Read a number, that represents a year, from the standard input.
		//Display YES if the year is a leap year and NO otherwise.
		
		//A year is a leap year if it is divisible by 4 but not by 100
		//or it is divisble by 400.
		
		//the year 1600: YES (divisible by 400)
		//the year 1900: NO (divisible by 100)
		//the year 2020: YES (divisible by 4 and not divisible by 100)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
       		 int y = sc.nextInt();
       		 if(y%4 == 0 && y%100!= 0 || y%400 == 0){
           	 	System.out.println("YES");
        	 }        
       		 else {
            		System.out.println("NO");
        	 }      
		
	}
}

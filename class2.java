import java.util.Scanner; //we need to import the Scanner

public class Main
{
	public static void main(String[] args) {
        int x = 5;
        System.out.println("x: "+x); //the value of x will be appended after the text
        int y = 7;
        System.out.println("y: "+y);
        int addition = x + y; 
        System.out.println("x+y: "+addition);
        System.out.println("x-y: "+(x-y));
        System.out.println("x*y: "+(x*y));
        System.out.println("x/y: "+(x/y)); //integer / integer is integer
        System.out.println("x%y: "+(x%y)); //gives back the remainder
        
        //With the Scanner we can read information from the keyboard (standard input)
        //System.in means that the Scanner will read from the keyboard
        //the name of the Scanner is sc.
        Scanner sc = new Scanner(System.in);
        //here we read a number (integer number)
        System.out.println("Enter a number: ");
        int a = sc.nextInt(); 
        System.out.println("a: "+a);
        
        
	}
}

import java.util.Scanner;
import java.util.Random;
public class mainscreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    String input;
	    
	    System.out.println("This program will either generate a random username or a random 4-digit passcode"); 
	    System.out.println("Enter if you want a username or a passcode"); 
	    input = sc.nextLine();   
	       if(input.equals("username")) {
	    	   username();
	       } else if (input.equals("passcode")) {
	    	   passcode();
	       }
       
	
	    
  sc.close();
  
  
	}

public static void username() {

}
public static void passcode() {
	
}
}

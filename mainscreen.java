import java.util.Scanner;
import java.util.Random;
public class mainscreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is a comment
		Scanner sc = new Scanner(System.in);
	    String input;
		System.out.println("hello world"); 

	    System.out.println("This program will either generate a random username or a random 4-digit passcode"); 
	    System.out.println("Enter if you want a username or a passcode"); 
	    input = sc.nextLine();   
	       if(input.equals("username")) {
	    	   username(8);
	       } else if (input.equals("passcode")) {
	    	   passcode();
	       }
	
	    
  sc.close();
  
  
	}

public static void username(int len) {
	String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
	          +"lmnopqrstuvwxyz";
			Random rnd = new Random();
			StringBuilder sb = new StringBuilder(len);
			for (int i = 0; i < len; i++)
				sb.append(chars.charAt(rnd.nextInt(chars.length())));
System.out.println(sb.toString());
}
public static void passcode() {

	String val = ""+((int)(Math.random()*9000)+1000);
	System.out.println("your passcode is" + " "+ val);

	
}
}

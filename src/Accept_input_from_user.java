import java.util.Scanner;

public class Accept_input_from_user {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		//get 1st no.from user
		
		System.out.println("Ley user enter first number");
		
		  int num1=s.nextInt();
		//get 2nd no.from user
		  
		  System.out.println("Ley user enter 2nd noumber");
		  
		  int num2=s.nextInt();
		  //Addition
		  System.out.println(num1+num2);
	}

}

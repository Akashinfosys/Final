import java.util.Scanner;

public class Accept_string_from_user {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		//get name from user
		System.out.println("Ley user enter name");
		
		String name=s.next();
		
		System.out.println(name);
	}

}

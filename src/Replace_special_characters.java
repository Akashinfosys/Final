import java.util.Scanner;

public class Replace_special_characters {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Ley user enter name with special characters");
		
		String name=s.next();
		
		String correctname=name.replace("@","A");
		
		System.out.println(correctname);
		
	}

}

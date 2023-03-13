import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1=sc.nextLine();
		char ch[]=s1.toCharArray();
		String rev="";
		int len = s1.length();
		for (int i=len-1; i>=0;i--) {
			rev=rev+ch[i];
			
		}
		
		if(s1.equalsIgnoreCase(rev)) {
			System.out.println(s1+" is palindrome");
		}
		else
			
			System.out.println(s1+" is not a palindrome");
		System.out.println("Reverse string "+rev);
		System.out.println("Length of the string :"+len);
	}

}

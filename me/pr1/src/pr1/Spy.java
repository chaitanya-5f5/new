package pr1;
import java.util.*;
public class Spy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number n");
		n=sc.nextInt();
		boolean res=isspy(n);
		System.out.println("Is the number is spy "+ res);
	}
	private static boolean isspy(int n) {
		String str=Integer.toString(n);
		int s=0;
		int p=1;
		for(int i=0;i<str.length();i++) {
			int digit=Character.getNumericValue(str.charAt(i));
			s+=digit;
			p*=digit;
		}
		return s==p;
	}

}

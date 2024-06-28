import java.util.Scanner;
public class PR1 {
	public static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}else {
			return reverse(str.substring(1))+str.charAt(0);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String rev=reverse(str);
		System.out.println(rev);

	}

}

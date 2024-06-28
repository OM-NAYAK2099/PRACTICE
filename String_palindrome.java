import java.util.Scanner;
public class String_palindrome{
    public static boolean Ispalindrome(String str,int s, int e){
        if(s==e){
            return true;
        }if(str.charAt(s)!=str.charAt(e)){
            return false;
        }if(s<e+1){
            return Ispalindrome(str,s+1,e-1);
        }return true;
    }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
        if(Ispalindrome(str,0,str.length()-1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }  
}
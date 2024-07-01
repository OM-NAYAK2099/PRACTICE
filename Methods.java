import java.util.Scanner;
public class Methods{
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the String");
       String str=sc.nextLine();
       String str2=sc.nextLine();
       String s1=str.toLowerCase();
       String s2=str.toUpperCase();
       int num=sc.nextInt();
       String s3=str.substring(num);
       char ch= str.charAt(num);
       String s4=str.trim();
       StringBuilder s5=new StringBuilder(str);	        
       System.out.println(str);
       System.out.println(s1+" "+s2+" "+s3+" "+s4);        
       s5.append(str2); 
       System.out.println(s5);
		        
    }
}

import java.util.Scanner;
public class Insert{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter the Character to insert in given string");
        char ch=sc.next().charAt(0);
        System.out.println("Enter the index :");
        int num=sc.nextInt();
        StringBuilder string=new StringBuilder(str);
        string.setCharAt(num, ch);
        System.out.println(string); //Completed
        Str=str.replace(str.charAt(num),ch);
    }
}
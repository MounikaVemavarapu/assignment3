import java.util.Scanner;
public class revstring{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
String P=sc.nextLine();
String rev="";
for(int i=0;i<P.length();i++){
rev=P.charAt(i)+rev;
}
System.out.println(rev);
}
}

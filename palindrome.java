import java.util.Scanner;
public class revstring{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
String P=sc.nextLine();
P=P.tolowerCase();
String rev="";
for(int i=0;i<P.length();i++){
rev=P.charAt(i)+rev;
}
if(P.equals(rev)){
System.out.println("palindrome");
}
else{
System.out.println("not a palindrome");
}
}
}
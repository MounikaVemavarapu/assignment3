import java.util.Scanner;
public class consvowels{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
String P=sc.nextLine().toLowerCase();
int vowels=0; 
int consonants=0;
for(int i=0;i<P.length();i++){
char ch=P.charAt(i);
if(ch >='a' && ch <='z'){
if(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o' || ch =='u'){
 vowels++;
}
else{
 consonants++;
}
}
}
System.out.println("vowels:"+vowels);
System.out.println("consonants:"+consonants);
}
}
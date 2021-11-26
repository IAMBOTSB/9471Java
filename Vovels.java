import java.util.*;

public class Vovels{
public static void main(String[] args){
int i = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your String : ");
String any = sc.nextLine();
any = any.toLowerCase();
if(any.charAt(i)=='a' || any.charAt(i)=='e' || any.charAt(i)=='i' || any.charAt(i)=='o' || any.charAt(i)=='u'){
System.out.println("Vovels are Present");
}
else{
System.out.println("No Vovels Found");
}
}
}
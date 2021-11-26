import java.util.Scanner;

public class Scan{
public static void main(String[] args){
Scanner myObj = new Scanner(System.in);
System.out.println("Enter User Name");

String username = myObj.nextLine();
System.out.println("Username is: "+(username));
}
}
import java.util.Scanner;
public class Positivenegative{
public static void main(String[] args){
int a;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Number : ");
a = sc.nextInt();
if(a>0){
System.out.println("Number is Positive");
}
else if(a<0){
System.out.println("Number is Negative");
}
else{
System.out.println("Number is Zero");
}
}
}
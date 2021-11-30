import java.util.Scanner; 
public class Product{ 
public static void main(String[] args){
Scanner in = new Scanner(System.in);
   
System.out.print("First number: ");
int a = in.nextInt();
   
System.out.print("Second number: ");
int b = in.nextInt();
   
System.out.println(a + " x " + b + " = " + (a*b));
} 
}
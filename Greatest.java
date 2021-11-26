import java.util.Scanner;
public class Greatest{
public static void main(String[] args){
int a;
int b;
int c;
Scanner sc = new Scanner(System.in);

System.out.print("Enter the Number : ");
a = sc.nextInt();

System.out.print("Enter the Second Number : ");
b = sc.nextInt();

System.out.print("Enter the Third Number : ");
c = sc.nextInt();

if(a>b && a>c){
System.out.println("Greatest Number is : "+a);
}
else if(b>c && b>a){
System.out.println("Greatest Number is : "+b);
}
else if(b==c && b==a && a==c){
System.out.println("Numbers are Equal");
}
else if(b==c && b>a && c>a || b==a && b>c && a>c || a==c && a>b && c>b){
System.out.println("Two Numbers are Greater");
}
else{
System.out.println("Greatest Number is : "+c);
}
}
}
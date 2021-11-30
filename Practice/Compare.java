import java.util.*;

public class Compare{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter First No. : ");
int a = sc.nextInt();
System.out.println("Enter Second No. : ");
int b = sc.nextInt();

if(a>b){
System.out.println(a+"!="+b);
System.out.println(a+">"+b);
System.out.println(b+"<"+a);
}
if(b>a){
System.out.println(b+"!="+a);
System.out.println(b+">"+a);
System.out.println(a+"<"+b);
}
if(b==a){
System.out.println(b+"="+a);
}
}
}




import java.util.*;

public class Fibo{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter no of Iteration :");
int n = sc.nextInt();
int a = 0;
int b = 1;
int c = 1;
for(int i = 1;i <=n; i++){
System.out.println(a+", ");
a=b;b=c;c=a+b;
}
}
}
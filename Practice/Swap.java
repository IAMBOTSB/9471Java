public class Swap{
public static void main(String[] args){
int a = 10;
int b = 20;
b=b+a;
a=b-a;
b=b-a;
System.out.println("a is "+a+" and "+"b is "+b);
}
}
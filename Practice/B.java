class A{
public int a=40;
protected void msg(){System.out.println("Hey");
}
}
public class B{
public static void main(String[] args){
A obj=new A();
System.out.println(obj.a);
obj.msg();
}
}
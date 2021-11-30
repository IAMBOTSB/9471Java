class Poly{
void hey(){
System.out.println("How");
}
}
class A extends Poly{
void hey(){
System.out.println("What to do");
}
}
class B extends Poly{
void hey(){
System.out.println("Who are you");
}
}
class C extends Poly{
void hey(){
System.out.println("What are you");
}
}
class Main{
public static void main(String[] args){
Poly p;
p=new A();
p.hey();
p=new B();
p.hey();
p=new C();
p.hey();
}
}
public class Ttest{

static void methodA(short s){
System.out.println("methodA(short) called");
}
static void methodB(int i){
System.out.println("methodB(float) called");
}
static void methodB(double d){
System.out.println("methodB(double) called");
}

public static void main(String[] args){
methodA(5);
methodB(5.2);
}
}

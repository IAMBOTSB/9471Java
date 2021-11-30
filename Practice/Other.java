class Another{
void one(){
System.out.println("learning overiding......");
}
}
class Other extends Another{
public static void main(String args[]){
Other a = new Other();
a.one();
}
}
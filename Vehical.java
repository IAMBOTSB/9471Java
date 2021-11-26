class Vehicalb{
void Brand(){
System.out.println("Audi");
}
}

class Vehicalm extends Vehicalb{
void Model(){
System.out.println("A8");
}
}

class Vehicals extends Vehicalm{
void Series(){
System.out.println("A800234");
}
}

class Vehicals1 extends Vehicalm{
void Series1(){
System.out.println("1111");
}
}

class Vehical{
public static void main(String[] args){
System.out.println("Info");
Vehicals1 v=new Vehicals1();
v.Brand();
v.Model();
System.out.println("----------------");
v.Series1();
}
}


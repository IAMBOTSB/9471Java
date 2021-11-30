class Website{
int Webage;
String Webname;

Website(int Webage,String Webname){
this.Webage = Webage;
this.Webname = Webname;
}

void showdata(){System.out.println("Webage: "+(Webage)+",Webname: "+(Webname));
}
public static void main(String[] args){
Website w1=new Website(12,"Google");
Website w2=new Website(11,"Wix");
Website w3=new Website(10,"Facebook");
Website w4=new Website(9,"Gmail");
Website w5=new Website(8,"Youtube");


w1.showdata();
w2.showdata();
w3.showdata();
w4.showdata();
w5.showdata();
}
}
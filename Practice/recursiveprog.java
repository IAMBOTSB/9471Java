public class Recursiveprog{
    static void recc(String s, String ans){
        if(s.length()==0){
            System.out.println(ans+" ");
            return;
        }
        boolean count[]=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String res=s.substring(0,i)+s.substring(i+1);
            if(count[ch-'a']==false)
                recc(res, ans+ch);
            count[ch-'a']=true;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String n = s.nextLine();
        recc(n," ");
    }
}

public class Recursiveprog{
    static void recursive(String s,String ans){
        if(s.length()==0){
            System.out.println(ans+" ");
            return;
        }
        boolean alphacount[]=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String result=s.substring(0,i)+s.substring(i+1);
            if(alphacount[ch-'a']==false)
                recursive(result,ans+ch);
            alphacount[ch-'a']=true;
        }
    }
    public static void main(String[] args)
    {
        String n = "hello";
        recursive(n," ");
    }
}

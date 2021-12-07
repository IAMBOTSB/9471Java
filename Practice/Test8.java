import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Test8{

    public static void main(String[] args){
        String input = "Hello Welcome";
        String pattern = "\\sHello\\sWelcome\\s";
        boolean flag = Pattern.matches(pattern,input);
        System.out.println(flag);
    }
    }

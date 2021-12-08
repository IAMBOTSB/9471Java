import java.util.*;

class Array2{
    public static void main(String[] args){
        int my_array[] = {15,55,38,32,11};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("Sum = " + sum);
    }
}

import java.util.*;

class Array3 {
    public static void main(String[] args) {

        int[] a = new int[]{34,34,56,11,67};
        int sum = 0;
        for(int i=0; i < a.length ; i++)
            sum = sum + a[i];
        double average = sum / a.length;
        System.out.println("Average value = " + average);
    }
}

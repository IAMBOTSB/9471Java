import java.util.*;

public class Array{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter No of Arrays : ");
int n = sc.nextInt();

int[] array = new int[n];
System.out.println("Enter Elements of Array : ");
for(int i=0;i<n;i++){
array[i]=sc.nextInt();
}
System.out.println("Array Elements Are : ");
for(int i=0;i<n;i++){
System.out.println(array[i]);
}
}
}
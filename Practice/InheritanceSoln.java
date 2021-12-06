import java.io.*;
import java.util.*;
import java.lang.Math;


class cls1{
    void add(int p,int q)
    {
        System.out.println(p+q);
    }
}

class InheritanceSoln{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Times : ");
        int testcase = sc.nextInt();
        while(testcase-->0){
            cls2 obj = new cls2();
            System.out.println("Enter First No : ");
            int a = sc.nextInt();
            System.out.println("Enter Second No : ");
            int b = sc.nextInt();


            obj.add(a, b);
            obj.mul(a, b);
            obj.task(a, b);
        }
    }
}

class cls2 extends cls1 {

        void mul ( int p, int q){
            System.out.println(p * q);
        }
        void task ( int p, int q){
            System.out.println((p * p) + (q * q));
        }
    }

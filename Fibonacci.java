import java.util.*;

public class Fibonacci {
    public static void fibonacci(int num){
        int a=0,b=1;
        System.out.print(a+" ");
        for (int i=2;i<=num;i++){
            System.out.print(b+" ");
            int temp=b;
            b=a+b;
            a=temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        fibonacci(num);
    }
}

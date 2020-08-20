package threadDemo;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author liqiqi_tql
 * @date 2020/6/16 -17:45
 */
public class Fibonacci {
    public static int of(int n){
        if(n < 0){
            return -1;
        }else if(n == 0){
            return 0;
        }else if(n == 1 || n ==2){
            return 1;
        }else{
            return of(n - 1) + of(n - 2);
        }

    }

    public static void main(String[] args) {
        for (int i=1;i<=200;i++){
            System.out.println(Fibonacci.of(i));
        }


    }
}

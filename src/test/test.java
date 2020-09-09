package test;

import java.util.Date;
import java.util.Scanner;

/**
 * @author liqiqi_tql
 * @date 2020/8/20 -9:27
 */
public class test {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        System.out.println("读取的整数是"+w);
        String ws=s.next();
        switch (ws){
            case "ws":
                System.out.println("haha");
                break;
            case "wss":
                System.out.println("eee");
                break;
            case "ss":
                System.out.println("QWQ");
                break;
            default:
                System.out.println("www");
        }
        Date date=new Date();
        System.out.println(date);
        System.out.println("读取的字符串是"+ws);
    }
}

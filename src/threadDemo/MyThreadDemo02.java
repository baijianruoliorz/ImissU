package threadDemo;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2020/4/27 -15:35
 */
public class MyThreadDemo02 {
    public static void main(String[] args) {
        
        Main main = new Main();
        Thread thread = new Thread();//main.runnable;
        System.out.println("This is main");
        thread.start();
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e){
            System.out.println("in main");
            e.printStackTrace();
        }
        thread.interrupt();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("ss");
        strings.add("ssasd");
        strings.add("sadaa");
    }
    Runnable runnable=()->{
        int i=0;
        try{
            while(i<1000){
                Thread.sleep(500);
                System.out.println(i++);

            }
        }catch (InterruptedException e){
            System.out.println(Thread.currentThread().isAlive());

            System.out.println(Thread.currentThread().isInterrupted());
            System.out.println("in runable");
            e.printStackTrace();
        }
    };

}

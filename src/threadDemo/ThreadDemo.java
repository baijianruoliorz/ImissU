package threadDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//各种线程的启动方式，不用线程池的都不适合使用，应该使用线程池
/**
 * @author liqiqi_tql
 * @date 2020/6/6 -11:00
 */
public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("main start....");
//        Thread01 thread01=new Thread01();
//        thread01.start();


//        Runable01 runable01 = new Runable01();
//        new Thread(runable01).start();

        FutureTask<Integer> futureTask = new FutureTask<>(new Callable01());
        new Thread(futureTask).start();
        //等待整个线程执行完成，获取返回结果
        Integer integer = null;
        try {
            integer = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("main..end...");

        System.out.println("main end....."+integer);



     ThreadPoolExecutor threadPool= new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());

     threadPool.execute(new Runnable(){

         @Override
         public void run() {
             // TODO Auto-generated method stub
         System.out.println("任务1");
             }

         });
      //第一个参数10 表示这个线程池初始化了10个线程在里面工作
      //第二个参数15 表示如果10个线程不够用了，就会自动增加到最多15个线程
      //第三个参数60 结合第四个参数TimeUnit.SECONDS，表示经过60秒，多出来的线程还没有接到活儿，就会回收，最后保持池子里就10个
      //第四个参数TimeUnit.SECONDS 如上
      //第五个参数 new LinkedBlockingQueue() 用来放任务的集合
        //其实还有两个参数：线程创建工厂和handler:队列满了：安装指定的拒绝策略，拒绝执行任务
    }


public static class Thread01 extends Thread{
    @Override
    public void run() {
        System.out.println("当前线程"+Thread.currentThread().getId());
        int i=10/2;
        System.out.println("运行结果"+i);
    }
}
public static class Runable01 implements Runnable{

    @Override
    public void run() {
        System.out.println("当前线程"+Thread.currentThread().getId());
        int i=10/2;
        System.out.println("运行结果"+i);
    }
}
//1.5后实现的一种创造线程的方法
  public static class Callable01 implements Callable<Integer>{

    @Override       //该接口有返回值
    public Integer call() throws Exception {
        System.out.println("当前线程"+Thread.currentThread().getId());
        int i=10/2;
        System.out.println("运行结果"+i);
        return i;
    }
}

}

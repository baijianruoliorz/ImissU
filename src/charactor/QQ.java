package charactor;

/**
 * @author liqiqi_tql
 * @date 2020/4/27 -9:10
 */
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;



public class QQ {
    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
        Scanner sc = new Scanner(System.in);//输入判断字符
        Scanner sc1 = new Scanner(System.in);//输入QQ好友
        Scanner sc2 = new Scanner(System.in);//输入QQ群号
        Scanner sc3 = new Scanner(System.in);//输入循环次数
        Scanner sc4 = new Scanner(System.in);//自定义发送语句
        Robot robot = new Robot();
        Process process = null;//创建Process对象（用来开启cmd运行的）
        System.out.println("请输入想要发送消息的对象：（1代表QQ好友，2代表QQ群）");
        System.out.println("（默认发送YXRの情书）输入5代表自定义发送语言");
        int i1 = sc.nextInt();
        int i2 = 1;//循环次数默认一次
        int i3 = 60;//速度参数，单位是千分之一秒，注意低于50会抛出异常，如果速度参数想要追求极限<50则看i3使用地方的注释
        String s1 = null;//s1为要发送消息的QQ对象
        String url = null;//url为唤起聊天窗口的链接
        String cmd = null;//cmd中执行语句
        String str = "韩ly\n"+"\n"+"520"+"\n"+"1314";

        while (true) {
            if (1 == i1) {
                System.out.println("请输入QQ号（需要有该好友）：");
                s1 = sc1.nextLine();
                String QQ = s1;
                System.out.println("请输入循环次数:");
                i2 = sc3.nextInt();//设置循环次数  这里没有加判断输入数据是否合理
                // String url = "http://wpa.qq.com/msgrd?v=3&uin=\""+QQ+"\"&site=qq&menu=yes";
                url = "tencent://message/?uin=" + QQ + "&Site=null&Menu=yes";//弹出对应的QQ聊天窗口
                cmd = "explorer \"" + url + "\"";
                try {
                    process = Runtime.getRuntime().exec(cmd);
                } catch (IOException e) {
                    System.out.println("请重新运行程序");
                }
                assert process != null;
                process.waitFor();
                robot.delay(2000);//延迟2秒等待聊天框开启
                break;
            } else if (2 == i1) {
                System.out.println("请输入QQ群加群链接中最后部分（k= 后面的）（需在群内否则弹出加群链接）：");
                String ss1 = sc2.nextLine();
                System.out.println("请输入循环次数:");
                i2 = sc3.nextInt();//设置循环次数  这里没有加判断输入数据是否合理
                //   https://jq.qq.com/?_wv=1027&k=5ubbyM9//标准格式
                url = "https://jq.qq.com/?_wv=1027&k=" + ss1;
                cmd = "explorer \"" + url + "\"";
                process = Runtime.getRuntime().exec(cmd);
                assert process != null;
                process.waitFor();
                robot.delay(4000);//群聊打开较慢延迟4秒等待聊天框开启
                break;
            } else if (5 == i1) {
                System.out.println("请输入自定义发送的语句：（中英文的， 以及中文 。为分割）");
                str = sc4.nextLine();
                System.out.println("请输入想要发送消息的对象：（1代表QQ好友，2代表QQ群）");
                i1 = sc.nextInt();
            } else {
                System.out.println("您输入的有误，请重新输入：");
                i1 = sc.nextInt();

            }
        }
//        assert process != null;  //该部分为了防止打开群聊时间需要时间过长而分别设置了延迟时间
//        process.waitFor();
//        robot.delay(2000);//延迟2秒等待聊天框开启
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        String[] authors = str.split("[,]|[，]|[。]");//设置分割依据
        IntStream.range(0, i2)/*第二个参数设置循环次数*/.forEach(j -> {
            Arrays.stream(authors).forEach(i -> {
                while (true) {
                    Transferable text;
                    try {
                        text = new StringSelection(i);                  //如果速度参数想要追求极限<50将
                        clipboard.setContents(text, null);     //这两行代码注释，默认从剪切板重复发送消息，次数为出师表分割后的长度
                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.keyPress(KeyEvent.VK_V);
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.delay(i3);//设置速度参数，注意过低可能会抛剪切板相关异常，追求极限速度看4行前的注释
                        robot.keyPress(KeyEvent.VK_ENTER);
                        break;
                    } catch (Exception e) {
                        System.out.println("发送间隔时间太短！请修改速度参数");
                    }
                }
            });
        });
    }
}


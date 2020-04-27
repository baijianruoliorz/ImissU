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
        String str = "　感谢你来到这个世界，在最美丽的时候与我相遇，因为有了你，我的人生才充满了甜蜜快乐而多姿多彩。\n" +
                "\n" +
                "　　感谢你走入我的生命，做我的爱人，虽然我不是你遇到的最好的，但我一定会努力做到最好。\n" +
                "\n" +
                "　　感谢你愿意嫁给我，把自己的终生托付于我，一个女人对一个男人最大的信任，还有什么比嫁给他更重的托付？在此后漫长的岁月里，感谢你愿意牵着我的手一起走过。\n" +
                "\n" +
                "　　感谢你在我艰难迷茫的时候选择了我，不离不弃地终生和我一起度过，因为有了你，我才能够在伤心的时候不再哭泣，寂寞的时候不再孤单。\n" +
                "\n" +
                "　　感谢你愿意和我这样一个永远长不大的男人一起生活，我可能会在有些时候惹你生气，也可能在你伤心的时候不懂得安慰你，但是请你相信，我在心里一定是爱你的。\n" +
                "\n" +
                "　　感谢你在我贫穷的时候还愿意和我携手，共同面对人生的风风雨雨，感谢你愿意和我同甘苦共欢乐，我会努力工作，因为以后我不再是一个人了。\n" +
                "\n" +
                "　　感谢你愿意给我一个家，漂泊的太久，在我最需要家的时候，感谢你一手为我们建起一个温暖的家，虽然这个家很小，可我相信在你的打理下，我们的小家一定是温馨而整洁的。\n" +
                "\n" +
                "　　感谢你的温柔与细心，在我心里你将是最美丽的，还有你的善良与贤淑，一个女人具备了这些品质，无论她到了多大年纪，即使牙齿都掉光的时候，她依然是最美丽的女人。\n" +
                "\n" +
                "　　感谢你愿意让我喊你老婆，这是我多年的期待。一个女人对男人的托付，还有什么比让喊自己“老婆”更信任的称呼？一个男人对女人最亲昵的称呼，还有什么比称呼她“老婆”更甜蜜和自豪的呢？\n" +
                "\n" +
                "　　感谢你对我无微不至的照顾，感谢你亲手为我们烹制一日三餐，那是有家的人才能享受到的幸福场景，我可能会在你做饭的时候突然从后面抱住你，在我们一起围着小桌吃饭的时候幸福地看着你。虽然你的玉手在辛勤的操劳中一点点变得粗糙，但是我们干净整洁温馨的家就是对你最好的回报。\n" +
                "\n" +
                "　　感谢你愿意在夕阳西下的时候依偎在我的身旁，一起与我看夕阳看海或是看电视，这份依赖不但是你对我的，更是我对你深深的依恋。\n" +
                "\n" +
                "　　感谢你能在漫长的岁月中容忍我的坏脾气，当我对你发火赌气闹别扭的时候，感谢你能默默承受和容忍着我，感谢你让我一点点改掉自己的坏脾气，同样给你以温柔与呵护。\n" +
                "\n" +
                "　　感谢你在我遭遇挫折和失败的时候默默支持着我，使我在迷茫和困惑的时候仍然能够鼓起勇气和看清方向，因为你的支持，我一定能够重新站立起来。\n" +
                "\n" +
                "　　感谢你在我生病的时候照顾我，感谢你在病床边关切的眼神，为了你，我一定会健康快乐地活着。感谢你，因为有你，生病时我也是幸福的。同样，为了我，你也一定要健康快乐！\n" +
                "\n" +
                "　　感谢你在冬季的时候为我准备好棉衣，在春季的时候提醒我把棉衣换下来，如果不是你，我可能在非常热的时候才发现别人早已换上了春装，在寒冷的时候依然衣衫单薄。感谢你能帮我洗好衣服，经常催促我把脏衣服换下来，使我在别人面前保持干净整洁的外表。感谢你为我洗好我的臭袜子，给我温柔与关怀，提醒我做一些该做的事，因为有你，我的生活才不至于一团糟。\n" +
                "\n" +
                "　　感谢你在我感情陷入迷茫的时候接纳我，给我一个温暖的家，因为失去过，我更加懂得珍惜。虽然以前也深爱过别人，你却是第一个给我家的人，我明白，家意味这责任和义务，我会比爱别人十倍的来爱你。\n" +
                "\n" +
                "　　感谢你愿意为我们生下健康可爱的儿女，如果是女儿，我希望她能传承你的聪明和美丽，如果是男孩，希望她能继承你的勇气与坚强。不论是男孩还是女孩，我都会一样爱她（他）们。\n" +
                "\n" +

                "　　感谢你在漫长的岁月中陪我度过一生，使我们在白发苍苍的时候依然能够相互搀扶，感谢你将自己一生的时光都托付给我，让我们在晚年的时候依然能够相互陪伴。假如有一天我们都需终老泉下，我希望我们能同时离开，一起葬在我们老家的坟地，等我们长眠的时候还能够相互依偎，希望那时候你不要喃喃地说我这个死老头子缠了你一生。等我醒来的时候，我第一眼就能看见你正在温柔的看着我。如果还有来生，我依然渴望能和你一起度过。\n" +
                "\n" +
                "　　感谢你，让我在这个阳光明媚的午后能够坐下来为尚未谋面的你写下这封信，完成我一生的承诺。虽然现在还不知道你是谁和来自何方，但是我相信我们一定会相遇在茫茫人海中，当你看到这封信的时候，你会明白我早已在这里等着你。\n" +
                "\n" +
                "　　感谢你能在我们相遇的时候告诉我你就是我一生守候的人，感谢你能陪我去看日出，感谢你愿意和我去爬山，感谢你能容忍我在周日时赖着不起床，感谢你，因为有你，我的生命因此而精彩和快乐！\n" +
                "\n" +
                "　　感谢你，当你出现的时候，我相信天上一定飘着五彩祥云，你就在那美丽的云彩下姗姗走来，对着我嫣然一笑，那时候，美丽的莲花一定会绽放，你美丽如仙子，天地万物，一定会因为你的出现而黯然失色…… "; //要发送的语句

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


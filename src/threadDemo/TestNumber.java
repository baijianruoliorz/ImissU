package threadDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2020/6/9 -9:29
 */
public class TestNumber {
    float f1= 5.4f;
    float f2=5.5f;
    private List<Hero> heroes=new ArrayList<>();

    int addAtion(int x,int y){
        return (int) (f1+f2);
    }
    static int addAtions(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {
        //这个是取不到1的，而且是浮点数
        System.out.println(Math.random());

        //开方
        System.out.println(Math.sqrt(9));
        //2的四次方
        System.out.println(Math.pow(2,4));
        //π
        System.out.println(Math.PI);
        //自然常数e
        System.out.println(Math.E);

        String sentence = "        盖伦,在进行了连续8次击杀后,获得了 超神 的称号      ";

        System.out.println(sentence);
        //去掉首尾空格
        System.out.println(sentence.trim());
        TestNumber testNumber = new TestNumber();
        int i = testNumber.addAtion(3, 4);
        int i1 = addAtions(3, 5);

    }
}

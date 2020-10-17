package huatu;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2020/6/16 -18:29
 */
public class test3 {

    public static void main(String args[]){

        int[] ints = new int[100];
        for (int i = 0; i < 10; i++) {
            ints[i]=i;
        }
//        变成了stirng类型
        System.out.println(Arrays.toString(ints));
        String a="sadas";
        a+=1;
//        这样也可以变成string,但是go语言中不允许直接转化 需要strconv
        String s=1+"0";

    }

}

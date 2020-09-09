package test;

import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2020/8/21 -20:28
 */
public class testWithPy {
    public static void main(String[] args) {
        System.out.println("this is a project for py "+1);
        int[] a=new int[]{1,2,3};

//        这里打印的是地址
        System.out.println(a);
        List<String> test = new ArrayList<>();
        test.add("ss");
        test.add("sada");
//        list的方法 用来判断是否存在这个值
        boolean sada = test.contains("sada");
        int sada1 = test.indexOf("sada");
//        这里是-1 因为这个方法只能用来判断一个完整的对象 并不能找到一个对象里面的东西
        int da = test.indexOf("d");
        System.out.println(da);
        System.out.println(sada1);
        System.out.println(sada);
//        根据索引来插入元素位置
//        可以看到remove可以指定位置,也可以直接删除对象
        test.remove(0);
        test.add(0,"das");
        test.remove("sada");
//        这里可以直接打印出[]
//        与py列表相似
        System.out.println(test);
        Collections.reverse(test);
        System.out.println(test.size());
        Map<Integer, String> tests = new HashMap<>();
        tests.put(1,"dsa");
        tests.put(2,"asd");
        tests.put(1,"sda");
//        这里是{},只会打印最后一个1 即sda
        System.out.println(tests);
//char数组转字符串
//        第一种
//        用双赢好好像会报错 尽量双引号把
        char[] chars=new char[]{'a','s','s'};
        String string=new String(chars);
        System.out.println(string);
//        第二种
        String s = String.valueOf(chars);
        System.out.println(s);

    String li="liqiqiorz";
//    判断字符串是否含有某个部分,可以是部分 与list不同
        boolean li1 = li.contains("liq");
        System.out.println(li1);
    }
}

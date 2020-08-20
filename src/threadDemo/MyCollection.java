package threadDemo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2020/6/9 -8:38
 */
public class MyCollection {
    public static void main(String[] args) {
        ArrayList<Hero> heroes=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            heroes.add(new Hero("hero "+i));
        }
        Hero specialHero=new Hero("special hero");
        heroes.add(specialHero);

        //list可以直接打印，是[]这种，和数组string化一样
        System.out.println(heroes);

        //true
        System.out.println(heroes.contains(specialHero));

        //获取指定位置对象，如果越界，则报错
        // 不重写tostring的话打印的还是地址罢了
        System.out.println(heroes.get(3));

       //与之相对的是indexOf方法
        //通过传入对象得到位置
        //没有就算-1

        System.out.println(heroes.indexOf(specialHero));
        System.out.println(heroes.indexOf(new Hero("sda")));


        //remove既可以通过对象，也可以通过位置来删除
        System.out.println(heroes.remove(specialHero));
        System.out.println(heroes.remove(new Hero("s")));
        heroes.add(specialHero);
       //如果不给toArray传一个具体类型，就会是Object类型
        Object[] objects = heroes.toArray();
        //传了就不一样
        Hero[] heroes1 = heroes.toArray(new Hero[]{});
        //记住选object类型的tostring才能转换成数组
        //重写tostring不改变数组的输出方式，但会改变list的！！
        System.out.println("数组："+ Arrays.toString(heroes1));
//        自身不会变成数组
        System.out.println(heroes);
        System.out.println(heroes1[1]);
        //清空数组，返回void
        heroes.clear();
    }

}

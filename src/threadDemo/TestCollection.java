package threadDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection {
    public static void main(String[] args) {
        //初始化集合numbers
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("集合中的数据:");
        System.out.println(numbers);

        Collections.shuffle(numbers);
        System.out.println("混淆后集合中的数据:");
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println("排序后集合中的数据:");
        System.out.println(numbers);

    }
}
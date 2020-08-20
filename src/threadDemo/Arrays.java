package threadDemo;

/**
 * @author liqiqi_tql
 * @date 2020/6/9 -8:08
 */
public class Arrays {
    public static void main(String[] args) {
        int[] a=new int[]{18,62,68,82,65,9};
        //数组转换成字符串，打印格式为[1,2,3]..这种，记住，是string类型
        System.out.println(java.util.Arrays.toString(a));


        //数组复制
        int[] b=new int[]{1,2,3,4,5,6,7};
        //第一个参数表示数组
        //第二个参数是数组起始点
        //第三个是终止点
        int[] c= java.util.Arrays.copyOfRange(b,0,3);
        System.out.println(java.util.Arrays.toString(c));


        System.out.println("+++++++++++");
        System.out.println("+++++++++++");
        //数组排序
        int[] d=new int[]{2,1,4,2,6,5,8};
        System.out.println("排序之前：");
        System.out.println(java.util.Arrays.toString(d));
        java.util.Arrays.sort(d);
        System.out.println("排序之后：");
        System.out.println(java.util.Arrays.toString(d));

       //数组搜索：必须先排序，但是搜索出来的位置是原来数组的位置
        //直接赋值的话，里面就不能写数组长度了
        //搜索出来也只能变成排序之后的顺序了
        int[] e=new int[]{18,62,68,82,65,9};
        java.util.Arrays.sort(e);

        System.out.println("数字62出现的位置："+ java.util.Arrays.binarySearch(e,62));
        System.out.println("数字9出现的位置："+ java.util.Arrays.binarySearch(e,9
        ));

        int[] f=new int[]{18,62,68};
        int[] g=new int[]{18,62,68};
        int[] h=new int[]{18,68,62};
        //true
        System.out.println(java.util.Arrays.equals(f,g));
        //false
        System.out.println(java.util.Arrays.equals(f,h));

        //数组填充，全部为5
        int[] i=new int[10];
        java.util.Arrays.fill(i,5);
        System.out.println(java.util.Arrays.toString(i));


    }

    }




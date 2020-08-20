package threadDemo;
public class Hero {
    public String name;
    public float hp;

    public int damage;
    private int add(int a,int b){
        return a+b;
    }
    public int addPublic(int a ,int b){
        return a+b;
    }
    int addFriendly(int a ,int b){
        return a+b;
    }
    public String attack(){
        return "asdsa";
    }

    public Hero() {

    }

    // 增加一个初始化name的构造方法
    public Hero(String name) {

        this.name = name;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        TestNumber testNumber = new TestNumber();
        float f1 = testNumber.f1;

    }

}
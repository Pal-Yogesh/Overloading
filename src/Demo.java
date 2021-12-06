// method overload

public class Demo {
    public void show(int x){
        System.out.println(x);
    }
    public void show (String s){
        System.out.println(s);
    }
}
class Main123{
    public static void main(String[] args) {
     Demo obj = new Demo();
     obj.show("hello");
     obj.show(100);

    }
}
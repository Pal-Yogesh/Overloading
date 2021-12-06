// method override

public class Parent {
    public void show(){
        System.out.println("parent");
    }
}
class Child extends Parent{
    public void show(){
        System.out.println("child");
    }
}
class Main{
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.show();
        Parent obj2 = new Child();
        obj2.show();
    }
}
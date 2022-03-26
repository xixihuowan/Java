//接口
interface A {
    public static final int i = 20;
    public abstract void printNum();
}

interface B {
    public static final String name = "winly";
    public abstract void printString();
}

//子类
class Test implements A,B {
    public void printNum(){
        System.out.println("Num = "+i);
    }

    public void printString(){
        System.out.println("String ="+name);
    }
}

public class Interface {
    public static void main(String args[]) {
        Test test =new Test();

        test.printNum();
        test.printString();
    }
}

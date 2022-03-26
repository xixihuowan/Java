abstract class Father{
    public abstract void study();   //规定子类必须实现的方法
}

class Son extends Father{
    public void study(){    //实现抽象类定义的方法
        System.out.println("good good study");
    }
}

public class Abstract {
    public static void main(String args[]){
        Son son = new Son();
        son.study();
    }
}

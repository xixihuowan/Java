//类的定义（类是创建对象的模板，创建对象也叫类的实例化）
class Person{
    //类变量（调用不需要实例化对象）
    static int count;
    //类方法（调用不需要实例化对象）
    static void printPerson() {
        System.out.println("class of Person");
    }

    //静态代码块
    static {
        System.out.println("execute only once");
    }

    //构造代码块（每次创建对象时都会被调用，且先与构造方法执行）
    {
        System.out.println("Every call is executed");
        count ++;
    }
    //类的成员
    String name;
    int age;
    //成员方法
    String getname(){
        return name;
    }

    //构造方法（没有返回值，方法名必须与类名一样）
    public Person(){
        name ="null";
        age = 0;
    }

    public Person(String name){
        this.name =name; //this 代表此类
        age = 0;
    }
    public Person(String name,int age){
        this.name =name;
        this.age = age;
    }
}

public class Into {
    public static void main(String args[]){
        Person p0 = new Person();
        Person p1 = new Person("winly");
        Person p2 = new Person("winly",18);

        System.out.println(p0.getname()); //调用成员方法
        System.out.println(p1.getname()); //调用成员方法
        System.out.println(p2.getname()); //调用成员方法

        Person.printPerson();    //访问类方法
        System.out.println("Person number is "+ Person.count);    //访问类的变量
    }

}
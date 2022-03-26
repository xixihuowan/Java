class Person {
    /* 成员变量(属性) */
    //int age;       //default
    private int age; //私有,只能供类内部访问
    
    /* 成员方法 */
    public void setAge(int age) {
        if (age < 0 || age > 200)
            age = 0;
        else 
            this.age = age;
    }
    
    public int getAge() {
        return age;
    }
}

public class Enc {
    public static void main(String args[]) {
        Person per = new Person();
        //per.age = -1; //外部直接访问,不好控制
        per.setAge(230);
        
        System.out.println(per.getAge());
    }
}

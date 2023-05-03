package customer_management;

class A{
    private static A ob;
    private A(){
        
    }
    public static A getInstance(){
        if(ob==null){
            ob=new A();
        }
        return ob;
    }
}

public class ThogaKade {

    public static void main(String[] args) {
        A a1=A.getInstance();
        A a2=A.getInstance();
        System.out.println(a1==a2); //true
    }
}

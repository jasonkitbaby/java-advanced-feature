package refelection.proxy;



public class RealSubject implements Subject{

    public void call(String content){
        System.out.println(content);
    }
}

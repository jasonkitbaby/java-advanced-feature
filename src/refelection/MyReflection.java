package refelection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MyReflection {



    private String name;
    protected int age;
    public String miki;

    public MyReflection() {
    }

    public void publicMethod(){}
    protected void protectedMethod(){}
    private void privatemethod(){}

    public static void main(String[] arg) throws ClassNotFoundException {


        Class c1 = Class.forName("refelection.MyReflection");
        Class c2 = MyReflection.class;
        Class c3 = new MyReflection().getClass();


        Field[] fs1 = c1.getDeclaredFields();
        Field[] fs2 = c2.getFields();


        Method[] method1 = c1.getDeclaredMethods();
        Method[] method2 = c2.getMethods();

        Constructor[] cts1 = c1.getDeclaredConstructors();
        Constructor[] cts12 =c2.getDeclaredConstructors();



        for(Field field:fs1){
            System.out.println("***************** get declaredFields *****************");
            System.out.println(Modifier.toString(field.getModifiers()));
            System.out.println( field.getType().getSimpleName());
            System.out.println( field.getName());
        }

        for(Field field:fs2){
            System.out.println("***************** get getFields *****************");
            System.out.println(Modifier.toString(field.getModifiers()));
            System.out.println( field.getType().getSimpleName());
            System.out.println( field.getName());
        }

        for(Method method:method1){
            System.out.println("***************** get getDeclaredMethods *****************");
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println( method.getName());
        }

        for(Method method:method2){
            System.out.println("***************** get getMethods *****************");
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println( method.getName());
        }

        for(Constructor constructor:cts1){
            System.out.println("***************** get getDeclaredConstructors *****************");
            System.out.println(Modifier.toString(constructor.getModifiers()));
            System.out.println( constructor.getName());
        }

        for(Constructor constructor:cts12){
            System.out.println("***************** get getConstructors *****************");
            System.out.println(Modifier.toString(constructor.getModifiers()));
            System.out.println( constructor.getName());
        }

    }
}

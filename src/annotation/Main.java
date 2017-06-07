package annotation;

import java.lang.reflect.Field;


public class Main {


    public static void main(String[] arg) {

        Class c = new Domain().getClass();


        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {

            MyAnnotation myAnnotation = field.getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.column());

        }
    }
}

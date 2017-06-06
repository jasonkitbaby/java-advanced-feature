package annotation;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Domain {


    @MyAnnotation(column = "id", dataFormate = "int")
    private int id;

    @MyAnnotation(column = "name")
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] arg){

        Class<Domain> clazz = Domain.class;

        Annotation[] fields_declare_annotion = clazz.getDeclaredAnnotations();
        for(Annotation annotation : fields_declare_annotion){
            System.out.println( annotation.toString());
        }
        Field[] fields = clazz.getDeclaredFields();

        for(Field field:fields){
            boolean flag = field.isAnnotationPresent(MyAnnotation.class);
            System.out.println(flag);
            MyAnnotation fruitName = (MyAnnotation) field.getAnnotation(MyAnnotation.class);
            System.out.println(fruitName.column());

        }
    }
}

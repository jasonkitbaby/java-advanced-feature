package annotation;



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


}

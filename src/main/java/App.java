import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        HelloWorld hw1 = (HelloWorld) context.getBean("helloworld");
        System.out.println(hw1.getMessage());


        HelloWorld hw2 = (HelloWorld) context.getBean("helloworld");
        System.out.println("Объекты HelloWorld совпадают: " + (hw1 == hw2));


        Cat cat1 = (Cat) context.getBean("cat");
        System.out.println(cat1.toString());


        Cat cat2 = (Cat) context.getBean("cat");
        System.out.println("Объекты Cat совпадают: " + (cat1 == cat2));
    }
}
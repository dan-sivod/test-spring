import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHelloTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCatOne =
                (Cat) applicationContext.getBean("cat");
        Cat beanCatTwo =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanHelloOne == beanHelloTwo);
        System.out.println(beanCatOne == beanCatTwo);
    }
}
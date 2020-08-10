package Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Configuration.DIConfiguration;
import Consumer.MyApplication;

public class ClientApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyApplication app = context.getBean(MyApplication.class);
        System.out.println("hello world");
        app.processMessage("Hi Pankaj", "pankaj@abc.com");

        //close the context
        context.close();
    }
}

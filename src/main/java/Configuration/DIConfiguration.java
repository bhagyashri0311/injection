package Configuration;
import bhosale.EmailService;
import bhosale.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(value={"Consumer"})
public class DIConfiguration {
@Bean
    public MessageService getMessageService(){
        return new EmailService();
    }
}
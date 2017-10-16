import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("cn.com.gree")
@EnableAutoConfiguration
public class SpringbootApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringbootApplication.class,args);
    }
}

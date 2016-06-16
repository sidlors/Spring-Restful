package mx.com.sidlors.spring.restful.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author jhernandezn
 */
@EnableWebMvc
@Configuration
@ComponentScan("mx.com.sidlors.spring.restful")
public class WebConfig extends WebMvcConfigurerAdapter {

}
package beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"repositories", "proxies", "services"})
public class Beans {
	
}
package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring.test")
@PropertySource("classpath:knightInfo.properties")
public class SpringConfig {
}

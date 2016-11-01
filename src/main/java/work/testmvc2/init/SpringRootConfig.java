package work.testmvc2.init;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "work.testmvc2.controller", "work.testmvc2.service" })
public class SpringRootConfig {
}
package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "main")
@ComponentScan(basePackages = "config")
public class ProjectConfig {

}

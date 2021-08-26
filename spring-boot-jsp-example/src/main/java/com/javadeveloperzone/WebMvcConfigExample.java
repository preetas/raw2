package com.javadeveloperzone;

import org.springframework.boot.SpringApplication; import org.springframework.boot.autoconfigure.SpringBootApplication; 

@Profile("!profile1")
@SpringBootApplication 
public class WebMvcConfigExample 
{  public static void main (String[] args)
 {  SpringApplication app = new SpringApplication(WebMvcConfigExample.class); 
app.run(args); } }

/*import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import 

@SpringBootApplication
@ComponentScan(basePackages = {"com.javadeveloperzone.controller"})
// Using a root package also allows the @ComponentScan annotation to be used without needing to specify a basePackage attribute
public class SpringBootConfig extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootConfig.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootConfig.class, args);            // it wil start application
    }
}*/

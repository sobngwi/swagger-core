package com.sobngwi;
import static springfox.documentation.builders.PathSelectors.regex;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import com.google.common.base.Predicate;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan("com.sobngwi")
public class App 
{

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
     
    @Bean
    public Docket getApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Get")
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/greeting.*"))
                .build();
    }
    @Bean
    public Docket postApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Post")
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/postG.*"))
                .build();
    }
     
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring REST MVC  with Swagger")
                .description("Spring REST MVC with Swagger")
                .contact("Alain  SOBNGWI")
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com")
                .version("2.0")
                .build();
    }
}

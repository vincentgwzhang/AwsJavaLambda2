package personal.aws.dynamodb.lambda2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class Lambda2Application {

    public static void main(String[] args) {
        SpringApplication.run(Lambda2Application.class, args);
    }

    @Bean
    public Function<String, String> reverse() {
        return input -> String.valueOf(new StringBuilder(input).reverse());
    }

}

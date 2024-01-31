package personal.aws.dynamodb.lambda2.functions;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import personal.aws.dynamodb.lambda2.model.Subsriber;
import personal.aws.dynamodb.lambda2.service.SubscriberService;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class Subscribers {

    private final SubscriberService subscriberService;

    @Bean
    public Supplier<List<Subsriber>> findAll() {
        log.info("Subscribers::findAll");
        return () -> subscriberService.findAll();
    }

    @Bean
    public Consumer<String> create() {
        return subscriberService::create;
    }
}

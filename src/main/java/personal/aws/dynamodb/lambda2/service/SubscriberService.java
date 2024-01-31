package personal.aws.dynamodb.lambda2.service;

import org.springframework.stereotype.Service;
import personal.aws.dynamodb.lambda2.model.Subsriber;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class SubscriberService {

    private final List<Subsriber> subsriberList = new ArrayList<>();

    private AtomicInteger id = new AtomicInteger(0);

    public List<Subsriber> findAll() {
        return  subsriberList;
    }

    public void create(String email) {
        subsriberList.add(new Subsriber(id.addAndGet(1), email));
    }
}

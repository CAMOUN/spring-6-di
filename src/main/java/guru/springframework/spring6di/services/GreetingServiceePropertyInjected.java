package guru.springframework.spring6di.services;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServiceePropertyInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Friends don't let friends do property injection";
    }
}

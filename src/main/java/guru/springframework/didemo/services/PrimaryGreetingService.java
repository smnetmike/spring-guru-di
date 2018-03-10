package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting service";
    }
}

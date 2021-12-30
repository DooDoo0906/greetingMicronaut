package greeting.server.controller;


import greeting.server.service.GreetingService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;


@Controller("/greet")
public class GreetController {

    @Inject
    private GreetingService greetingService;

    @Get("/{name}")
    public String greet(String name) {
        return greetingService.getGreeting() + name;
    }

    @Post( "/greeting")
    public String setGreeting(@Body String name)
    {
        return greetingService.getGreeting() + name;
    }
}

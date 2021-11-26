package at.htl;

import io.quarkus.vertx.ConsumeEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;

@ApplicationScoped
public class GreetingService {
    @ConsumeEvent("greeting")
    public String greeting(String name) {
        return "Hello " + name;
    }
}
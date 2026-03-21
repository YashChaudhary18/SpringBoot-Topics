package t7.usermanagement.config;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class DemoBean {

    @PostConstruct
    public void init() {
        System.out.println("Bean Created!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean Destroyed!");
    }
}
package beanlifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeansLifeCycleAnnotation {
    @PostConstruct
    public void postConstruct(){

        System.out.println("Call method postConstruct()");
    }
    @PreDestroy
    public void preDestroy(){

        System.out.println("Container has been closed and call preDestroy() method");
    }
}

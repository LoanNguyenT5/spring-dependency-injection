package beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.AccountService;

public class MaiTestAnotation {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationbasedconfiguration/beans-contructor.xml");
//        BeansLifeCycleAnnotation beansLifeCycleAnnotation = applicationContext.getBean("beansLifeCycleAnnotation", BeansLifeCycleAnnotation.class);
//        applicationContext.close();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(BeansLifeCycleAnnotation.class);
        ctx.refresh();
        ctx.close();
    }
}

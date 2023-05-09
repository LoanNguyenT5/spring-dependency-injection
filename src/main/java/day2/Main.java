package day2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.AccountService;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("day2/beans.xml");
        Student student = applicationContext.getBean("student", Student.class);
        student.draw();
    }
}

package beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.Account;
import pojobeans.AccountService;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanscopes/beans.xml");
        Account accSingleton1 = applicationContext.getBean("account1", Account.class);
        accSingleton1.setOwnerName("XXXXXXX");
        Account accSingleton2 = applicationContext.getBean("account1", Account.class);
        System.out.println("account1: "+ accSingleton2.getOwnerName());

        Account accPrototype1 = applicationContext.getBean("account2", Account.class);
        accPrototype1.setOwnerName("XXXXXXX");
        Account accPrototype2 = applicationContext.getBean("account2", Account.class);
        System.out.println("account2: "+ accPrototype2.getOwnerName());


    }

}

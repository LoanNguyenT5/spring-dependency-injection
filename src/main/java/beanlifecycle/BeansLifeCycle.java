package beanlifecycle;

public class BeansLifeCycle {
    public void init(){
        System.out.println("Call method init()");
    }
    public void destroy(){
        System.out.println("Container has been closed and call destroy() method");
    }
}

package day2;

public class DemoService {
    private Demo demo;
    private Compa compa;



    // constructor
    public DemoService(Demo demo, Compa compa) {
        this.demo = demo;
        this.compa = compa;
    }

    // z
    public void setDemo(Demo demo) {
        this.demo = demo;
    }
}

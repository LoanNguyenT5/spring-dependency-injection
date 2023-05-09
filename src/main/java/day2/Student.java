package day2;

public class Student {
    private Draw draw;
    //private Compa compa;

//    public Student() {
//        draw = FactoryTypeDraw.getTypeDraw();
//    }

//    public void setCompa(Compa compa) {
//        this.compa = compa;
//    }
    public void setDraw(Draw draw) {
        this.draw = draw;
    }

    public void draw(){
        draw.draw();
       // compa.drawCircle();
    }
}

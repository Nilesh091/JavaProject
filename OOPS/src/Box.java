public class Box {
    private double h;
    double w;
    double l;
    double nr=20;
    Box(){
        this.h=-1;
        this.w=-1;
        this.l=-1;
        System.out.println("Box constructer is called with no parameter");
//        super(); this will refer to the object
    }
    Box(double x,double y,double z){
        this.h=x;
        this.w=y;
        this.l=z;
        System.out.println("Box constructer is called with 3 parameters");
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;

    }
}

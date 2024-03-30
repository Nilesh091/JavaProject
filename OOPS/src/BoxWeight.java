public class BoxWeight extends  Box{
    double we;
    double nr=30;
    BoxWeight(){
        super();
        this.we=-1;
        System.out.println("BoxWeight constructer is called with no parameter");
//        System.out.println(this.nr);
//        System.out.println(super.nr);

    }
    BoxWeight(double x,double y,double z,double q){
        super(x,y,z);
        this.we=q;
        System.out.println("BoxWeight constructer is called with 4 parameters");
//        System.out.println(this.nr);
//        System.out.println(super.nr);
    }
}

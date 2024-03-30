public interface int2 extends Int1{
    default void print(){
        System.out.println("print");
    }
    @Override
    default void nilu(){
        System.out.println("overridden");
    }

}

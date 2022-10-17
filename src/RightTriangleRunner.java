public class RightTriangleRunner {
    public static void main (String [] args){
        RightTriangle trig1 = new RightTriangle(3,4);
        System.out.println(trig1.hypotenuse());
        RightTriangle trig2 = new RightTriangle(6.5,10.7);
        System.out.println(trig2.hypotenuse());
    }
}

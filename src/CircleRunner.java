public class CircleRunner {
    public static void main(String [] args){
        Circle circle1 = new Circle(5.0);
        System.out.println(circle1.getInfo());
        Circle circle2 = new Circle(9.2);
        String info2 = circle2.getInfo();
        System.out.println(circle2.getInfo());
    }
}

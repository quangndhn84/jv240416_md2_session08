package ra.excecise.ex1;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5.2, "red");
        System.out.println("Diện tích hình tròn trước khi resize: " + circle.getArea());
        circle.resize(1.3);
        System.out.println("Diện tích hình tròn sau khi resize:  " + circle.getArea());
    }
}

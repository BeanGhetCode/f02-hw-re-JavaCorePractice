package Class;

public class Circle {
    private double radius;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(){

    }

    public void calculatePerimeter(){
        System.out.println("Perimeter = " + (this.radius*2*Math.PI));
    }

    public void calculateArea (){
        System.out.println("Acreage = " + (Math.pow(this.radius,2)*Math.PI));
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArea();
        circle.calculatePerimeter();
    }
}


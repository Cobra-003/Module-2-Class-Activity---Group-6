public class CircleLab_Starter {

    public static void main(String[] args) {

        Circle myCircle = new Circle(5.0);

        displayCircleInfo("First Circle Values", myCircle);

        myCircle.setRadius(8.5);

        displayCircleInfo("After Updating Radius", myCircle);

        System.out.println("Testing negative radius:");
        myCircle.setRadius(-4.0);
        displayCircleInfo("After Negative Radius Test", myCircle);
    }

    public static void displayCircleInfo(String title, Circle circle) {
        System.out.println();
        System.out.println(title);
        System.out.println("----------------------");
        System.out.printf("Radius: %.2f%n", circle.getRadius());
        System.out.printf("Area: %.2f%n", circle.getArea());
        System.out.printf("Circumference: %.2f%n", circle.getCircumference());
    }
}

class Circle {

    private double radius;

    public Circle(double startingRadius) {
        setRadius(startingRadius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        if (newRadius < 0) {
            System.out.println("Invalid radius. The value was not changed.");
        } else {
            radius = newRadius;
        }
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
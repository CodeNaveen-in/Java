//abrstact class
abstract class Shape {
    // Abstract method - subclasses must provide implementation
    abstract double perimeter();

    void display() {
        System.out.println("This is a shape.");
    }
}


class Circle extends Shape{
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }


    double perimeter() {
        return 2 * Math.PI * radius;
    }

}


class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    double perimeter() {
        return 4 * side;
    }
}

public class T1 {
    public static void main(String[] args) {
        
        Shape[] shapes = { new Circle(5), new Square(4) };
        //Shape s1=new Shape();
        //cant create an instance of abstract class

        for (Shape s : shapes) { 
            s.display();
            System.out.println("Perimeter: " + s.perimeter());
        }
        
    }
}

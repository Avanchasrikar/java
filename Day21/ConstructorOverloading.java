package Day21;

class Rectangle {
    int length;
    int width;

    // method 1
    public Rectangle() {
        length = 1;
        width = 1;

    }

    public Rectangle(int side) {

        this.length = side;
        this.width = side;
    }
    // Method 2 Advanced 
    // public Rectangle() {
    // this(1, 1);
    // }

    // public Rectangle(int side) {
    // this(side, side);
    // }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
     public int calculatePerimeter() {
        return 2 * (length + width);
    }
      public int calculateArea() {
        return length * width;
    }

    public void calculate() {

        System.out.println("Length :" + length);
        System.out.println("Width :" + width);
        System.out.println("Area :" +calculateArea());
        System.out.println("Perimeter :" + calculatePerimeter());
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle(6, 4);
        System.out.println("Rectangle 1:");
        obj.calculate();
        obj1.setLength(3);
        obj1.setWidth(3);
        System.out.println("Rectangle 2:");
        obj1.calculate();
        System.out.println("Rectangle 3:");
        obj2.calculate();

        // Store objects in an array
       // Rectangle[] rectangles = {obj, obj1, obj2};

        // Display every rectangle using a loop
        // for (int i = 0; i < rectangles.length; i++) {
        //     System.out.println("Rectangle " + (i + 1) + ":");
        //     rectangles[i].displayDetails();
        //     System.out.println();
        // }

    }
}

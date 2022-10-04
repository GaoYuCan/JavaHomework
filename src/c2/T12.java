package c2;

public class T12 {
}

abstract class MyGraphic {
    public abstract double area();

    public abstract double perimeter();
}

class Rect extends MyGraphic {
    private double length;
    private double width;

    public Rect() {
        this(0.0, 0.0);
    }

    public Rect(double length, double width) {
        if (length < 0.0 || width < 0.0) {
            throw new IllegalArgumentException("length and width must be positive");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return (length + width) * 2;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0.0) {
            throw new IllegalArgumentException("length and width must be positive");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0.0) {
            throw new IllegalArgumentException("length and width must be positive");
        }
        this.width = width;
    }
}

class Triangle extends MyGraphic {
    private double l1;
    private double l2;
    private double l3;

    public Triangle() {
        this(0.0, 0.0, 0.0);
    }

    public Triangle(double l1, double l2, double l3) {
        if (l1 < 0.0 || l2 < 0 || l3 < 0) {
            throw new IllegalArgumentException("l1 l2 l3 must be positive");
        }
        if (l1 + l2 < l3 || l1 + l3 < l2 || l2 + l3 < l1) {
            throw new IllegalArgumentException("l1 l2 l3 cant make a triangle");
        }
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }


    @Override
    public double area() {
        double p = (l1 + l2 + l3) / 2;
        return Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
    }

    @Override
    public double perimeter() {
        return l1 + l2 + l3;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        if (l1 < 0) {
            throw new IllegalArgumentException("l1 l2 l3 must be positive");
        }
        if (l1 + l2 < l3 || l1 + l3 < l2 || l2 + l3 < l1) {
            throw new IllegalArgumentException("l1 l2 l3 cant make a triangle");
        }
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        if (l2 < 0) {
            throw new IllegalArgumentException("l1 l2 l3 must be positive");
        }
        if (l1 + l2 < l3 || l1 + l3 < l2 || l2 + l3 < l1) {
            throw new IllegalArgumentException("l1 l2 l3 cant make a triangle");
        }
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        if (l3 < 0) {
            throw new IllegalArgumentException("l1 l2 l3 must be positive");
        }
        if (l1 + l2 < l3 || l1 + l3 < l2 || l2 + l3 < l1) {
            throw new IllegalArgumentException("l1 l2 l3 cant make a triangle");
        }
        this.l3 = l3;
    }
}

class Circle extends MyGraphic {

    private double radius;

    public Circle() {
        this(0.0);
    }

    public Circle(double radius) {
        if (radius < 0.0) {
            throw new IllegalArgumentException("radius must be positive!");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * radius * 2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0.0) {
            throw new IllegalArgumentException("radius must be positive!");
        }
        this.radius = radius;
    }
}

class Oval extends MyGraphic {
    private double a;
    private double b;

    public Oval() {
        this(0.0, 0.0);
    }

    public Oval(double a, double b) {
        if (a < 0.0 || b < 0.0) {
            throw new IllegalArgumentException("a b must be positive!");
        }
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return Math.PI * a * b;
    }

    @Override
    public double perimeter() {
        double s = Math.min(a, b);
        double l = Math.max(a, b);
        return 2 * Math.PI * s + 4 * (l - s);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a < 0.0) {
            throw new IllegalArgumentException("a b must be positive!");
        }
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b < 0.0) {
            throw new IllegalArgumentException("a b must be positive!");
        }
        this.b = b;
    }
}

class Diamond extends MyGraphic {
    private double l;
    private double h;

    public Diamond() {
        this(0.0, 0.0);
    }

    public Diamond(double l, double h) {
        if (l < 0.0 || h < 0.0) {
            throw new IllegalArgumentException("l h must be positive!");
        }
        this.l = l;
        this.h = h;
    }

    @Override
    public double area() {
        return l * h;
    }

    @Override
    public double perimeter() {
        return l * 4;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        if (l < 0.0) {
            throw new IllegalArgumentException("l h must be positive!");
        }
        this.l = l;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if (h < 0.0) {
            throw new IllegalArgumentException("l h must be positive!");
        }
        this.h = h;
    }
}

class Trapezoidal extends MyGraphic {

    private double top;
    private double bottom;
    private double left;
    private double right;
    private double height;

    public Trapezoidal() {
        this(0.0, 0.0, 0.0, 0.0, 0.0);
    }

    public Trapezoidal(double top, double bottom, double left, double right, double height) {
        this.top = top;
        this.bottom = bottom;
        this.left = left;
        this.right = right;
        this.height = height;
    }

    @Override
    public double area() {
        return height * (top + bottom) / 2.0;
    }

    @Override
    public double perimeter() {
        return top + left + bottom + right;
    }

    public double getTop() {
        return top;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public double getBottom() {
        return bottom;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}



public class Rectangle {
    double h,w;
    public Rectangle(){
    }
    public Rectangle(double h, double w){
        this.h=h;
        this.w=w;
    }
    public double getArea(){
        double area = this.h*this.w;
        return area;
    }
    public double getPerimeter(){
        double perimeter = (this.h+this.w)*2;
        return perimeter;
    }
    public String display() {
        return "Rectangle{" + "width=" + w + ", height=" + h + "}";
    }
}


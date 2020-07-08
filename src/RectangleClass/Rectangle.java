package RectangleClass;

public class Rectangle {
       //Bước 1: Tạo lớp Rectangle, khai báo các thuộc tính (properties), định nghĩa các phương thức khởi tạo (contructors).
           double width, height;

           public Rectangle() {
           }

           public Rectangle(double width, double height) {
               this.width = width;
               this.height = height;
           }
           //code below here
    public double getArea() {
               return this.height * this.width;
    }
    public double getPerimeter() {
               return (this.height + this.width) * 2;
    }
    public String display() {
               return "Rectangle {" + "width =" + this.width + ", height =" + this.height + "}";

    }
}





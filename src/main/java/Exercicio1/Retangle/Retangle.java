package Exercicio1.Retangle;

public class Retangle {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double Area(){
        return width * height;
    }

    public double Perimeter(){
        return ((width * 2) + (height * 2));
    }

    public double Diagonal(){
        return Math.sqrt((width * width) + (height * height));
    }
}

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height = 1.0;
    }
    public Cylinder(double radius) {
        super();
    }
    public Cylinder(double radius, double height) {
        super();
        this.height = height;
    }
    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea() * height;
    }
    public String toString(){
        return "Cylinder["+super.toString()+"height="+height+"]";
    }

}

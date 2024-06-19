public class Cylinder {
    private double radius;
    private double height;
    public void setCylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public double volume(){
        return (Math.PI)*radius*radius*height;
    }
    public double areaSide(){
        return 2*Math.PI*radius*radius*height;
    }
    public double area(){
        return 2*Math.PI*radius * (radius + height);
    }
}

public class Triangle{
    private double lengthA;
    private double lengthB; 
    private double lengthC; 
    public Triangle(double a , double b, double c){
       lengthA =a;
       lengthB =a;
       lengthC =a;
    }
    public void setLengthA(double a){
        lengthA =a;
    }
    public void setLengthB(double b){
        lengthB =b;
    }
    public void setLengthC(double c){
        lengthC =c;
    }
    public double getLengthA(){
        return lengthA;
    }
    public double getLengthB(){
        return lengthB;
    }
    public double getLengthC(){
        return lengthC;
    }
    public double getArea(){
        double s = (lengthA+lengthB+lengthC)/2;
        return (Math.sqrt(s*(s-lengthA)*(s-lengthB)*(s-lengthC)));
    }
    public double getPerimeter(){
        return lengthA+lengthB+lengthC;
    }
}

package Problem2;

public class Square extends Rectangle{
    public Square(){
        super(1.0, 1.0); // call rectangle constructor with w & l set to 1.0
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }    
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public String toString(){
        return "A Square with side=" + super.getWidth() + ", which is a subclass of " + super.toString();
    }
}

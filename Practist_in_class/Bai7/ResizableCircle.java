public class ResizableCircle  extends Circle implements Resizable {
    public ResizableCircle(double radius){
        super(radius);
    }
    
    @Override
    public void resize(int percent) {
        System.out.println(percent);
        
    }
    publlic String toString(){
        return "\nRadius: " + radius + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
    }
    
    
    
    
    
}

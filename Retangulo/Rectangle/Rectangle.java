package Rectangle;

public class Rectangle {
    private double length = 1.0;
    private double width = 1.0;

     public Rectangle() {
        
    }
     
     public Rectangle(double length, double width) {
        if (length > 0.0 && length < 20.0 && width > 0.0 && width < 20.0) {
            
            this.length = length;
            this.width = width;
        } else {
           
           System.out.println("Length e Width devem ser entre 0.0 e 20.0");
        }
    }
    
    
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            
            this.length = length;
        } else {
            System.out.println("Length deve ter entre 0.0 e 20.0");
        }
    }

    public double getWidth() {
        return width;
    }

    
    public void setWidth(double width) {
        
        if (width > 0.0 && width < 20.0) {
            
            this.width = width;
        } else {
            
            System.out.println("Width deve ter entre 0.0 e 20.0");
        }
    }
    
    public double getPerimeter() {
        
        return 2 * (length + width);
    }

    
    public double getArea() {
 
        return length * width;
    }

    
    public String toString() {
        
        return String.format("Rectangle[length=%.2f, width=%.2f, perimeter=%.2f, area=%.2f]", length, width, getPerimeter(), getArea());
    }
}

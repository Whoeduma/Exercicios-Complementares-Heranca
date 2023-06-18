
package Test;

import Rectangle.Rectangle;


public class TestRectangle {

    
    public static void main(String[] args) {
         Rectangle r1 = new Rectangle();
         Rectangle r2 = new Rectangle(5.0, 10.0);
         
         
        System.out.println("r1: " + r1);
       
        System.out.println("r2: " + r2);
     
        r1.setLength(3.0);
        r1.setWidth(4.0);

        System.out.println("r1: " + r1);
    }
    
}

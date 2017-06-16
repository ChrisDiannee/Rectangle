/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author 3rd Year Account
 */
public class RectangleDemo {
    public static void main(String[] args){
    
        Rectangle r1= new Rectangle();
        Rectangle r2= new Rectangle(2);
        Rectangle r3= new Rectangle(2,2);
        r1.displayArea();
        double area=r1.displayArea2();
        System.out.println(area);
                
        
    }
            
            
            
            
}

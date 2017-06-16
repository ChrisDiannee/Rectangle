
package rectangle;

public class Rectangle {
    //Attributes*
        double length;
        double width;
    
       Rectangle(){
            this.length=0.0;
            this.width=0.0;
            System.out.println("First Constructor Loaded");
        }
       Rectangle(double length){
            this.length=length;
            this.width=0.0;
            System.out.println("Second Constructor Loaded");
        }          
       
       Rectangle(double length, double width){
            this.length=length;
            this.width=width;
            System.out.println("Third Constructor Loaded");
        }       

       double getlength(){
           return this.length;
       }
       
       void setlength(double length){
           this.length=length;
       }     
       
       double getwidth(){
           return this.length;
       }
       
       void setwidth(double width){
           this.width=width;
       }         
       
      
           
        void displayArea(){
            double area=this.length *this.width; 
            System.out.println(area);
        }   
                        
        double displayArea2(){
            double area=this.length *this.width; 
            return area;
        }         
        
  
       
       
       
}

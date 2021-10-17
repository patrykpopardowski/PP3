
public class Rectangle
{
    int length;
    int width;
    
    void displayDimensions(){
        System.out.println("Dimensions: " + length + "x" + width);
    } 
    void displayPerimeter(){
        int perimeter = 2 * length + 2 * width;
        System.out.println("Perimeter: " + perimeter);
    }
    void displayArea(){
        int area = length * width;
        System.out.println("Area: " + area);
    }
}

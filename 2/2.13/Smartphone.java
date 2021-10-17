public class Smartphone
{
    String model;
    float price;
    String color;
    float size;
    boolean turnedOn;
    
    void displayModel(){
        System.out.println(model);
    }
    void switchOnOff(){
        turnedOn = !turnedOn;
    }
    void displayPrice(){
        System.out.println(price);
    }
}

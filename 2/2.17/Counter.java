public class Counter
{
   int value = 0;
   
   void reset(){
        value = 0;
    }
   void addOne(){
        value = value + 1;
    }
    
   void addTen(){
        value = value + 10;
    }
   void subtractOne(){
        value = value - 1;
    }
   void subtractTen(){
        value = value - 10;
    }
   void displayValue(){
        System.out.println("Counter value: " + value);
    } 
}

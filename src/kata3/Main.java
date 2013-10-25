package kata3;

import kata3.control.CalculateHistogramControl;

public class Main {
    
    public static void main(String[] args) {
        Integer [] array = {1,2,5,1,2,3}; 
        CalculateHistogramControl control = new CalculateHistogramControl(array);
        control.execute();
    }
}

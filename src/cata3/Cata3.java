package cata3;

import control.CalculateEmailDomainHistogramControl;
import control.CalculateHistogramControl;

public class Cata3 {

    public static void main(String[] args) {
        Integer[] array = {2, 3, 7, 7, 8, 9, 2, 3};
        CalculateHistogramControl control= new CalculateHistogramControl(array);
        control.execute();
        
        String filename = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Cata3\\archivo.txt";
        CalculateEmailDomainHistogramControl control2 = new CalculateEmailDomainHistogramControl(filename);
        control2.execute();
    }
}

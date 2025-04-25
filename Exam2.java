import java.util.ArrayList;

/**
 * Write a description of class Exam2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exam2
{
    /**
     * Constructor for objects of class Exam2
     */
    public Exam2()
    {
        ArrayList<Double> temperatures = new ArrayList<Double>();
        
        temperatures.add(26.5);
        temperatures.add(37.7);
        temperatures.add(42.1);
        temperatures.add(12.9);
        temperatures.add(64.3);
        temperatures.add(39.9);
        
        feverTemp(temperatures);
    }

    /**
     *Question 24
     */
    public void equalString()
    {
        String myStr1 = "Hello";
        String myStr2 = "Byebye";
        
        System.out.println(myStr1.equals(myStr2)); //outputs false
    }
    
    /**
     * Question 25
     */
    public void feverTemp(ArrayList<Double> temperatures)
    {
        double max = 0;
        
        /*for (int i = 0; temperatures > 37.5 ; i++){
            System.out.println(i);
            System.out.println(temperatures);
        }*/
        
        
        //Question 26
        //System.out.println(temperature.max);
        
        //Question 27
        //temperatur.sort; //sort the temperature inputs
        //System.out.println(temperature.sort(lastvalue)); //gets last temperature
        
    }
}

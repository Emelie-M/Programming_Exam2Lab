import java.util.ArrayList;
import java.util.*;

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
     *Question 24 done by me
     */
    public void equalString()
    {
        String myStr1 = "Hello";
        String myStr2 = "Byebye";
        
        System.out.println(myStr1.equals(myStr2)); //outputs false
    }
    
    /**
     * Question 25 done by teacher
     */
    public void feverTemp(ArrayList<Double> temperatures)
    {
        double max = 0;
        double i = 0;
        
        for(Double temp : temperatures){
            if(temp > 37.5){
                i++;
            }
            if(temp > max){
                max = temp;
            }
        }
        System.out.println(i);
        System.out.println(max);
        
        //Question 26 done by me
        //System.out.println(Collections.max(temperatures));
        
        //Question 27 done bye teacher
        //Collections.sort(temperatures); //sort the temperature inputs
        //System.out.println(temperatures.getLast()); //gets last temperature
        
    }
}

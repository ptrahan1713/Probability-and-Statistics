package setcalculator;

/**
 * This the main method to the SetCalculator.
 * 
 * @author Patrick Trahan
 */
public class SetCalculatorTester
{
    public static void main(String[] args)
    {
        //constructs an object called set 
        SetCalculator set = new SetCalculator();
        
        // - - - - - - - - - - - - - - - // 
        //parameters are below:
        Integer[] first = {1, 3, 5, 7, 9};
        
        Integer[] second = {1, 2, 3, 4, 6, 8, 10};
        
        Integer[] universal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // - - - - - - - - - - - - - - - // 
        
        //call the start up method to run the program
        
        set.startUp(first, second, universal);
    }
}


/**
 * Numero de un display de un reloj digital.
 * El ser horas o minutos está controlado por la clase ClockDisplay.
 * 
 * @author (Sourdaci) 
 * @version (2014-11-10-01)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int number;

    /**
     * Constructor for objects of class NumberDisplay.
     */
    public NumberDisplay(int newNumber)
    {
        // initialise instance variables
        number = newNumber;
    }

    /**
     * Devuelve el valor almacenado en el numero del display.
     */
    public int getTime()
    {
        // put your code here
        return number;
    }
    
    /**
     * Modifica el valor del numero almacenado en el display.
     */
    public void setTime(int newTime)
    {
        number = newTime;
    }
}

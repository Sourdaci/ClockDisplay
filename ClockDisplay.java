
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (Sourdaci) 
 * @version (2014-11-10-01)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay hours;
    private NumberDisplay minutes;

    /**
     * Constructor de un ClockDisplay 00:00 por defecto (como los relojes digitales de verdad)
     */
    public ClockDisplay()
    {
        // initialise instance variables
        hours = new NumberDisplay(0);
        minutes = new NumberDisplay(0);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void getTime()
    {
        int tempHour = hours.getTime();
        int tempMin = minutes.getTime();
        System.out.println(String.format("%02d",tempHour) + ":" + String.format("%02d",tempMin));
    }
    
    /**
     * Cambia la hora almacenada en el reloj (Puesta en hora)
     */
    public void setTime(int newHour, int newMinute)
    {
        if(newHour >= 0 && newHour <= 23 && newMinute >= 0 && newMinute <= 59)
        {
            hours.setTime(newHour);
            minutes.setTime(newMinute);
        }
    }
    
    /**
     * Suma 1 minuto al reloj
     */
    public void timeTick()
    {
        int tempMin = minutes.getTime();
        tempMin++;
        if(tempMin == 60)
        {
            minutes.setTime(0);
            int tempHour = hours.getTime();
            tempHour++;
            if(tempHour ==24){
                hours.setTime(0);
            }else{
                hours.setTime(tempHour);
            }
        }
    }
}


/**
 * Write a description of class BornCloserTo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class Event
{
    private int year;
    private String name;
    
    public Event(int yr, String ev)
    {
        year = yr;
        name = ev;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String getName()
    {
        return name;
    }
}
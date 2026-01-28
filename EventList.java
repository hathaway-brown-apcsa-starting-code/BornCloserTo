
/**
 * Write a description of class EventList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class EventList
{
    ArrayList <Event> herstory;

    public EventList()
    {
        herstory = new ArrayList<Event>();

        // open the file
        File file = new File("EventData.csv");
        Scanner input = null;
        try
        {
            input = new Scanner(file);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("*** Cannot open file ***");
            System.exit(1);        // quit the program
        } 

        // read the words from the file, one per line
        while (input.hasNext())
        {
            String nextEvent = input.nextLine();
            int comma = nextEvent.indexOf(",");
            int year = Integer.parseInt(nextEvent.substring (0, comma));
            String eventName = nextEvent.substring(comma + 1);
            
            herstory.add(new Event(year, eventName));
        }
        input.close();
    }

    public static void main(String [] args)
    {
        EventList ev = new EventList();
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter your birthday year "); 
        int targetYear =  scanner.nextInt();
        for (Event e : herstory)
        { 
            if ((targetYear - e.getYear()) < (currentYear - targetYear)) 
            {
                 System.out.println("You were born closer to" + e.getName() + "than 2026!" + "This event happened in" + e.getYear() + "!"); 
            }
        }
    }
}

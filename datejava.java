import java.util.*;
import java.text.*;

public class datejava
{
           public static String getDay(String day, String month, String year)
           {

            int intyear = Integer.parseInt(year);
            int intDay = Integer.parseInt(day);
            int intmonth = Integer.parseInt(month);

            String dateString = String.format("%d-%d-%d", intyear, intmonth, intDay);
            Date date = null;
            try {
                date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
            }
            catch(ParseException ref){
                ref.printStackTrace();
            }

            // Then get the day of week from the Date based on specific locale.
            String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);

            return dayOfWeek.toUpperCase();
        }


        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            String month = in.next();
            String day = in.next();
            String year = in.next();

            System.out.println(getDay(day, month, year));
        }
    }

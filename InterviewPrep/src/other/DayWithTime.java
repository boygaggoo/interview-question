package other;

public class DayWithTime
{
   private int day;
/**
      Constructs a day with a given year, month, and day
      of the Julian/Gregorian calendar. The Julian calendar
      is used for all days before October 15, 1582
      @param aYear a year != 0
      @param aMonth a month between 1 and 12
      @param aDayOfMonth a day of the month between 1 and 31
      @param hours the hours between 0 and 23
      @param minutes the minutes between 0 and 59
   */
private int hour;
private int minutes;
   public DayWithTime(int aYear, int aMonth, int aDayOfMonth, int hours, int minutes)
   {
     year=aYear;
     month=aMonth;
     day=aDayOfMonth;
     hour=hours;
     minutes = minutes;
   }

   /**
      Returns the year of this day and time
      @return the year
   */
   public int getYear()
   {
      return year;
   }

   /**
      Returns the month of this day and time
      @return the month
   */
   public int getMonthValue()
   {
      return month;
   }

   /**
      Returns the day of the month of this day and time
      @return the day of the month
   */
   public int getDayOfMonth()
   {
      return day;
   }

   /**
      Returns the hours of this day and time
      @return the hours
   */
   public int getHours()
   {
      return hour;
   }
   
   /**
      Returns the minutes of this day and time
      @return the minutes
   */
   public int getMinutes()
   {
      return minutes;
   }

   public String toString()
   {
      return String.format("%04d-%02d-%02d %02d:%2d", year,month,day,hour,minutes);
   }
   

   /**
      Returns a day with time that is a certain number of days away from
      this day with time
      @param n the number of days, can be negative
      @return a day that is n days away from this one
   */
   public DayWithTime plusDays(int n)
   {
      return new DayWithTime(year, month, day+n, hour, minutes);
   }

   /**
      Returns a day with time that is a certain number of days away from
      this day with time
      @param n the number of minutes, can be negative
      @return a day that is n days away from this one
   */
   public DayWithTime plusMinutes(long n)
   { 
	   return new DayWithTime(year, month, day, hour, (int) (minutes+n));
      
   }

   /**
      Returns the number of minutes between this day with time and 
      another day with time.
      @param other the other day with time
      @return the number of minutes that this day with time is away from 
      the other
   */
   public long minutesFrom(DayWithTime other)
   {
	   if(year > other.year) return 1;
       if (year < other.year) return -1;
      if (month > other.month) return 1;
     if (month < other.month) return -1;
        return minutes - other.minutes;
   }

   /**
      Returns the number of days between this day with time and 
      another day with time, rounded to the closest value. (Round 
      any difference >= 12 hours to the next day.)
      @param other the other day with time
      @return the number of days that this day is away from 
      the other (>0 if this day comes later)
   */
   public int daysFrom(DayWithTime other)
   {
	   if(year > other.year) return 1;
       if (year < other.year) return -1;
      if (month > other.month) return 1;
     if (month < other.month) return -1;
        return date - other.date;
   }

   // Private stuff
   private int year;
   private int month;
   private int date;
 
   private static final int[] DAYS_PER_MONTH 
          = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
 
     private static final int GREGORIAN_START_YEAR = 1582;
   private static final int GREGORIAN_START_MONTH = 10;
  private static final int GREGORIAN_START_DAY = 15;
   private static final int JULIAN_END_DAY = 4;
     private static final int JANUARY = 1;
   private static final int FEBRUARY = 2;
   private static final int DECEMBER = 12;
}
package other;

public class MutableDay
{
   /**
      Constructs a day with a given year, month, and day
      of the Julian/Gregorian calendar. The Julian calendar
      is used for all days before October 15, 1582
      @param aYear a year != 0
      @param aMonth a month between 1 and 12
      @param aDayOfMonth a day of the month between 1 and 31
   */
   public MutableDay(int aYear, int aMonth, int aDayOfMonth)
   {
	  
	   if(DAYS_PER_MONTH[aMonth-1]<aDayOfMonth){
		   throw new IllegalStateException();
	   }
      year=aYear;
      month=aMonth;
      date=aDayOfMonth;
   }

   /**
      Returns the year of this day
      @return the year
   */
   public int getYear()
   {
      return year;
   }

   /**
      Returns the month of this day
      @return the month
   */
   public int getMonthValue()
   {
      // Check that the date is valid...
      return month;
   }

   /**
      Returns the day of the month of this day
      @return the day of the month
   */
   public int getDayOfMonth()
   {
      // Check that the date is valid...
      return date;
   }

   public void setYear(int year) 
   {
      this.year=year;
   }
   
   public void setMonthValue(int month) 
   {
	   int date=this.getDayOfMonth();
	   if(DAYS_PER_MONTH[month-1]<date){
		   throw new IllegalStateException();
	   }
      this.month=month;
   }
   
   public void setDayOfMonth(int date) 
   {
	   int month=this.getMonthValue();
	   if(DAYS_PER_MONTH[month-1]<date){
      throw new IllegalStateException();
	   }
	   this.date=date;
   }
   
   public String toString()
   {
      // Check that the date is valid...
	    return String.format("%04d-%02d-%02d", year,month,date);
   }
   
   /**
      Advances this day (or moves it backwards) by a given number of days.
      @param n the number of days, can be negative
   */
   public void plusDays(int n)
   {
	    MutableDay result=this;
	      while (n > 0)
	       {
	          result = result.nextDay();
	          n--;
	     }
	       while (n < 0)
	      {
	        result = result.previousDay();
	           n++;
	    }
	       
	    
   }
   private MutableDay nextDay()
      {
       int y = year;
     int m = month;
    int d = date;
 
     if (y == GREGORIAN_START_YEAR
            && m == GREGORIAN_START_MONTH
           && d == JULIAN_END_DAY)
         d = GREGORIAN_START_DAY;
     else if (d < daysPerMonth(y, m))
          d++;
       else
       {
        d = 1;
        m++;
         if (m > DECEMBER) 
         { 
           m = JANUARY; 
           y++; 
           if (y == 0) y++;
          }
        }
       return new MutableDay(y, m, d);
    }
   private MutableDay previousDay()
     {
    int y = year;
  int m = month;
       int d = date;
    
   if (y == GREGORIAN_START_YEAR
       && m == GREGORIAN_START_MONTH
          && d == GREGORIAN_START_DAY)
     d = JULIAN_END_DAY;
    else if (d > 1)
        d--;
    else
       { 
         m--;
          if (m < JANUARY) 
          {             
         m = DECEMBER; 
             y--; 
              if (y == 0) y--;
           }
        d = daysPerMonth(y, m);
        }
      return new MutableDay(y, m, d);
    }
   private static int daysPerMonth(int y, int m)
     {
      int days = DAYS_PER_MONTH[m - 1];
      if (m == FEBRUARY && isLeapYear(y)) 
       days++;
    return days;
    }
   private static boolean isLeapYear(int y)
     {
       if (y % 4 != 0) return false;
       if (y < GREGORIAN_START_YEAR) return true;
      return (y % 100 != 0) || (y % 400 == 0);
    }

   /**
      Returns the number of days between this day and another
      day
      @param other the other day
      @return the number of days that this day is away from 
      the other (>0 if this day comes later)
   */
   public int daysFrom(MutableDay other)
   {
	 if(year > other.year) return 1;
	       if (year < other.year) return -1;
	      if (month > other.month) return 1;
	     if (month < other.month) return -1;
	        return date - other.date;
   }
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
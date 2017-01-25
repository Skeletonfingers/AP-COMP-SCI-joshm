// i got the switch idea from online because the hint you gave us online caused errors i didnt know how to fix, the array didn't work this worked better
public class Day
{
        final static int MON = 1;
        final static int TUE = 2;
        final static int WED = 3;
        final static int THU = 4;
        final static int FRI = 5;
        final static int SAT = 6;                 
        final static int SUN = 0;
        
        public int Today;         

        public Day(int j)
        {
        	this.Today = j;
        }

        public void setDay(int n)
        {
        	this.Today = n;
        }         

        public int getDay()
        {
        	return Today;
        }
        
        public int ahead(int m) 
        {
        	return ((Today + m) -1 ) % 7;
        }

        public int previousDay() 
        {
            if (Today == 0)
            {
            	return SAT;
            }

            else 
            {
            	Today = (Today - 1) % 7;
            }        
            return Today;           
        }   
        
        public int nextDay()
        {
            if (Today == SAT)
            {return SUN;
            }

            else {Today = (Today + 1) % 7;}            
            return Today;           
        }                  

        public String toString()        
        {
            switch (this.Today) 
               {
                  case SUN:
                        return "Sunday";
                  case MON:
                        return "Monday";
                  case TUE:
                        return "Tuesday";
                  case WED:
                        return "Wednesday";
                  case THU:
                        return "Thursday";
                  case FRI:
                        return "Friday";
                  case SAT:
                        return "Saturday";
                }
                  return "";
        }
}
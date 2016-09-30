package date;
/**
 *
 * @author MarcLeo
 */
public class Date {
    private static int year;
    private static int month;
    private static int day;
    
    public Date() {
        setDate(1000,1,1);
    }  
    
    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int isLeapYear() {
        if(this.year % 4 == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public int isValidDay(int day, int month) {
        if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day == 31) {
            return 1;
        }
        else if((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            return 1;
        }
        else if(month == 2 && day <= 29 && isLeapYear() == 1) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public void setYear(int year) {
        if(year >= 1000 && year <= 9999) {
            this.year = year;
        }
        else {
            throw new IllegalArgumentException("-Invalid year-");
        }
    }
    
    public int getYear() {
        return year;
    }
    
    public void setMonth(int month) {
        if(month >= 1 && month <= 12) {
            this.month = month;
        } 
        else {
            throw new IllegalArgumentException("-Invalid Month-");
        }
    }
    
    public int getMonth() {
        return month;
    }
    
    
    public void setDay(int day) {
        if((day >= 1 && day <= 31) && isValidDay(day, this.month) == 1) {
            this.day = day;
        }
        else {
            throw new IllegalArgumentException("-Invalid Day-");
        }
    }
    
    public int getDay() {
        return day;
    }
      
    public String toString() {
        return String.format("%02d/%02d/%04d", month,day,year);
    }
}
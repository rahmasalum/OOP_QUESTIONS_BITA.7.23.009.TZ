public class Date{
    private int month;
    private int day;
    private int year;
    public Date(int month,int day,int year){
        if(month<1 && month>12){
            this.month=1;
        }else{
            this.month=month;
        }
        this.day=day;
        this.year=year;
    }
    public void setmonth(int month){
        if(month<1 && month>12){
            this.month=1;
        }else{
            this.month=month;
        }   
    }
    public void setday(int day){
        this.day=day;
    }
    public void setyear(int year){
        this.year=year;
    }
    public int getmonth(){
        return month;
    }
    public int getday(){
        return day;
    }
    public int getyear(){
        return year;
    }
    public String MyDate(){
        return month + "/" + day + "/" + year;
    }
}
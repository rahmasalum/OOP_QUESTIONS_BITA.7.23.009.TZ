public class DateTest{
    public static void main(String[]args){
        Date date=new Date(1,1,2002);
        System.out.println(date.getmonth() + "/" + date.getday() + "/" + date.getyear());
        System.out.println(date.MyDate());
    }
}
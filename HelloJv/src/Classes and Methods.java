import java.util.Objects;

class Date{
    private int date;
    private int month;
    private int year;
    public Date(int date, int month, int year){
        if (date >=1 && date <= 31) {
            this.date = date;
        }
        else{
            this.date=1;
        }
        if (month >=1 && month <= 12) {
            this.month = month;
        }
        else{
            this.month=1;
        }
        if (year > 0) {
            this.year = year;
        }
        else{
            this.year=1;
        }
    }
    public int getDate(){
        return date;
    }
    public void setDate(int date){
        this.date=date;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String toString(){
        return this.date + "/" + this.month + "/" +this.year;
    }
    public void printDay(){
        System.out.println(this.date);
    }
    public void printMonth(){
        System.out.println(this.month);
    }
    public void printYear(){
        System.out.println(this.year);
    }
    public void printDate(){
        System.out.println(this.date+ "-" + this.month +"-"+this.year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date1 = (Date) o;
        return date == date1.date && month == date1.month && year == date1.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, month, year);
    }
}
class Main{
    public static void main(String[] args) {
        Date date1 = new Date(30,12,2025);
        Date date2 = new Date(3,2,2023);
        Date date3 = new Date(30,12,2025);

        //date1.printDate();
        //date1.printDay();
        //date1.printMonth();
        //date1.printYear();
        System.out.println(date1);
        System.out.println(date1.equals(date2));
        System.out.println(date1.equals(date3));

        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());
        System.out.println(date3.hashCode());
    }
}

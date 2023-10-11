import java.util.ArrayList;
import java.util.List;

/*
In this question, you are given a particular day, and an integer N.
You have to find out what day will it be, after N days.

Sample Input:
Wednesday
8
Output:
Thursday

 */
public class Main {
    public static void main(String[] args) {
        List<String> week = new ArrayList<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");
    }
    public static String DayWeek(String day, int n, List<String> week){
        while(n>7){
            n=n%7;
        }
        for(int i=0;i<week.size();i++){
            if(week.get(i).equals(day)){
                return week.get(i+n);
            }
        }
        return "";
    }
}
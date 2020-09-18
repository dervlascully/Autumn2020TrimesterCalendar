import java.util.ArrayList;

public class Week {

    public ArrayList<Day> days;
    public int weekOfSemester = 0; // week 1 - 12
    public String startDate; // date of the monday of the week
    public String endDate; // date of the friday of the week

    public Week(int weekOfSemester, String startDate, String endDate){
        this.days = new ArrayList<Day>();
        initialiseDays();
        setWeekOfSemester(weekOfSemester);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setWeekOfSemester(int weekOfSemester){
        if(weekOfSemester >= 1 && weekOfSemester <= 12)
            this.weekOfSemester = weekOfSemester;

        else
            throw new IllegalArgumentException("Invalid week. Weeks range from 1 to 12.\n");
    }

    public String toString(){
        String week = "";
        week += "\nWeek " + this.weekOfSemester + ": " + this.startDate + " - " + this.endDate + "\n\n";
        for (Day day: this.days) {
            week += day.toString();
        }
        return week + "\n";
    }

    public void initialiseDays(){
        for(int i=0; i<5; i++){
            days.add(new Day(i+1));
        }
    }

    public Day getDay(int day){
        return this.days.get(day);
    }

}

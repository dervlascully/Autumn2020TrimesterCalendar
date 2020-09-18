import java.util.ArrayList;

public class Day {

    public ArrayList<Module> modules;
    public int dayOfTheWeek; // 1 - 5, Mond - Fri
    public static String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    public Day(int dayOfTheWeek){
        setDayOfTheWeek(dayOfTheWeek);
        this.modules = new ArrayList<Module>();
    }

    public void setDayOfTheWeek(int dayOfTheWeek){
        if(dayOfTheWeek >= 1 && dayOfTheWeek <= 5)
            this.dayOfTheWeek = dayOfTheWeek;

        else throw new IllegalArgumentException("Invalid day");
    }

    public void insertModule(Module module){
        if(this.modules.isEmpty()) {
            modules.add(module);
            return;
        }

//        System.out.println("hello");
        for (Module mod: modules) {
            if(module.getStartTime() >= mod.getStartTime()){
                modules.add(module);
                break;
            }
        }
    }

    public String toString(){
        String day = "";
        day += "\n" + days[this.dayOfTheWeek-1] + ": ";

        if(this.modules.isEmpty())
            return day + "Day Off!\n";
        day += "\n";
        for (Module mod: modules) {
            day += mod.toString();
        }
        return day + "\n";
    }


}

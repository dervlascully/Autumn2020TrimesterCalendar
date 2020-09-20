import java.util.ArrayList;

public class Day {

    public ArrayList<Module> modules; // Each day has an array list of modules - classes scheduled for that day
    public int dayOfTheWeek; // 1 - 5, indicating Mondday - Friday
    public static String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}; // save typing out below

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
        // add first module of the day
        if(this.modules.isEmpty()) {
            modules.add(module);
            return;
        }

        for (Module mod: modules) {
            // add the module in correct place chronologically
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
            day += mod.toString(); // to string method in module class
        }
        return day + "\n";
    }


}

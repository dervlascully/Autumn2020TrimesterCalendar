import java.util.ArrayList;

public class Module {

    public String moduleName = "";
    public char modeOfDelivery = 0; // O=Online, C=Campus, Initialised to 0
    public double startTime = 0;
    public double endTine = 0;
    public String location = null; // null if online, location if on campus. Initialised to null
    public char classType = 0; // l for lecture, L for lab, t for tutorial
    public static ArrayList<String> moduleNames = null;

    public void moduleNames() {
        moduleNames = new ArrayList<String>();
        moduleNames.add("Stats for Economists");
        moduleNames.add("Networks and Internet Systems");
        moduleNames.add("Data Science in Python");
        moduleNames.add("Program Construction");
        moduleNames.add("Probability Theory");
        moduleNames.add("Introduction to AI");

    }


    public Module(String moduleName, char modeOfDelivery, double startTime, double endTine, String location, char classType) {
        moduleNames();
        setModuleName(moduleName);
        setModeOfDelivery(modeOfDelivery);
        setStartTime(startTime);
        setEndTime(endTine);
        setLocation(location);
        setClassType(classType);

    }


    public void setClassType(char ch){
        if(ch == 'l' || ch == 'L' || ch == 't')
            this.classType = ch;

        else
            throw new IllegalArgumentException("Invalid class type");
    }

    public void setModeOfDelivery(char ch){
        if(ch == 'O' || ch == 'C')
            this.modeOfDelivery = ch;

    }

    public void setLocation(String loc){
        if(this.modeOfDelivery == 'O'){
            this.location = null;
        }

        else
            this.location = loc;
    }

    public void setLocation(){
        if(this.modeOfDelivery == 'O'){
            this.location = null;
        }

        else{
            throw new IllegalArgumentException("Location needed when class is on campus");
        }

    }

    public void setStartTime(double time){
        if(time < 0.00 || time > 23.59){
            throw new IllegalArgumentException("Invalid value for time of module");
        }
        else
            this.startTime = time;
    }
    public void setEndTime(double time){
        if(time < 0.00 || time > 23.59){
            throw new IllegalArgumentException("Invalid value for time of module");
        }
        if(time < startTime){
            throw new IllegalArgumentException("Invalid value for time of module");
        }

        this.endTine = time;
    }

    public void setModuleName(String name){

        if(moduleNames.contains(name))
            this.moduleName = name;

        else
            throw new IllegalArgumentException("Invalid module name.");
    }

    public String toString(){
        String module = "\n";
        module += String.format("%.2f",this.startTime) + " - " + String.format("%.2f",this.endTine) + "\n";
        module += this.moduleName + " - ";
        switch (this.classType){
            case 'l': module += "Lecture" + "\n";
                        break;
            case 'L': module += "Lab" + "\n";
                break;
            default: module += "Tutorial" + "\n";
                break;
        }
//        if(this.modeOfDelivery == 'O')
//            module += "Online" + "\n";
//        else module += "On Campus - " + this.location + "\n";
        module += (this.modeOfDelivery == 'O') ? "Online" + "\n" : ("On Campus - " + this.location + "\n");

        return module;
    }

    public double getStartTime(){
        return this.startTime;
    }
}

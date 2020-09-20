import java.util.ArrayList;
import java.util.Scanner;

public class Calendar {

    // Array of module names to save time retyping below, could do enum either
    String[] moduleNames = {"Stats for Economists", "Data Science in Python", "Program Construction", "Probability Theory", "Introduction to AI", "Networks and Internet Systems" };
    public Week[] weeks; // array of Weeks

    public Calendar(){} // empty constructor (don't need this)


    public void generateCalendar(){

        // initialise the array of 12 weeks

        weeks = new Week[12];
        weeks[0] = new Week(1, "21 September", "27 September");
        weeks[1] = new Week(2, "28 September", "4 October");
        weeks[2] = new Week(3, "5 October", "11 October");
        weeks[3] = new Week(4, "12 October", "18 October");
        weeks[4] = new Week(5, "19 October", "25 October");
        weeks[5] = new Week(6, "26 October", "1 November");
        weeks[6] = new Week(7, "2 November", "8 November");
        weeks[7] = new Week(8, "9 November", "15 November");
        weeks[8] = new Week(9, "16 November", "22 November");
        weeks[9] = new Week(10, "23 November", "29 November");
        weeks[10] = new Week(11, "30 November", "6 December");
        weeks[11] = new Week(12, "7 December", "13 December");

        // Mondays

        // stats for economists, monday 1pm to 2:50pm, Online, lecture
        Module temp = new Module(moduleNames[0], 'O', 13.00, 14.50,  'l');
        for (Week week: weeks) {
            week.days.get(0).insertModule(temp);
        }

        // Tuesdays

        // data science in python, tuesday 10 to 10:50, on campus in b004CSI, lecture
//        temp = new Module(moduleNames[1], 'C', 10.00, 10.50, "B004 CSI", 'l');
//        for (Week week: weeks) {
//            week.days.get(1).insertModule(temp);
//        }

        temp = new Module(moduleNames[2], 'C', 11.00, 11.50, "Science Hub F-H1.37SCH", 'l');
        for (Week week: weeks) {
            week.days.get(1).insertModule(temp);
        }
        temp = new Module(moduleNames[1], 'C', 10.00, 10.50, "B004 CSI", 'l');
        for (Week week: weeks) {
            week.days.get(1).insertModule(temp);
        }

        temp = new Module(moduleNames[3], 'O', 14.00, 14.50,  't');
        for (int i = 2; i<12; i++) {
            weeks[i].days.get(1).insertModule(temp);
        }

        temp = new Module(moduleNames[4], 'O', 15.00, 15.50,  'l');
        for (int i = 0; i<12; i++) {
            if((i+1)%2 != 0)
                weeks[i].days.get(1).insertModule(temp);
        }

        temp = new Module(moduleNames[4], 'C', 15.00, 15.50, "Science East E2.16 SCE", 'l');
        for (int i = 0; i<12; i++) {
            if((i+1)%2 == 0)
                weeks[i].days.get(1).insertModule(temp);
        }

        temp = new Module(moduleNames[1], 'C', 16.00, 16.50, "B002 CSI", 'L');
        for (Week week: weeks) {
            week.days.get(1).insertModule(temp);
        }

        // Wednesday

        temp = new Module(moduleNames[5], 'O', 10.00, 10.50,  'l');
        for (int i = 0; i<12; i++) {
            if((i+1)%2 != 0)
                weeks[i].days.get(2).insertModule(temp);
        }

        temp = new Module(moduleNames[5], 'C', 10.00, 10.50, "B004 CSI", 'l');
        for (int i = 0; i<12; i++) {
            if((i+1)%2 == 0)
                weeks[i].days.get(2).insertModule(temp);
        }

        temp = new Module(moduleNames[0], 'C', 11.00, 11.50, "Newman Building Th. M ART", 't');
        for (int i = 0; i<12; i++) {
            int j = i+1;
            if(j==3 || j==1 || j==5 || j==8 || j==10)
                weeks[i].days.get(2).insertModule(temp);
        }

        temp = new Module(moduleNames[0], 'O', 11.00, 11.50,  't');
        for (int i = 0; i<11; i++) {
            int j = i+1;
            if (!(j==3 || j==1 || j==5 || j==8 || j==10))
                weeks[i].days.get(2).insertModule(temp);
        }

        temp = new Module(moduleNames[5], 'O', 17.00, 18.50, 'L');
        for (int i = 0; i<12; i++) {
            if((i+1)%2 == 0)
                weeks[i].days.get(2).insertModule(temp);
        }

        temp = new Module(moduleNames[5], 'C', 17.00, 18.50, "Science East E1.17 SCE", 'L');
        for (int i = 0; i<12; i++) {
            if((i+1)%2 != 0)
                weeks[i].days.get(2).insertModule(temp);
        }

        // Thursday

        temp = new Module(moduleNames[3], 'O', 10.00, 10.50,  't');
        for (int i = 0; i<11; i++) {
            int j = i+1;
            if (!(j == 1 || j == 8))
                weeks[i].days.get(3).insertModule(temp);
        }

        temp = new Module(moduleNames[3], 'C', 10.00, 10.50, "Science Hub A-H2.18SCH", 't');
        for (int i = 0; i<11; i++) {
            int j = i+1;
            if (j == 1 || j == 8)
                weeks[i].days.get(3).insertModule(temp);
        }

        temp = new Module(moduleNames[2], 'C', 12.00, 12.50, "Agri/Food Sc Centre G-15 AG", 'l');
        for (Week week: weeks) {
            week.days.get(3).insertModule(temp);
        }

        temp = new Module(moduleNames[3], 'O', 13.00, 13.50,  't');
        for (int i = 0; i<11; i++) {
            int j = i+1;
            if (!(j == 3 || j == 10))
                weeks[i].days.get(3).insertModule(temp);
        }

        temp = new Module(moduleNames[3], 'C', 13.00, 13.50, "Science Hub A-H2.18SCH", 't');
        for (int i = 0; i<11; i++) {
            int j = i+1;
            if (j == 3 || j == 10)
                weeks[i].days.get(3).insertModule(temp);
        }

        temp = new Module(moduleNames[4], 'O', 16.00, 16.50,  'l');
        for (Week week: weeks) {
            week.days.get(3).insertModule(temp);
        }

        // Friday

        temp = new Module(moduleNames[4], 'O', 9.00, 9.50, 'l');
        for (int i = 0; i<12; i++) {
            if((i+1)%2 != 0)
                weeks[i].days.get(4).insertModule(temp);
        }

        temp = new Module(moduleNames[4], 'C', 9.00, 9.50, "B106 CSI", 'l');
        for (int i = 0; i<12; i++) {
            if((i+1)%2 == 0)
                weeks[i].days.get(4).insertModule(temp);
        }

        temp = new Module(moduleNames[4], 'O', 10.00, 10.50,  'l');
        for (Week week: weeks) {
            week.days.get(4).insertModule(temp);
        }

        temp = new Module(moduleNames[5], 'O', 11.00, 11.50,  'l');
        for (int i = 0; i<12; i++) {
            if((i+1)%2 != 0)
                weeks[i].days.get(4).insertModule(temp);
        }

        temp = new Module(moduleNames[5], 'C', 11.00, 11.50, "B004 CSI", 'l');
        for (int i = 0; i<12; i++) {
            if((i+1)%2 == 0)
                weeks[i].days.get(4).insertModule(temp);
        }

        temp = new Module(moduleNames[3], 'O', 14.00, 14.50,  't');
        for (int i = 0; i<11; i++) {
            int j = i+1;
            if (!(j == 6))
                weeks[i].days.get(4).insertModule(temp);
        }

        temp = new Module(moduleNames[3], 'C', 14.00, 14.50, "Science Hub A-H2.18SCH", 't');
        for (int i = 0; i<11; i++) {
            int j = i+1;
            if (j == 6)
                weeks[i].days.get(4).insertModule(temp);
        }

    }


    public void display(){

        Scanner sc = new Scanner(System.in);
        System.out.println("\n2020 Autumn Trimester\n");
        System.out.println("Enter a number (1 - 12) to select a week.");
        boolean found = false;
        int week = 0;
        while(!found) {
            while (!sc.hasNextInt())
                sc.next();
            week = sc.nextInt();
            if (week < 1 || week > 12) System.out.println("Invalid input, please reenter.");
            else found = true;
        }

        System.out.println("Enter a number (1-5) to select a day, or enter 6 to display the whole week.\n");
        System.out.println("1. Monday\n2. Tuesday\n3. Wednesday\n4. Thursday\n5. Friday\n6. Display whole schedule for week " + week + ".\n");

        found = false;
        int day = 0;
        while(!found) {
            while (!sc.hasNextInt())
                sc.next();
            day = sc.nextInt();
            if (day < 1 || day > 6) System.out.println("Invalid input, please reenter.");
            else found = true;
        }

        if(day == 6){
            for(int i=0; i<weeks[week-1].days.size(); i++)
                System.out.println(weeks[week-1].getDay(i));
        }

        else
            System.out.println(weeks[week-1].getDay(day - 1));

    }


}

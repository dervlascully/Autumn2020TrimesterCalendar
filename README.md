# Autumn2020TrimesterCalendar

Program that displays my daily / weekly academic calendar for the Autumn 2020 trimester.
This semester due to covid we have a mixture of face to face and online lectures in each module which differ from week to week.
Our calendars on google calendar which are synced to our UCD timetables are a mess due to this and very confusing to follow. 
To remedy this I wrote this program which displays my daily/weekly academic schedule for the 12 week trimester.
For each week it displays the start and end dates of the week and my schedule for each day.
For each day it displays each module name, lecture time (start and end time), mode of delivery (online/on campus), type of class (lecture/tutorial/lab/demo), location.

Module class:
Each module has a name, mode of delivery, start and end time, location, class type.

Day class:
Each day has an array list of modules. This is the schedule of modules for that day. Modules are added to the array list in the correct position chronologically by the insertModule method.

Week class:
Each week has an array list of days which is initialised to 5 days (monday - friday) 

Calendar class:
Calendar has an array of weeks initialised to 12 weeks. In generateCalendar method I initialised the 12 weeks of the semester. For each class in my schedule I constructed a temp module object and added it to each week accordingly.


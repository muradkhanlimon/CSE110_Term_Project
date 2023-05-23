
package ums.coreclasses;

import java.time.LocalTime;

public class Timeslot {
    
    private int       id;
    private String    day;
    private LocalTime startTime;
    private LocalTime endTime;
    
    private String timeslotTitle;
    
    public Timeslot(int id, String day, int startHour, int startMin, int endHour, int endMin) {
        this.id = id;
        this.day = day;
        this.startTime = LocalTime.of(startHour, startMin);
        this.endTime = LocalTime.of(endHour, endMin);
        setTimeslotTitle();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
    
    public void setTimeslotTitle() {
        this.timeslotTitle = day + startTime + " - " + endTime;
    }
    
    public String getTimeslotTitle() {
        return day + " " + startTime + " - " + endTime;
    }
}//Timeslot class ends

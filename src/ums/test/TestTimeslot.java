/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ums.test;

import ums.coreclasses.Timeslot;
import java.time.LocalTime;

/**
 *
 * @author LIMON
 */
public class TestTimeslot {
    public static void main(String[] args) {
        Timeslot a = new Timeslot(1, "MW", 10, 10, 11, 40);
        System.out.println(a.getTimeslotTitle());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ums.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import ums.coreclasses.Generator;
import ums.files.UmsFile;

/**
 *
 * @author LIMON
 */
public class TestUmsFile {
    public static void main(String[] args) throws IOException {
        UmsFile.initialize();
        System.out.println(UmsFile.adminList);
        System.out.println(UmsFile.adminList.containsKey("ADMIN"));
        Generator.setAdminSerial(50);
        System.out.println(Generator.getAdminSerial());
        
        UmsFile.saveAndClose();
        System.out.println(UmsFile.adminList.containsKey("ADMIN"));
        System.out.println(UmsFile.adminList);
    }
}

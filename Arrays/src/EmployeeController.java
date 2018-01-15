/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

/**
 *
 * @author jlkitson
 */
public class EmployeeController {

    public static void main(String[] args) {
        final double PAYRATE = 6.35;
        final int NUM_EMPLOYEES = 7;
        
        //Initialize the array
        Employee[] emp = new Employee[7];

        //Must call seven individual constructors        
        for (int x = 0; x < NUM_EMPLOYEES; x++) {
            
            emp[x] = new Employee(101 + x, PAYRATE);

        }

        //Display values using enhanced loop
        for (Employee worker : emp) {
            System.out.println(worker.getEmpNum() + " " + worker.getEmpSalary());
        }


        //Search
        Scanner input = new Scanner(System.in);
        System.out.println("\nSearch: Enter employee number");
        int empNum = input.nextInt();
        boolean empFound = false;


        for (int i = 0; i < emp.length; ++i){
            if(emp[i].getEmpNum() == empNum){
                System.out.println("Found: ");
                System.out.println(emp[i].getEmpSalary());
                empFound = true;
                //end the loop by maxing check
                i = emp.length;
            }
        }
        if (!empFound){
            System.out.println("not found");
        }
    }
}

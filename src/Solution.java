
/*
* File: Solution.java
* Author: Bartha Levente Gábor
* Copyright: 2025, Bartha Levente Gábor
* Group: IN
* Date: 2025-03-11
* Github: https://github.com/barthaleventegabor/
* Licenc: MIT
*/
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class Solution {
    public static void startSolution() {
        ArrayList<Employee> employeeList = Store.readFile();
        task01(employeeList);
        task02(employeeList);
    }

    public static void task01(ArrayList<Employee> employeeList) {
        Integer countOverThirty = 0;

        LocalDate borderDate = LocalDate.of(1995, 03, 11 + 1);

        for (Employee emp : employeeList) {

            if (emp.getBirth().isBefore(borderDate)) {
                countOverThirty += 1;
            }
        }

        System.out.println(
                countOverThirty + " db 30 évesnél idősebb dolgozó van. A számolás 2025.03.11 dátumra vonatkozik!");
    }

    public static void task02(ArrayList<Employee> employeeList) {
        Double budapestQuantity = 0d;
        Double budapestSum = 0d;
        for (Employee emp : employeeList) {
            if (emp.getCity().equals("Budapest")) {
                budapestQuantity += 1;
                budapestSum += emp.getWage();

            }
        }
        Double budapestAverage = budapestSum / budapestQuantity;

        System.out.printf("A budapesti dolgozók átlagbére: %.2f", budapestAverage);
    }
}

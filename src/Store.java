
/*
* File: Store.java
* Author: Bartha Levente Gábor
* Copyright: 2025, Bartha Levente Gábor
* Group: IN
* Date: 2025-03-11
* Github: https://github.com/barthaleventegabor/
* Licenc: MIT
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public static ArrayList<Employee> readFile() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        try {
            employeeList = tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba a fájl olvasásakor!");
            e.getMessage();
        }

        return employeeList;

    }

    public static ArrayList<Employee> tryReadFile() throws FileNotFoundException {
        File file = new File("laktatkft.txt");
        ArrayList<Employee> employeeList = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(file, "utf-8")) {
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String[] linesp = line.split(";");

                Employee dolgozo = new Employee();

                dolgozo.name = linesp[0];
                dolgozo.city = linesp[1];
                dolgozo.address = linesp[2];

                String[] birthArray = linesp[3].split("-");
                int year = Integer.parseInt(birthArray[0]);
                int month = Integer.parseInt(birthArray[1]);
                int day = Integer.parseInt(birthArray[2]);
                dolgozo.setBirth(LocalDate.of(year, month, day));

                dolgozo.wage = Double.parseDouble(linesp[4]);

                employeeList.add(dolgozo);

            }
        }

        return employeeList;
    }
}
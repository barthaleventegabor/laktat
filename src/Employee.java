
/*
* File: Employee.java
* Author: Bartha Levente Gábor
* Copyright: 2025, Bartha Levente Gábor
* Group: IN
* Date: 2025-03-11
* Github: https://github.com/barthaleventegabor/
* Licenc: MIT
*/
import java.time.LocalDate;

public class Employee {
    String name;
    String city;
    String address;
    LocalDate birth;
    Double wage;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

}

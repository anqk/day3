package day3;

import java.time.LocalDate;

public class EmployeeTest {

    public static void main(String[] args) {


        Employee employee1 = new Employee("Ankita1", "Jairu","750038",28,50000, LocalDate.now());
        Employee employee2 = new Employee("Ankita2","Jairu2","750038",30, 500000,LocalDate.now());

        Employee employee3 = new Employee("Ankita3", "Ankq", "750038", 35, 50000,LocalDate.now());

        employee1.raiseSalary(employee1,10);


        employee1.displayEmployeeDetail();
        employee2.displayEmployeeDetail();
        employee3.displayEmployeeDetail();

    }
    }

package day3;

import java.time.LocalDate;

public class Employee {

    private String firstName; //Man
    private String middleName; // opt
    private String lastName; //Man
    private String socialSecurityNumber; // "750038"
    private int age; //Man
    private double salary; //Man
    private LocalDate hireDate; //Man

    private Employee(){} //Default Constructor

    //Parameterized Constructor
    public Employee(String firstName, String lastName,String socialSecurityNumber, int age, double salary, LocalDate hireDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    public Employee(String firstName, String middleName, String lastName,String socialSecurityNumber, int age, double salary, LocalDate hireDate){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void raiseSalary(Employee employee, double percentage){
        this.salary += (this.salary * percentage)/100;
    }

    public void displayEmployeeDetail() {
        System.out.println(this.firstName);
        System.out.println(this.middleName);
        System.out.println(this.lastName);
        System.out.println(this.age);
        System.out.println(this.salary);
        System.out.println(this.hireDate);
        }
    }


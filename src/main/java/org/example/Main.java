package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        Healthplan plan1 = new Healthplan(1, "Standard Plan", Plan.BASIC);
        Healthplan plan2 = new Healthplan(2, "Premium Plan", Plan.PREMIUM);

        String[] healthplans = {"Basic Plan", "Premium Plan", "VIP Plan"};
        Employee employee = new Employee(101, "Ali Veli", "ali@example.com", "password123", healthplans);
        employee.addHealthPlan(0, plan1.getName());
        employee.addHealthPlan(1, plan2.getName());
        employee.addHealthPlan(2, "VIP Plan");

        String[] employees = {"Ali", "Veli", "Ayşe", "Fatma"};
        Company company = new Company(1, "TechCorp", 50000, employees);
        company.addEmployee(0, "Ali Veli");
        company.addEmployee(1, "Mehmet Kaya");


        System.out.println(plan1);
        System.out.println(plan2);
        System.out.println(employee);
        System.out.println(company);
    }
}

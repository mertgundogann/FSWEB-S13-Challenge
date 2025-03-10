package org.example;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;


    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String[] getHealthPlans() { return healthplans; }

    public void addHealthPlan(int index, String name) {
        if (index < 0 || index >= healthplans.length) {
            System.out.println("Hata: Geçersiz indeks.");
        } else if (healthplans[index] == null) {
            healthplans[index] = name;
        } else {
            System.out.println("Hata: Bu indeks dolu.");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }
}

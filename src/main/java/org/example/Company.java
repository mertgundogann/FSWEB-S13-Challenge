package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    // Constructor, String[] developerNames parametresi alacak şekilde güncellendi
    public Company(int id, String name, double giro, String[] developerNames) {
        if (giro < 0) {
            throw new IllegalArgumentException("Giro değeri negatif olamaz.");
        }
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames; // String[] dizisini alıyoruz
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getGiro() { return giro; }
    public void setGiro(double giro) {
        if (giro < 0) {
            System.out.println("Giro değeri negatif olamaz.");
        } else {
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() { return developerNames; }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Hata: Geçersiz indeks.");
        } else if (developerNames[index] == null) {
            developerNames[index] = name;
        } else {
            System.out.println("Hata: Bu indeks dolu.");
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}

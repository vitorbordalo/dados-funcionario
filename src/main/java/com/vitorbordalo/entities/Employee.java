package com.vitorbordalo.entities;
public class Employee {

    private String name;
    private double grossSalay;

    public Employee() {
    }

    public Employee(String name, double grossSalay) {
        this.name = name;
        this.grossSalay = grossSalay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalay() {
        return grossSalay;
    }

    public void setGrossSalay(double grossSalay) {
        this.grossSalay = grossSalay;
    }
}

package S8.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    public double percentage;

    public double NetSalary() { return grossSalary - tax; }
    public double IncreaseSalary() { return (grossSalary - tax) + (grossSalary * (percentage / 100)); }
}

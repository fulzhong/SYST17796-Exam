/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

/**
 *
 * @author calvi
 */
public abstract class Employee {
    String name;
    double hourlyRate;
    double hoursWorked;
    
    abstract double calculatePay();
}

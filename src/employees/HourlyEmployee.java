/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

/**
 *
 * @author calvi
 */
public class HourlyEmployee extends Employee{
    
    
    @Override
    public double calculatePay(){
        return hourlyRate*hoursWorked;
    }
}

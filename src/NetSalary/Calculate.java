/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NetSalary;

/**
 *
 * @author calvi
 */
public class Calculate {
    public static double calculateNet(Double hours,Double rate,Double tax){
        return hours*rate-tax;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
    
//import java.util.Scanner;
/**
 *
 * @author Sibusiso Mabaso
 * 
 */
public class Classes {

  
    public static void main(String[] args) {
     
        Car c1 = new Car("Honda", "2013", 30000);
        Car c2 = new Car("Toyota", "2014", 27000);
        
        System.out.printf("The price of the %s model %s is %.2f\n",
                c1.getModel(), c1.getYear(), c1.getPrice());
        System.out.printf("The price of the %s model %s is %.2f\n",
                c2.getModel(), c2.getYear(), c2.getPrice());
    }
    
}

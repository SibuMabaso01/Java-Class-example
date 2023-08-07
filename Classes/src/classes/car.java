/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

class Car{
    private String model;
    private String year;
    private double price;
    
    
    public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        if (price > 0.0){
            this.price = price;
        }
        
    }
    
    public void setModel(String model) {
       this.model = model;
      
    }
    
    public void setYear(String year){
        this.year = year;
        
    }
    
     public void setPrice(String model) {
       this.price = price;
      
    }
     
     public String getModel(){
       return model;
      
    } 
     
    public double getPrice(){
       return price;
      
    } 
    
    public String getYear(){
       return year;
      
    } 
     
    public void applyDiscount(double discount){
        price = price - (price * discount);
    }
    
}

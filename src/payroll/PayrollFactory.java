/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Saranjeet
 */
public class PayrollFactory { // Singleton class is created to better handle creating 
                              // instances of class for implementation
    
    private static PayrollFactory instance;
    
    
    private PayrollFactory(){
        
    }
    
    public static PayrollFactory getInstance(){
        
        if (instance ==null){
            instance = new PayrollFactory();
        }
        return instance;
    }
    
    public Employee createEmployee (PayrollType type){  
        
        //We are creating a method with Employee as the return object
        
        switch (type){
            
            case MANAGER :
                return new Manager(type,"Bob",10,25);
               
            case EMPLOYEE:
                return new Employee (type,"John",12,15);
            
            
                
        }
          return null;
    }
    
   
    
    
}


import java.util.Scanner;


public class BryanMejoradaAssignment {

    public static void main(String[] args) {
  
        String material = "";
        double linearExpansionCoefficiant = 0.0;
        double displacement = 0.0;
        double changeInTemperature = 0.0;
        
       
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a material name: ");
        material = input.next();
        
        System.out.println("Please enter the linear expanision coefficiant: ");
        linearExpansionCoefficiant = input.nextDouble();
        
        System.out.println("Please enter the amount of displacement in meters: ");
        displacement = input.nextDouble();
        
        System.out.println("Please enter initial temperature in Celsius: ");
        changeInTemperature = input.nextDouble();
        
       
        
        if(material.equalsIgnoreCase("aluminum"))
        {
            double linearDisplacement = linearExpansionCoefficiant*displacement*changeInTemperature;
            
            
            
            System.out.println("The material is: " + material + "\n" + 
                    "and the amount of linear displacement is: " + linearDisplacement + "");
        }
        {
        System.out.println("Please enter a material name: ");
        material = input.next();
        
        System.out.println("Please enter the linear expanision coefficiant: ");
        linearExpansionCoefficiant = input.nextDouble();
        
        System.out.println("Please enter the amount of displacement in meters: ");
        displacement = input.nextDouble();
        
        System.out.println("Please enter initial temperature in Celsius: ");
        changeInTemperature = input.nextDouble();
        
        
         if(material.equalsIgnoreCase("copper"))
        {
            double linearDisplacement = linearExpansionCoefficiant*displacement*changeInTemperature;
            
      
            
            System.out.println("The material is: " + material + "\n" + 
                    "and the amount of linear displacement is: " + linearDisplacement + "");
            
            {
                System.out.println("Please enter a material name: ");
                material = input.next();
                
                System.out.println("Please enter the linear expanision coefficiant: ");
                linearExpansionCoefficiant = input.nextDouble();
                
                System.out.println("Please enter the amount of displacement in meters: ");
                displacement = input.nextDouble();
                
                System.out.println("Please enter initial temperature in Celsius: ");
                changeInTemperature = input.nextDouble();
                
                
                 if(material.equalsIgnoreCase("glass"))
                {
                    double linearDisplacement1 = linearExpansionCoefficiant*displacement*changeInTemperature;
                    
              
                    
                    System.out.println("The material is: " + material + "\n" + 
                            "and the amount of linear displacement is: " + linearDisplacement + "");
                    {
                        System.out.println("Please enter a material name: ");
                        material = input.next();
                        
                        System.out.println("Please enter the linear expanision coefficiant: ");
                        linearExpansionCoefficiant = input.nextDouble();
                        
                        System.out.println("Please enter the amount of displacement in meters: ");
                        displacement = input.nextDouble();
                        
                        System.out.println("Please enter initial temperature in Celsius: ");
                        changeInTemperature = input.nextDouble();
                        
                        
                         if(material.equalsIgnoreCase("steel"))
                        {
                            double linearDisplacement2 = linearExpansionCoefficiant*displacement*changeInTemperature;
                            
                      
                            
                            System.out.println("The material is: " + material + "\n" + 
                                    "and the amount of linear displacement is: " + linearDisplacement + "");
                            
                }
                         }
                    
            
                }
                 }
            
        }
        
        
    }
    
}
}

                
        
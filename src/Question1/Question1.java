/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question1;

/**
 *
 * @author dhiva
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] vehicle = {"SUV", "COUPE", "SEDAN", "VAN"};
        String[] months = {"JAN", "FEB", "MAR"};
        
        int[][] monthlySales = {
            {25, 15, 35},
            {25, 55, 35},
            {11, 20, 45},
            {17, 27, 25}
        };
        
        // print header
        System.out.println("--------------------------------------");
        System.out.println("VEHICLE SALES REPORT");
        System.out.println("--------------------------------------");
      
         // Print month headings
        System.out.printf("%-10s", "");  // leave space for vehicle column
        for (int m = 0; m < months.length; m++) {
            System.out.printf("%8s", months[m]);
        }
        System.out.println();
        
        // print data
         for (int i = 0; i < vehicle.length; i++) {
            System.out.printf("%-10s %8d %8d %8d%n", 
                              vehicle[i],
                              monthlySales[i][0], 
                              monthlySales[i][1], 
                              monthlySales[i][2]);  // formatted rows
        }
        
         // Print headers
        System.out.println("--------------------------------------");
        System.out.println("VEHICLE TOTAL SALESS");
        System.out.println("--------------------------------------");
        
          // Calculate totals and check if total sales per month are greater than or equal to 100
        for (int i = 0; i < vehicle.length; i++) {
            int total = monthlySales[i][0] + monthlySales[i][1] + monthlySales[i][2];
            
            if (total >= 100) {
                System.out.println(vehicle[i] + "  " + total + "(Gold star)");
            } else {
                System.out.println(vehicle[i] + "  " + total + "(Silver Star)");
            }
        }
                
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question2;
import java.util.*;

/**
 *
 * @author dhiva
 */
public class MovieTickets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the customer name: ");
        String customerName = scanner.nextLine();
        
        System.out.println("Enter the movie: ");
        String movieName = scanner.nextLine();
        
        System.out.println("Enter the customer age: ");
        int customerAge = scanner.nextInt();
        
        System.out.println("Enter the movie cost: ");
        double priceOfMovie = scanner.nextDouble();
        
        // Create TicketSales object
        TicketSales ticket = new TicketSales(customerName, movieName, customerAge, priceOfMovie);

        // Print the ticket
        // class.method
        ticket.printTickets();
        
    }
    
}

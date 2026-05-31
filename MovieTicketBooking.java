package com.example;

import java.util.Scanner;

public class MovieTicketBooking {

    private static int availableSeats = 50;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== MOVIE TICKET BOOKING SYSTEM =====");

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        System.out.print("Number of Tickets: ");
        int tickets = sc.nextInt();

        if (tickets <= availableSeats) {

            availableSeats -= tickets;
            double totalAmount = tickets * 200;

            System.out.println("\nBooking Successful!");
            System.out.println("Customer : " + name);
            System.out.println("Movie    : " + movie);
            System.out.println("Tickets  : " + tickets);
            System.out.println("Amount   : Rs." + totalAmount);
            System.out.println("Available Seats: " + availableSeats);

        } else {
            System.out.println("Sorry! Not enough seats available.");
        }

        sc.close();
    }
}

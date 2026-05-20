package com.info.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

import com.info.entity.Event;
import com.info.exception.DuplicateEventException;
import com.info.exception.EventNotFoundException;
import com.info.exception.InvalidEventException;
import com.info.service.EventService;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    EventService service = new EventService();
     
		while(true) {
			try {
				System.out.println("\n1. Add Event");
				System.out.println("2. View All Event");
				System.out.println("3. View Event By Date");
				System.out.println("4. Delete Event");
				System.out.println("5. Exit");
				System.out.println("Chhose Option :");
				int choice = Integer.parseInt(sc.nextLine());
				
				switch(choice) {
				
				case 1 : 
					System.out.print("Title : ");
					String title = sc.nextLine();
					
					System.out.print("Date (YYYY-MM-DD) :");
					LocalDate date = LocalDate.parse(sc.nextLine());
					
					System.out.println("Start Time(HH:MM) :");
					LocalTime start = LocalTime.parse(sc.nextLine());
					
					System.out.print("End Time(HH:MM) :");
					LocalTime end = LocalTime.parse(sc.nextLine());
					
					System.out.print("Description :");
					String desc = sc.nextLine();
					
					service.addEvent(new Event(title,date,start,end,desc));
					System.out.println("Event added successfully");
					break;
					
				case 2:
					List<Event> allEvents = service.getAllEvents();
					if(allEvents.isEmpty()) {
						System.out.println("No events found");
					}
					else {
						for(Event e : allEvents) {
							System.out.println(e);
						}
					}
					break;
			
				case 3:
					System.out.println("Enter Date (YYYY-MM-DD):");
					LocalDate searchDate = LocalDate.parse(sc.nextLine());
					List<Event> eventsByDate = service.getEventsByDate(searchDate);
					if(eventsByDate.isEmpty()) {
						System.out.println("No Events found");
					}
					else {
						for(Event e : eventsByDate) {
						  System.out.println(e);
						}
					}
					break;
					
				case 4:
					System.out.println("Enter title to delete the event");
					String deleteTitle = sc.nextLine();
					service.deleteEvent(deleteTitle);
					System.out.println("Event deleted successfully");
					break;
				
				case 5:
					System.out.println("Exiting....");
					System.exit(0);
					break;
					
				default : 
					System.out.println("Invalid Choice");
				}
			}
			catch(DuplicateEventException | EventNotFoundException | InvalidEventException e) {
				System.out.println("Error :" + e.getMessage());
			}
			catch(Exception e) {
				System.out.println("Error : Invalid input");
			}
			
		}
	}
}

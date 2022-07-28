package project;
import java.util.*;
public class Event {
	String Event_Id;
	String name;
	String user_Id ;
	double price ;
	String venue ;
	public String getEvent_Id() {
		return Event_Id;
	}
	public void setEvent_Id(String event_Id) {
		Event_Id = event_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	Event(String event_Id, String name, String user_Id, double price, String venue) {
		this.Event_Id = event_Id;
		this.name = name;
		this.user_Id = user_Id;
		this.price = price;
		this.venue = venue;
	}
	
}

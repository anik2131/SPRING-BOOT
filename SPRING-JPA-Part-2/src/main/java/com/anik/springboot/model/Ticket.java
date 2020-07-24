package com.anik.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ticket")
public class Ticket {
	@Id
	private int ticketid;
	private String ticketname;

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public String getTicketname() {
		return ticketname;
	}

	public void setTicketname(String ticketname) {
		this.ticketname = ticketname;
	}

	public Ticket(int ticketid, String ticketname) {
		super();
		this.ticketid = ticketid;
		this.ticketname = ticketname;
	}

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

}

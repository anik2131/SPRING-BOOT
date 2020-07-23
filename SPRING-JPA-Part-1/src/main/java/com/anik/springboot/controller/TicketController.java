package com.anik.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anik.springboot.dao.TicketDao;
import com.anik.springboot.model.Ticket;
import com.anik.springboot.service.TicketService;

@Controller
public class TicketController {

	@Autowired
	TicketDao ticketDao;
	@Autowired
	TicketService service;

	@GetMapping("/view-tickets")
	public String getTickets(ModelMap model) {
		List<Ticket> tickets = (List<Ticket>) ticketDao.findAll();
		model.addAttribute("tickets", tickets);
		return "view.jsp";
	}

	@PostMapping("/add-ticket")
	public String store(@RequestParam int ticketid, @RequestParam String ticketname , ModelMap model) {
		if(service.selectById(ticketid, (List<Ticket>) ticketDao.findAll())==null)
		{
			ticketDao.save(new Ticket(ticketid, ticketname));
			return "redirect:/view-tickets";
		}
		else
		{
			model.addAttribute("error" , "TICKET ID ALREADY EXISTS!!");
			return "ticket.jsp";
		}
		
	}

	@GetMapping("/add-ticket")
	public String getTicketAdd() {
		return "ticket.jsp";
	}

	@PostMapping("/delete")
	public String delete(@RequestParam int ticketId) {
		ticketDao.delete(service.selectById(ticketId, (List<Ticket>) ticketDao.findAll()));
		return "redirect:/view-tickets";
	}

}

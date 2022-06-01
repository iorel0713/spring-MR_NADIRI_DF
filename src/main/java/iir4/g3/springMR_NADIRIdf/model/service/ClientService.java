package iir4.g3.springMR_NADIRIdf.model.service;

import java.util.List;

import iir4.g3.springMR_NADIRIdf.model.Ticket;

public interface ClientService {

	List<Ticket> getTickets(int idClient);

	void ajoutTicket(Ticket ticket, int idClient);
	
}

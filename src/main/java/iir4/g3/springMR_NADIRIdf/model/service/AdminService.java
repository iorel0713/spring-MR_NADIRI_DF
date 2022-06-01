package iir4.g3.springMR_NADIRIdf.model.service;

import java.util.List;

import iir4.g3.springMR_NADIRIdf.model.Ticket;

public interface AdminService {

	List<Ticket> getTicketsNonAttribuer();

	void attribuerTicket(int idDev, int idTicket);
}

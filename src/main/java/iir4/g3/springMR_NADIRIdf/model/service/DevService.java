package iir4.g3.springMR_NADIRIdf.model.service;



import java.util.List;

import iir4.g3.springMR_NADIRIdf.model.Ticket;



public interface DevService  {
	List<Ticket> getTickets(int idDev);

	void editStatus(Ticket ticket, int idDev);


}

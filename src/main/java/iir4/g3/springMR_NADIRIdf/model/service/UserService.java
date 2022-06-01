package iir4.g3.springMR_NADIRIdf.model.service;



import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import iir4.g3.springMR_NADIRIdf.model.User;



public interface UserService extends UserDetailsService {
	 void save(User user);
	 List<User> liste();
	 void supprimer(int id);
	 void ajouter(User user);
	 void modifier(User user);
	 User getUser(int id);
	} 

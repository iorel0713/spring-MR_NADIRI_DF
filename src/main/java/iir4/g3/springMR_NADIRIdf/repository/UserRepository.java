package iir4.g3.springMR_NADIRIdf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iir4.g3.springMR_NADIRIdf.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUserName(String name);
}

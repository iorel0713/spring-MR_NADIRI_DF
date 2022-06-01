package iir4.g3.springMR_NADIRIdf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iir4.g3.springMR_NADIRIdf.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	public Role findByNom(String nom);
}

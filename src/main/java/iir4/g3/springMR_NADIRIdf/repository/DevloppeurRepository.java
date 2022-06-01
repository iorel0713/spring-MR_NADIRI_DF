package iir4.g3.springMR_NADIRIdf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iir4.g3.springMR_NADIRIdf.model.Devloppeur;
@Repository
public interface DevloppeurRepository extends JpaRepository<Devloppeur, Integer> {

}

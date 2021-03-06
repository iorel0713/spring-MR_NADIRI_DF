package iir4.g3.springMR_NADIRIdf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String nom;

 public Role() {

 }



 public Long getId() {
 return id;
 }
 public void setId(Long id) {
 this.id = id;
 }
 public Role(String name) {
 super();
 this.nom = name;
 }
 public String getNom() {
 return nom;
 }
 public void setNom(String name) {
 this.nom = name;
 }
} 

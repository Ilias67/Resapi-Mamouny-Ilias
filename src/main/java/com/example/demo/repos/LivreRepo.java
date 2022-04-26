package com.example.demo.repos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Livre;



@Transactional
public interface LivreRepo  extends JpaRepository<Livre, Integer>{
	
				List<Livre> findAllById(Integer id);
				List<Livre> findAll();
				
}

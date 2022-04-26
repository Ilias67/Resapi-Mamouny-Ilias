package com.example.demo;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Livre;
import com.example.demo.repos.LivreRepo;

@SpringBootApplication
public class ControleJeeApplication{
	
@Autowired
private LivreRepo livreRepo;

public static void main(String[] args) {
SpringApplication.run(ControleJeeApplication.class, args);
}
//@Override
public void run(String... args ) throws Exception{
System.out.println("***********Insertion************");
livreRepo.save(
new Livre(null, "La condition humaine", "Gallimard",new Date(), "André Marlaux", 1500,"1-2654-5528-2625",null,true));
livreRepo.save(
new Livre(null, "Voyage au bout de la nuit", "Minuit",new Date(), " Louis-Ferdinand Céline", 1500,"1-2105-5289-9124",null,false));
livreRepo.save(
new Livre(null, "L'étranger", "Gallimard",new Date(), "Albert Kamus", 1300,"1-2789-5289-2216",null,true));


}
}


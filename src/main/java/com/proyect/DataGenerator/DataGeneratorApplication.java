package com.proyect.DataGenerator;

import com.proyect.DataGenerator.models.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataGeneratorApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(DataGeneratorApplication.class, args);
  }

  Persona persona = new Persona();

  @Override
  public void run(String... args) throws Exception {
    System.out.println(persona.toString());
  }
}

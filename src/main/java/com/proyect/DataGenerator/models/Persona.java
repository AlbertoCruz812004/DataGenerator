package com.proyect.DataGenerator.models;

import net.datafaker.Faker;
import net.datafaker.providers.base.IdNumber;
import net.datafaker.providers.base.PhoneNumber;

public class Persona {

  public Persona() {
    this.id = faker.idNumber();
    this.dni = faker.idNumber();
    this.numSeguroSocial = faker.idNumber();
    this.telefonoFijo = faker.phoneNumber();
    this.telefonoMovil = faker.phoneNumber().cellPhone();
    this.name = faker.name().fullName();
  }

  private Faker faker = new Faker();

  private IdNumber id;
  private IdNumber dni;
  private IdNumber numSeguroSocial;
  private PhoneNumber telefonoFijo;
  private String telefonoMovil;
  private String name;

  @Override
  public String toString() {
    return String.format(
      """
        id = %s
        dni = %s
        numSeguro = %s
        telefonoFijo = %s
        telefonoMovil = %s
        name = %s
    """,
      id.toString(),
      dni.toString(),
      numSeguroSocial.toString(),
      telefonoFijo.toString(),
      telefonoMovil,
      name
    );
  }
}

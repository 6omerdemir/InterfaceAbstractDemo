package org.example;

import org.example.Abstract.BaseCustomerManager;
import org.example.Adapters.MernisServiceAdapter;
import org.example.Concrete.CustomerCheckManager;
import org.example.Concrete.NeroCustomerManager;
import org.example.Concrete.StarbucksCustomerService;
import org.example.Entities.Customer;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());

        Customer customer = new Customer();
        customer.setDateOfBirth(LocalDate.of(2000,1,1));
        customer.setFirstName("Ad");
        customer.setLastName("Soyad");
        customer.setNationalityId("12345678912");

        customerManager.Save(customer);

    }
}
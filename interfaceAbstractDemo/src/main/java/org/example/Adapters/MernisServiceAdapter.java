package org.example.Adapters;

import org.example.Abstract.ICustomerCheckService;
import org.example.Entities.Customer;

import java.time.LocalDate;
import java.util.Objects;

public class MernisServiceAdapter implements ICustomerCheckService {
    //Mernis için bir simülasyon.
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        if(Objects.equals(customer.getFirstName(), "Ad")
                && Objects.equals(customer.getLastName(), "Soyad")
                && Objects.equals(customer.getNationalityId(), "12345678912")
                && customer.getDateOfBirth().equals(LocalDate.of(2000, 1, 1))){
            return true;
        }else{
            return false;
        }

    }
}

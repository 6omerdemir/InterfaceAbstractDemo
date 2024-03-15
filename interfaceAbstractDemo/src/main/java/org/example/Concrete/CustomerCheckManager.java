package org.example.Concrete;

import org.example.Abstract.ICustomerCheckService;
import org.example.Abstract.ICustomerService;
import org.example.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

    public boolean CheckIfRealPerson(Customer customer){
        return true;
    }
}

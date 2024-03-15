package org.example.Concrete;

import org.example.Abstract.BaseCustomerManager;
import org.example.Abstract.ICustomerCheckService;
import org.example.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
    public NeroCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    private ICustomerCheckService customerCheckService;

    @Override
    public void Save(Customer customer) {
        if(customerCheckService.CheckIfRealPerson(customer)){
            super.Save(customer);
        }else{
            System.out.println("Not a valid person.");
        }
    }
}

package edu.training.js.task_customer;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
    private List<Customer> customerList = new ArrayList<Customer>();

    public Bank() {
    	
    }

    public void addCustomer(Customer customer) {
    	
    	customerList.add(customer);
    	
    }
    
    public List<Customer> getCustomers() {
    	
        return customerList;
        
    }

    public void sortCustomerByLastName() {
    	
        for (int i = 0; i < customerList.size(); i++) {
        	
            Customer current = customerList.get(i);
            int index = i;

            for (int j = i + 1; j < customerList.size(); j++) {
                String lastName1 = current.getLastName();
                String lastName2 = customerList.get(j).getLastName();

                if (lastName2.compareTo(lastName1) < 0) {
                    current = customerList.get(j);
                    index = j;
                }
            }

            customerList.set(index, customerList.get(i));
            customerList.set(i, current);

        }

    }

    public List<Customer> searchByRangeOfCard(String fromCardNumber, String byCardNumber) {
    	
    	List<Customer> result = new ArrayList<>();
    	
        for (int i = 0; i < customerList.size(); i++) {
        	
            Customer customer = customerList.get(i);

            if (customer.getCreditCardNumber().compareTo(fromCardNumber) > 0 && customer.getCreditCardNumber().compareTo(byCardNumber) < 0) {
            	
            	result.add(customer);
            	
            }
            
        }
        return result;
        
    }


}

package edu.training.js.task_customer;

public class Main {

	public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addCustomer(new Customer(1,"Сидоров", "C.", "C.","Минск ул.Центральная 1", "11111", "100"));
        bank.addCustomer(new Customer(2,"Пупкин", "Н.", "Н.","Минск ул.Центральная 2", "45637", "101"));
        bank.addCustomer(new Customer(3,"Петров", "А.", "А.", "Минск ул.Центральная 3", "28546", "102"));
        bank.addCustomer(new Customer(4,"Шишкин", "В.", "В.", "Минск ул.Центральная 4", "95487", "103"));
        bank.addCustomer(new Customer(5,"Иванов", "И.", "И.", "Минск ул.Центральная 5", "12345", "104"));

        bank.sortCustomerByLastName();

		for (Customer customer : bank.getCustomers()) {
			System.out.println(customer.toString());
		}

        System.out.println();
        
		for (Customer customer : bank.searchByRangeOfCard("10000", "40000")) {
			System.out.println(customer.toString());
		}

	}

}

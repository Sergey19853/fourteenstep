package edu.training.js.task_customer;

import java.util.Objects;

public class Customer {

	private int id;
    private String lastName;
    private String name;
    private String middleName;
    private String address;
    private String creditCardNumber;
    private String bankAccountNumber;

    public Customer(int id, String lastName, String name, String middleName, String address, String creditCardNumber, String bankAccountNumber) {
    	
    	setId(id);
    	setLastName(lastName);
        setName(name);
        setMiddleName(middleName);
        setAddress(address);
        setCreditCardNumber(creditCardNumber);
        setBankAccountNumber(bankAccountNumber);
        
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", lastName=" + lastName + ", name=" + name + ", middleName=" + middleName
				+ ", address=" + address + ", creditCardNumber=" + creditCardNumber + ", bankAccountNumber="
				+ bankAccountNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, bankAccountNumber, creditCardNumber, id, lastName, middleName, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && Objects.equals(bankAccountNumber, other.bankAccountNumber)
				&& Objects.equals(creditCardNumber, other.creditCardNumber) && id == other.id
				&& Objects.equals(lastName, other.lastName) && Objects.equals(middleName, other.middleName)
				&& Objects.equals(name, other.name);
	}
	
}

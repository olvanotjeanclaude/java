import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean newCustomer(String customerName, double transaction) {
        if (this.findCustomer(customerName) != null) {
            System.out.println("Customer already exitsts. Please choose another name!");
            return false;
        }

        Customer newCustomer = new Customer(customerName, transaction);
        this.customers.add(newCustomer);
        System.out.println("customer ["+customerName+"] added successfuly.");
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = this.findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(transaction);
            System.out
                    .println(customer.getName() + "'s transaction with amount " + transaction + " successfully added");
            return true;
        }

        return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}

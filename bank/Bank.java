import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        if (this.findBranch(name) != null) {
            System.out.println("Branch already exitsts. Please choose another name!");
            return false;
        }

        Branch branch = new Branch(name);
        this.branches.add(branch);
        System.out.println("Branch [" + branch.getName() + "] added successfuly.");
        
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initTransaction) {
        Customer CustomerExisting = this.findCustomer(customerName);
        Branch branch = this.findBranch(branchName);

        if (branch != null) {
            if (CustomerExisting != null) {
                System.out.println("Customer already exitsts. Please choose another name!");
                return false;
            }

            branch.newCustomer(customerName, initTransaction);
            return true;
        } else {
            System.out.println("branch doesn't exist.");
        }

        return false;
    }

    public void addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = this.findBranch(branchName);
        boolean error=false;
        if (branch != null) {
            Customer customer = this.findCustomer(customerName);
            if (customer != null) {
                customer.addTransaction(transaction);
            } else {
                error=true;
            }
        } else {
            error=true;
        }

        if(error){
            System.out.println("==>Transaction failed.");
        }
    }

    public void listCustomers(String branchName) {
        listCustomers(branchName, true);
    }

    public boolean listCustomers(String branchName, boolean transactions) {
        Branch branch = this.findBranch(branchName);

        if (branch == null) {
            System.out.println("Nothing to show.");
            return false;
        }

        ArrayList<Customer> customers = branch.getCustomers();

        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (transactions) {
                System.out.println("Customer: " + customer.getName() + " [" + (i + 1) + "]");
                System.out.println("Transactions");
                customer.printTransactions(customer.getTransactions());
            } else {
                System.out.println("Customer: " + customer.getName() + " [" + (i + 1) + "]");
            }
        }

        return true;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }

        return null;
    }

    private Customer findCustomer(String name) {
        if (branches.size() > 0) {
            for (Branch branch : branches) {
                ArrayList<Customer> customers = branch.getCustomers();
                for (Customer customer : customers) {
                    if (customer.getName().equals(name)) {
                        return customer;
                    }
                }
            }
        }

        return null;
    }

    public void welcome() {
        System.out.println("======================================\n" + "Welcome to bank " + this.name
                + "\n======================================");
    }
}

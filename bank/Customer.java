import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double transaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.initAccount(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
        System.out.println(this.name + "'s transaction " + transaction + " successfully added.");
    }

    private void initAccount(double amount) {
        this.transactions.add(amount);
    }

    public void printTransactions(ArrayList<Double> transactions) {
        int transactionSize = transactions.size();
        if (transactionSize > 0) {
            for (int i = 0; i < transactionSize; i++) {
                System.out.println("[" + (i + 1) + "] amount " + transactions.get(i) + " [" + (i + 1) + "]");
            }
        }
    }
}

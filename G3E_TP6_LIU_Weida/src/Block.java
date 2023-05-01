import java.util.LinkedList;
import java.util.Queue;

class Block {
    private final Queue<Transaction> transactions;

    public Block() {
        this.transactions = new LinkedList<>();
    }

    public Queue<Transaction> getTransactions() {
        return transactions;
    }

    public Block add(Transaction transaction) {
        if (transactions.size() < 10) {
            transactions.add(transaction);
            if (transactions.size() == 10) {
                for (Transaction t : transactions) {
                    t.pay();
                }
            }
            return this;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Transactions:\n");
        for (Transaction transaction : transactions) {
            stringBuilder.append(transaction.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}

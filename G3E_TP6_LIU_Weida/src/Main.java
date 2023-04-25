import java.util.*;

public class Main {
    private static Map<Integer, Wallet> wallets = new HashMap<>();
    private static List<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {

        String[] studentNames = {"Weida", "Xiaofan", "Mathis", "Tugdual", "Nicoals"};

        for (String name : studentNames) {
            Wallet wallet = new Wallet(name);
            wallet.setIsepCoins(10);
            wallets.put(wallet.getToken(), wallet);
        }


        simulateTransactions(); //Simulation


        analyzeBlockchain(); //Analyse


        printLastNBlocks(1); //Afficher le dernier bloc


       analyzeMaliciousStudent(); //Analyse des activités des étudiants malveillants


    }

    public static void simulateTransactions() {
        Random random = new Random();
        List<Wallet> walletList = new ArrayList<>(wallets.values());

        for (int i = 0; i < 55; i++) {
            Wallet sender = walletList.get(random.nextInt(walletList.size()));
            Wallet receiver = walletList.get(random.nextInt(walletList.size()));
            int amount = random.nextInt(sender.getIsepCoins() + 1);

            Transaction transaction = new Transaction(sender, receiver, amount);

            if (blockchain.isEmpty() || blockchain.get(blockchain.size() - 1).getTransactions().size() == 10) {
                Block block = new Block();
                blockchain.add(block);
            }

            Block currentBlock = blockchain.get(blockchain.size() - 1);
            currentBlock.add(transaction);
        }
    }

    public static void analyzeBlockchain() {
        System.out.println("Blockchain content:");

        for (Block block : blockchain) {
            System.out.println(block.toString());
        }

        System.out.println("Wallets state:");

        for (Wallet wallet : wallets.values()) {
            System.out.printf("Owner: %s, ISEP Coins: %d%n", wallet.getOwner(), wallet.getIsepCoins());
        }
    }
    public static void printLastNBlocks(int n) {
        System.out.printf("Le dernier bloc est");
        for (int i = blockchain.size() - n; i < blockchain.size(); i++) {
            System.out.println(blockchain.get(i).toString());
        }
    }

    public static void analyzeMaliciousStudent() {
        Wallet maliciousWallet = wallets.values().iterator().next();
        int transactionCount = 0;
        int isepCoins = 0;

        for (Block block : blockchain) {
            for (Transaction transaction : block.getTransactions()) {
                if (transaction.getOriginWallet().equals(maliciousWallet)) {
                    transactionCount++;
                    isepCoins += transaction.getIsepCoins();
                }
            }
        }
        System.out.printf("Étudiant malveillant: %s, Transactions: %d, ISEP Coins: %d%n",
                maliciousWallet.getOwner(), transactionCount, isepCoins);
    }


}

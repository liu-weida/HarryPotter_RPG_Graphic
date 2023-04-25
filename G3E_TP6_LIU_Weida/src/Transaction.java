class Transaction {
    private final Wallet originWallet;
    private final Wallet destinationWallet;
    private final int isepCoins;
    private boolean payed;

    public Transaction(Wallet originWallet, Wallet destinationWallet, int isepCoins) {
        this.originWallet = originWallet;
        this.destinationWallet = destinationWallet;
        this.isepCoins = isepCoins;
        this.payed = false;
    }

    public Wallet getOriginWallet() {
        return originWallet;
    }

    public Wallet getDestinationWallet() {
        return destinationWallet;
    }

    public int getIsepCoins() {
        return isepCoins;
    }

    public boolean isPayed() {
        return payed;
    }

    public boolean pay() {
        if (originWallet.getIsepCoins() >= isepCoins && !originWallet.equals(destinationWallet)) {
            originWallet.setIsepCoins(originWallet.getIsepCoins() - isepCoins);
            destinationWallet.setIsepCoins(destinationWallet.getIsepCoins() + isepCoins);
            payed = true;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "originWallet=" + originWallet.getOwner() +
                ", destinationWallet=" + destinationWallet.getOwner() +
                ", isepCoins=" + isepCoins +
                ", payed=" + payed +
                '}';
    }
}

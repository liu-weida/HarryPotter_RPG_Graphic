class Wallet {
    private final String owner;
    private final int token;
    private int isepCoins;

    public Wallet(String owner) {
        this.owner = owner;
        this.token = (int) (Math.random() * 1000000);
    }

    public String getOwner() {
        return owner;
    }

    public int getToken() {
        return token;
    }

    public int getIsepCoins() {
        return isepCoins;
    }

    public void setIsepCoins(int isepCoins) {
        this.isepCoins = isepCoins;
    }
}

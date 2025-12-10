package model;

public class SumOfAllMany {
    private int amount;

    public SumOfAllMany(int coin, int many) {
        this.amount = coin + many;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

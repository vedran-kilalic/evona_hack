package com.team3.evona.models;

public class Transactions {

    String txId;
    String providerId;
    int amount;
    Player player;

    public Transactions(String txId, String providerId, int amount, Player player) {
        this.txId = txId;
        this.providerId = providerId;
        this.amount = amount;
        this.player = player;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Player getPlayerData() {
        return player;
    }

    public void setPlayerData(Player player) {
        this.player = player;
    }
}

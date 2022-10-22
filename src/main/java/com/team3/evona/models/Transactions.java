package com.team3.evona.models;

public class Transactions {

    String txId;
    String providerId;
    int amount;
    PlayerData playerData;

    public Transactions(String txId, String providerId, int amount, PlayerData playerData) {
        this.txId = txId;
        this.providerId = providerId;
        this.amount = amount;
        this.playerData = playerData;
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

    public PlayerData getPlayerData() {
        return playerData;
    }

    public void setPlayerData(PlayerData playerData) {
        this.playerData = playerData;
    }
}

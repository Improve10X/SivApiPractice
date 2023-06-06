package com.example.sivapipractice;

import com.google.gson.annotations.SerializedName;

public class Money {
    private String amount;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @SerializedName("current_subtotal_price_set")
    private String currencyCode;
}

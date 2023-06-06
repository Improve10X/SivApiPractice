package com.example.sivapipractice;

import com.google.gson.annotations.SerializedName;

public class TaxLine {
    @SerializedName("channel_liable")
    private Boolean channelLiable;

    private String price;
    @SerializedName("price_set")

    private PriceSet priceSet;

    private Float rate;

    private String title;
}

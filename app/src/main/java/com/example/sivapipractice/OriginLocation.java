package com.example.sivapipractice;

import com.google.gson.annotations.SerializedName;

public class OriginLocation {
    @SerializedName("country_code")
    private String countryCode;

    @SerializedName("province_code")
    private String provinceCode;
    private String name;
    private String address1;
    private String address2;
    private String city;
    private String zip;
}
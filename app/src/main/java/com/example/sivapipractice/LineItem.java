package com.example.sivapipractice;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LineItem {
    private String id;
    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @SerializedName("fulfillable_quantity")
    private Integer fulfillableQuantity;
    @SerializedName("fulfillment_service")
    private String fulfillmentService;
    @SerializedName("fulfillment_status")
    private String fulfillmentStatus;
    @SerializedName("gift_card")
    private boolean giftCard;
    private Integer grams;
    private String name;
    @SerializedName("origin_location")
    private OriginLocation originLocation;
    @SerializedName("pre_tax_price")
    private String preTaxPrice;
    @SerializedName("pre_tax_price_set")
    private PriceSet preTaxPriceSet;
    private String price;
    @SerializedName("price_set")
    private PriceSet PriceSet;
    @SerializedName("product_exists")
    private boolean productExists;
    @SerializedName("product_id")
    private Integer productId;
    private List<String> properties;
    private Integer quantity;
    @SerializedName("requires_shipping")
    private boolean requiresShipping;
    private String sku;
    @SerializedName("tax_code")
    private String taxCode;
    private boolean taxable;
    private String title;
    @SerializedName("total_discount")
    private String totalDiscount;
    @SerializedName("total_discount_set")
    private PriceSet totalDiscountSet;
    @SerializedName("variant_id")
    private Integer variantId;
    @SerializedName("variant_inventory_management")
    private String variantInventoryManagement;
    @SerializedName("variant_title")
    private String variantTitle;
    private String vendor;
    @SerializedName("tax_lines")
    private List<TaxLine> taxLines;

    private List<String> duties;

    @SerializedName("discount_allocations")
    private List<String> discountAllocations;

    public List<TaxLine> getTaxLines() {
        return taxLines;
    }

    public void setTaxLines(List<TaxLine> taxLines) {
        this.taxLines = taxLines;
    }

    public List<String> getDuties() {
        return getDuties();
    }
}
package com.dlucchesi.nscomm.core.model;

public interface PriceRow extends BaseEntity {
    @Override
    boolean canEqual(Object obj);

    Double getPrice();

    String getCurrency();

    String getDescription();

    Product getProduct();

    void setPrice(Double price);

    void setCurrency(String currency);

    void setDescription(String description);

    void setProduct(Product product);
}

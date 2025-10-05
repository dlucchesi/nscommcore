package com.dlucchesi.nscomm.core.model;

public interface Product extends BaseEntity {
    String getName();

    String getDescription();

    void setName(String name);

    void setDescription(String description);

    java.util.Collection<PriceRow> getPriceRows();

    void setPriceRows(java.util.Collection<PriceRow> priceRows);
}

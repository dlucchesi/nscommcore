package com.dlucchesi.nscomm.core.model;

public interface Classification extends BaseEntity {
    @Override
    boolean canEqual(Object obj);

    String getName();

    String getDescription();

    java.util.Collection<Product> getProducts();

    void setName(String name);

    void setDescription(String description);

    void setProducts(java.util.Collection<Product> products);
}

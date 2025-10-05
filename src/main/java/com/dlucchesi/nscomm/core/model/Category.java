package com.dlucchesi.nscomm.core.model;

public interface Category extends BaseEntity {
    @Override
    boolean canEqual(Object obj);

    String getName();

    String getDescription();

    java.util.Collection<com.dlucchesi.nscomm.core.model.Category> getSubCategories();

    com.dlucchesi.nscomm.core.model.Category getParentCategory();

    java.util.Collection<Product> getProducts();

    void setName(String name);

    void setDescription(String description);

    void setSubCategories(java.util.Collection<com.dlucchesi.nscomm.core.model.Category> subCategories);

    void setParentCategory(com.dlucchesi.nscomm.core.model.Category parentCategory);

    void setProducts(java.util.Collection<Product> products);
}

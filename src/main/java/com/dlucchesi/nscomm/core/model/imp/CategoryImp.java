package com.dlucchesi.nscomm.core.model.imp;

import com.dlucchesi.nscomm.core.model.Category;
import com.dlucchesi.nscomm.core.model.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@Entity
public class CategoryImp extends BaseEntityImp implements com.dlucchesi.nscomm.core.model.Category {

    @Column(nullable = false, length = 50)
    protected String name;
    @Column(nullable = false, length = 50)
    protected String description;
    @OneToMany(mappedBy = "parentCategory",
            targetEntity = CategoryImp.class)
    protected Collection<Category> subCategories;
    @ManyToOne(targetEntity = CategoryImp.class)
    protected Category parentCategory;
    @ManyToMany(mappedBy = "categories",
            targetEntity = ProductImp.class)
    protected Collection<Product> products;


    @Override
    public boolean canEqual(Object obj) {
        return (obj instanceof CategoryImp);
    }
}

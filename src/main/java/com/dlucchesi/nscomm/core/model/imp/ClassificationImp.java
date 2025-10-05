package com.dlucchesi.nscomm.core.model.imp;

import com.dlucchesi.nscomm.core.model.Product;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@Entity
public class ClassificationImp extends BaseEntityImp implements com.dlucchesi.nscomm.core.model.Classification {

    @Column(nullable = false, length = 50)
    protected String name;
    @Column(nullable = false, length = 150)
    protected String description;
    @ManyToMany(mappedBy = "classifications",
            targetEntity = ProductImp.class)
    protected Collection<Product> products;

    @Override
    public boolean canEqual(Object obj) {
        return (obj instanceof ClassificationImp);
    }
}

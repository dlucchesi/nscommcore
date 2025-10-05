package com.dlucchesi.nscomm.core.model.imp;

import com.dlucchesi.nscomm.core.model.Classification;
import com.dlucchesi.nscomm.core.model.PriceRow;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@Entity
public class ProductImp extends BaseEntityImp implements com.dlucchesi.nscomm.core.model.Product {

    @Column(nullable = false, length = 50)
    protected String name;
    protected String description;
    @OneToMany(mappedBy = "product",
            targetEntity = PriceRowImp.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true)
    protected Collection<PriceRow> priceRows;
    @ManyToMany
    @JoinTable(
            name = "t_product_classification",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "classification_id")
    )
    protected Collection<Classification> classifications;


    @Override
    public boolean canEqual(Object obj) {
        return (obj instanceof ProductImp);
    }
}

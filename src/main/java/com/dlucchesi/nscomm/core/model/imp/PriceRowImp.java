package com.dlucchesi.nscomm.core.model.imp;

import com.dlucchesi.nscomm.core.model.Product;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PriceRowImp extends BaseEntityImp implements com.dlucchesi.nscomm.core.model.PriceRow {

    @Column(nullable = false)
    protected Double price;
    @Column(nullable = false)
    protected String currency;
    protected String description;
    @ManyToOne(optional = false, targetEntity = ProductImp.class)
    protected Product product;

    @Override
    public boolean canEqual(Object obj) {
        return (obj instanceof PriceRowImp);
    }
}

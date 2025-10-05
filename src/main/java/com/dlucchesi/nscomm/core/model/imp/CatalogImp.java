package com.dlucchesi.nscomm.core.model.imp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@Entity
public class CatalogImp extends BaseEntityImp implements com.dlucchesi.nscomm.core.model.Catalog {

    @Column(nullable = false, length = 50)
    protected String name;
    @Column(nullable = false, length = 150)
    protected String description;
    @Column(nullable = false)
    protected Long version;
    @Column(nullable = false)
    protected Boolean master;



    @Override
    public boolean canEqual(Object obj) {
        return (obj instanceof CatalogImp);
    }
}

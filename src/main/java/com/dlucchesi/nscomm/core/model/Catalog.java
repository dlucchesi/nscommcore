package com.dlucchesi.nscomm.core.model;

public interface Catalog extends BaseEntity {
    @Override
    boolean canEqual(Object obj);

    String getName();

    String getDescription();

    Long getVersion();

    Boolean getMaster();

    void setName(String name);

    void setDescription(String description);

    void setVersion(Long version);

    void setMaster(Boolean master);
}

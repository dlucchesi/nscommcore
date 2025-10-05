package com.dlucchesi.nscomm.core.model;

public interface BaseEntity {
    boolean canEqual(Object obj);

    @Override
    boolean equals(Object obj);

    @Override
    int hashCode();

    @Override
    String toString();

    Long getId();

    Boolean getIsDeleted();

    Boolean getIsActive();

    java.util.Date getCreatedAt();

    java.util.Date getUpdatedAt();

    void setId(Long id);

    void setIsDeleted(Boolean isDeleted);

    void setIsActive(Boolean isActive);

    void setCreatedAt(java.util.Date createdAt);

    void setUpdatedAt(java.util.Date updatedAt);
}

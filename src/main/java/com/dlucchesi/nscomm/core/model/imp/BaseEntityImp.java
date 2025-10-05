package com.dlucchesi.nscomm.core.model.imp;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntityImp implements com.dlucchesi.nscomm.core.model.BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "un_seq")
    protected Long id;
    protected Boolean isDeleted;
    protected Boolean isActive;
    @Temporal(TemporalType.TIMESTAMP)
    // formate yyyy-MM-dd HH:mm:ss
    @Column(updatable = false, nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    protected Date createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    protected Date updatedAt;

    @Override
    public abstract boolean canEqual(Object obj);

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BaseEntityImp that = (BaseEntityImp) obj;
        return id != null && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getIsDeleted(), getIsActive());
    }

    @Override
    public String toString() {
        return "BaseEntity(" +
                "id: " + this.id +
                ", isDeleted: " + this.isDeleted +
                ", isActive: " + this.isActive +
                ", createdAt: " + this.createdAt +
                ", updatedAt: " + this.updatedAt +
                ")";
    }

}

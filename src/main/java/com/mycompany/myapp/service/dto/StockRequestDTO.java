package com.mycompany.myapp.service.dto;

import com.mycompany.myapp.domain.enumeration.Status;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A DTO for the {@link com.mycompany.myapp.domain.StockRequest} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class StockRequestDTO implements Serializable {

    private Long id;

    private Double qtyRequired;

    private Instant reqDate;

    private Boolean isProd;

    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQtyRequired() {
        return qtyRequired;
    }

    public void setQtyRequired(Double qtyRequired) {
        this.qtyRequired = qtyRequired;
    }

    public Instant getReqDate() {
        return reqDate;
    }

    public void setReqDate(Instant reqDate) {
        this.reqDate = reqDate;
    }

    public Boolean getIsProd() {
        return isProd;
    }

    public void setIsProd(Boolean isProd) {
        this.isProd = isProd;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StockRequestDTO)) {
            return false;
        }

        StockRequestDTO stockRequestDTO = (StockRequestDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, stockRequestDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "StockRequestDTO{" +
            "id=" + getId() +
            ", qtyRequired=" + getQtyRequired() +
            ", reqDate='" + getReqDate() + "'" +
            ", isProd='" + getIsProd() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
}

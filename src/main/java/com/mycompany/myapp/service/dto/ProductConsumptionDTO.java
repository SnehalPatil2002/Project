package com.mycompany.myapp.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.mycompany.myapp.domain.ProductConsumption} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class ProductConsumptionDTO implements Serializable {

    private Long id;

    private Double quantityConsumed;

    private Double totalProductsCost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQuantityConsumed() {
        return quantityConsumed;
    }

    public void setQuantityConsumed(Double quantityConsumed) {
        this.quantityConsumed = quantityConsumed;
    }

    public Double getTotalProductsCost() {
        return totalProductsCost;
    }

    public void setTotalProductsCost(Double totalProductsCost) {
        this.totalProductsCost = totalProductsCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProductConsumptionDTO)) {
            return false;
        }

        ProductConsumptionDTO productConsumptionDTO = (ProductConsumptionDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, productConsumptionDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ProductConsumptionDTO{" +
            "id=" + getId() +
            ", quantityConsumed=" + getQuantityConsumed() +
            ", totalProductsCost=" + getTotalProductsCost() +
            "}";
    }
}

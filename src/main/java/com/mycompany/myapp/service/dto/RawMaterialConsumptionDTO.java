package com.mycompany.myapp.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.mycompany.myapp.domain.RawMaterialConsumption} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class RawMaterialConsumptionDTO implements Serializable {

    private Long id;

    private Double quantityConsumed;

    private Double scrapGenerated;

    private Double totalMaterialCost;

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

    public Double getScrapGenerated() {
        return scrapGenerated;
    }

    public void setScrapGenerated(Double scrapGenerated) {
        this.scrapGenerated = scrapGenerated;
    }

    public Double getTotalMaterialCost() {
        return totalMaterialCost;
    }

    public void setTotalMaterialCost(Double totalMaterialCost) {
        this.totalMaterialCost = totalMaterialCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RawMaterialConsumptionDTO)) {
            return false;
        }

        RawMaterialConsumptionDTO rawMaterialConsumptionDTO = (RawMaterialConsumptionDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, rawMaterialConsumptionDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "RawMaterialConsumptionDTO{" +
            "id=" + getId() +
            ", quantityConsumed=" + getQuantityConsumed() +
            ", scrapGenerated=" + getScrapGenerated() +
            ", totalMaterialCost=" + getTotalMaterialCost() +
            "}";
    }
}

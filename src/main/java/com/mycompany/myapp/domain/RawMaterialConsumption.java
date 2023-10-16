package com.mycompany.myapp.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * A RawMaterialConsumption.
 */
@Entity
@Table(name = "raw_material_consumption")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class RawMaterialConsumption implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "quantity_consumed")
    private Double quantityConsumed;

    @Column(name = "scrap_generated")
    private Double scrapGenerated;

    @Column(name = "total_material_cost")
    private Double totalMaterialCost;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public RawMaterialConsumption id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQuantityConsumed() {
        return this.quantityConsumed;
    }

    public RawMaterialConsumption quantityConsumed(Double quantityConsumed) {
        this.setQuantityConsumed(quantityConsumed);
        return this;
    }

    public void setQuantityConsumed(Double quantityConsumed) {
        this.quantityConsumed = quantityConsumed;
    }

    public Double getScrapGenerated() {
        return this.scrapGenerated;
    }

    public RawMaterialConsumption scrapGenerated(Double scrapGenerated) {
        this.setScrapGenerated(scrapGenerated);
        return this;
    }

    public void setScrapGenerated(Double scrapGenerated) {
        this.scrapGenerated = scrapGenerated;
    }

    public Double getTotalMaterialCost() {
        return this.totalMaterialCost;
    }

    public RawMaterialConsumption totalMaterialCost(Double totalMaterialCost) {
        this.setTotalMaterialCost(totalMaterialCost);
        return this;
    }

    public void setTotalMaterialCost(Double totalMaterialCost) {
        this.totalMaterialCost = totalMaterialCost;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RawMaterialConsumption)) {
            return false;
        }
        return id != null && id.equals(((RawMaterialConsumption) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "RawMaterialConsumption{" +
            "id=" + getId() +
            ", quantityConsumed=" + getQuantityConsumed() +
            ", scrapGenerated=" + getScrapGenerated() +
            ", totalMaterialCost=" + getTotalMaterialCost() +
            "}";
    }
}

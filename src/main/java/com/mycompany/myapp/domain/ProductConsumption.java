package com.mycompany.myapp.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * A ProductConsumption.
 */
@Entity
@Table(name = "product_consumption")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class ProductConsumption implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "quantity_consumed")
    private Double quantityConsumed;

    @Column(name = "total_products_cost")
    private Double totalProductsCost;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public ProductConsumption id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQuantityConsumed() {
        return this.quantityConsumed;
    }

    public ProductConsumption quantityConsumed(Double quantityConsumed) {
        this.setQuantityConsumed(quantityConsumed);
        return this;
    }

    public void setQuantityConsumed(Double quantityConsumed) {
        this.quantityConsumed = quantityConsumed;
    }

    public Double getTotalProductsCost() {
        return this.totalProductsCost;
    }

    public ProductConsumption totalProductsCost(Double totalProductsCost) {
        this.setTotalProductsCost(totalProductsCost);
        return this;
    }

    public void setTotalProductsCost(Double totalProductsCost) {
        this.totalProductsCost = totalProductsCost;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProductConsumption)) {
            return false;
        }
        return id != null && id.equals(((ProductConsumption) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ProductConsumption{" +
            "id=" + getId() +
            ", quantityConsumed=" + getQuantityConsumed() +
            ", totalProductsCost=" + getTotalProductsCost() +
            "}";
    }
}

package com.mycompany.myapp.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * A TotalConsumption.
 */
@Entity
@Table(name = "total_consumption")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class TotalConsumption implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "total_material_cost")
    private Double totalMaterialCost;

    @Column(name = "total_products_cost")
    private Double totalProductsCost;

    @Column(name = "final_cost")
    private Double finalCost;

    @ManyToOne(fetch=FetchType.LAZY)
    private Projects projects;
    
    @ManyToOne(fetch=FetchType.LAZY)
    private Products products;
    
    
    public Projects getProjects() {
		return projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}
   
    public Long getId() {
        return this.id;
    }

    public TotalConsumption id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotalMaterialCost() {
        return this.totalMaterialCost;
    }

    public TotalConsumption totalMaterialCost(Double totalMaterialCost) {
        this.setTotalMaterialCost(totalMaterialCost);
        return this;
    }

    public void setTotalMaterialCost(Double totalMaterialCost) {
        this.totalMaterialCost = totalMaterialCost;
    }

    public Double getTotalProductsCost() {
        return this.totalProductsCost;
    }

    public TotalConsumption totalProductsCost(Double totalProductsCost) {
        this.setTotalProductsCost(totalProductsCost);
        return this;
    }

    public void setTotalProductsCost(Double totalProductsCost) {
        this.totalProductsCost = totalProductsCost;
    }

    public Double getFinalCost() {
        return this.finalCost;
    }

    public TotalConsumption finalCost(Double finalCost) {
        this.setFinalCost(finalCost);
        return this;
    }

    public void setFinalCost(Double finalCost) {
        this.finalCost = finalCost;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TotalConsumption)) {
            return false;
        }
        return id != null && id.equals(((TotalConsumption) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "TotalConsumption{" +
            "id=" + getId() +
            ", totalMaterialCost=" + getTotalMaterialCost() +
            ", totalProductsCost=" + getTotalProductsCost() +
            ", finalCost=" + getFinalCost() +
            "}";
    }
}

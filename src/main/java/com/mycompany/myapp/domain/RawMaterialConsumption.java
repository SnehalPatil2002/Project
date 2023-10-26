package com.mycompany.myapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.time.Instant;
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

    @Column(name = "usage_date")
    private Instant usageDate;

    @JsonIgnoreProperties(value = { "products", "warehouse" }, allowSetters = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private RawMaterial rawMaterial;
    // jhipster-needle-entity-add-field - JHipster will add fields here

    @JsonIgnoreProperties(value = { "rawMaterials" }, allowSetters = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private Products products;
    @JsonIgnoreProperties(value = { "product" }, allowSetters = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductionLine productionLine;

    @JsonIgnoreProperties(value = { "projects" }, allowSetters = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private Projects projects;

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

    public RawMaterial getRawMaterial() {
        return rawMaterial;
    }

    public void setRawMaterial(RawMaterial rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    public RawMaterialConsumption rawMaterial(RawMaterial rawMaterial){
        this.setRawMaterial(rawMaterial);
        return this;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public RawMaterialConsumption products(Products products){
        this.setProducts(products);
        return this;
    }
    public ProductionLine getProductionLine() {
        return productionLine;
    }

    public RawMaterialConsumption productionLine(ProductionLine productionLine){
        this.setProductionLine(productionLine);
        return this;
    }
    public void setProductionLine(ProductionLine productionLine) {
        this.productionLine = productionLine;
    }

    public Projects getProjects() {
        return projects;
    }

    public RawMaterialConsumption projects(Projects projects){
        this.setProjects(projects);
        return this;
    }
    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    public Instant getUsageDate() {
        return usageDate;
    }

    public RawMaterialConsumption usageDate(Instant usageDate) {
        this.setUsageDate(usageDate);
        return this;
    }

    public void setUsageDate(Instant usageDate) {
        this.usageDate = usageDate;
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
            ", rawMaterial= " + getRawMaterial() +
            ", products= " + getProducts() +
            ", productionLine= " + getProductionLine() +
            ", projects= " + getProjects() +
            "}";
    }
}

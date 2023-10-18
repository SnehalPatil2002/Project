package com.mycompany.myapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mycompany.myapp.domain.enumeration.Status;
import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;

/**
 * A StockRequest.
 */
@Entity
@Table(name = "stock_request")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class StockRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "qty_required")
    private Double qtyRequired;

    @Column(name = "req_date")
    private Instant reqDate;

    @Column(name = "is_prod")
    private Boolean isProd;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;


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
    @ManyToOne(fetch = FetchType.LAZY)
    private Projects projects;


    public Long getId() {
        return this.id;
    }

    public StockRequest id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQtyRequired() {
        return this.qtyRequired;
    }

    public StockRequest qtyRequired(Double qtyRequired) {
        this.setQtyRequired(qtyRequired);
        return this;
    }

    public void setQtyRequired(Double qtyRequired) {
        this.qtyRequired = qtyRequired;
    }

    public Instant getReqDate() {
        return this.reqDate;
    }

    public StockRequest reqDate(Instant reqDate) {
        this.setReqDate(reqDate);
        return this;
    }

    public void setReqDate(Instant reqDate) {
        this.reqDate = reqDate;
    }

    public Boolean getIsProd() {
        return this.isProd;
    }

    public StockRequest isProd(Boolean isProd) {
        this.setIsProd(isProd);
        return this;
    }

    public void setIsProd(Boolean isProd) {
        this.isProd = isProd;
    }

    public Status getStatus() {
        return this.status;
    }

    public StockRequest status(Status status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public RawMaterial getRawMaterial() {
        return rawMaterial;
    }

    public void setRawMaterial(RawMaterial rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    public StockRequest rawMaterial(RawMaterial rawMaterial){
        this.setRawMaterial(rawMaterial);
        return this;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public StockRequest products(Products products){
        this.setProducts(products);
        return this;
    }
    public ProductionLine getProductionLine() {
        return productionLine;
    }

    public void setProductionLine(ProductionLine productionLine) {
        this.productionLine = productionLine;
    }

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }
// jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StockRequest)) {
            return false;
        }
        return id != null && id.equals(((StockRequest) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "StockRequest{" +
            "id=" + getId() +
            ", qtyRequired=" + getQtyRequired() +
            ", reqDate='" + getReqDate() + "'" +
            ", isProd='" + getIsProd() + "'" +
            ", status='" + getStatus() + "'"+
            "}";
    }
}

package com.mycompany.myapp.service.criteria;

import java.io.Serializable;
import java.util.Objects;
import org.springdoc.api.annotations.ParameterObject;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.*;

/**
 * Criteria class for the {@link com.mycompany.myapp.domain.RawMaterialConsumption} entity. This class is used
 * in {@link com.mycompany.myapp.web.rest.RawMaterialConsumptionResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /raw-material-consumptions?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
@ParameterObject
@SuppressWarnings("common-java:DuplicatedBlocks")
public class RawMaterialConsumptionCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private DoubleFilter quantityConsumed;

    private DoubleFilter scrapGenerated;

    private DoubleFilter totalMaterialCost;
    private LongFilter rawMaterialId;
    private LongFilter productsId;

    private LongFilter productionLineId;
    private LongFilter projectsId;

    private InstantFilter usageDate;

    private Boolean distinct;

    public RawMaterialConsumptionCriteria() {}

    public RawMaterialConsumptionCriteria(RawMaterialConsumptionCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.quantityConsumed = other.quantityConsumed == null ? null : other.quantityConsumed.copy();
        this.scrapGenerated = other.scrapGenerated == null ? null : other.scrapGenerated.copy();
        this.totalMaterialCost = other.totalMaterialCost == null ? null : other.totalMaterialCost.copy();
        this.rawMaterialId = other.rawMaterialId == null ? null : other.rawMaterialId.copy();
        this.productsId = other.productsId == null ? null : other.productsId.copy();
        this.productionLineId = other.productionLineId == null ? null : other.productionLineId.copy();
        this.projectsId = other.projectsId == null ? null : other.projectsId.copy();
        this.usageDate = other.usageDate == null ? null : other.usageDate.copy();
        this.distinct = other.distinct;
    }

    @Override
    public RawMaterialConsumptionCriteria copy() {
        return new RawMaterialConsumptionCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public LongFilter id() {
        if (id == null) {
            id = new LongFilter();
        }
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public DoubleFilter getQuantityConsumed() {
        return quantityConsumed;
    }

    public DoubleFilter quantityConsumed() {
        if (quantityConsumed == null) {
            quantityConsumed = new DoubleFilter();
        }
        return quantityConsumed;
    }

    public void setQuantityConsumed(DoubleFilter quantityConsumed) {
        this.quantityConsumed = quantityConsumed;
    }

    public DoubleFilter getScrapGenerated() {
        return scrapGenerated;
    }

    public DoubleFilter scrapGenerated() {
        if (scrapGenerated == null) {
            scrapGenerated = new DoubleFilter();
        }
        return scrapGenerated;
    }

    public void setScrapGenerated(DoubleFilter scrapGenerated) {
        this.scrapGenerated = scrapGenerated;
    }

    public DoubleFilter getTotalMaterialCost() {
        return totalMaterialCost;
    }

    public DoubleFilter totalMaterialCost() {
        if (totalMaterialCost == null) {
            totalMaterialCost = new DoubleFilter();
        }
        return totalMaterialCost;
    }

    public void setTotalMaterialCost(DoubleFilter totalMaterialCost) {
        this.totalMaterialCost = totalMaterialCost;
    }

    public LongFilter getRawMaterialId() {
        return rawMaterialId;
    }

    public void setRawMaterialId(LongFilter rawMaterial) {
        this.rawMaterialId = rawMaterial;
    }
    public LongFilter rawMaterialId() {
        if (rawMaterialId == null) {
            rawMaterialId = new LongFilter();
        }
        return rawMaterialId;
    }

    public LongFilter getProductsId() {
        return productsId;
    }
    public LongFilter productsId(){
        if(productsId == null){
            productsId = new LongFilter();
        }
        return productsId();
    }

    public void setProductsId(LongFilter productsId) {
        this.productsId = productsId;
    }

    public LongFilter getProductionLineId() {
        return productionLineId;
    }

    public void setProductionLineId(LongFilter productionLineId) {
        this.productionLineId = productionLineId;
    }
    public LongFilter productionLineId(){
        if(productionLineId == null){
            productionLineId = new LongFilter();
        }
        return productionLineId();
    }

    public LongFilter getProjectsId() {
        return projectsId;
    }

    public void setProjectsId(LongFilter projectsId) {
        this.projectsId = projectsId;
    }
    public LongFilter projectsId(){
        if(projectsId == null){
            projectsId = new LongFilter();
        }
        return projectsId();
    }

    public InstantFilter getUsageDate() {
        return usageDate;
    }

    public InstantFilter usageDate() {
        if (usageDate == null) {
            usageDate = new InstantFilter();
        }
        return usageDate;
    }

    public void setUsageDate(InstantFilter usageDate) {
        this.usageDate = usageDate;
    }

    public Boolean getDistinct() {
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final RawMaterialConsumptionCriteria that = (RawMaterialConsumptionCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(quantityConsumed, that.quantityConsumed) &&
            Objects.equals(scrapGenerated, that.scrapGenerated) &&
            Objects.equals(totalMaterialCost, that.totalMaterialCost) &&
                Objects.equals(rawMaterialId, that.rawMaterialId) &&
                Objects.equals(productsId, that.productsId) &&
                Objects.equals(productionLineId, that.productionLineId) &&
                Objects.equals(projectsId, that.projectsId) &&
                Objects.equals(usageDate, that.usageDate) &&
            Objects.equals(distinct, that.distinct)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantityConsumed, scrapGenerated, totalMaterialCost, distinct);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "RawMaterialConsumptionCriteria{" +
            (id != null ? "id=" + id + ", " : "") +
            (quantityConsumed != null ? "quantityConsumed=" + quantityConsumed + ", " : "") +
            (scrapGenerated != null ? "scrapGenerated=" + scrapGenerated + ", " : "") +
            (totalMaterialCost != null ? "totalMaterialCost=" + totalMaterialCost + ", " : "") +
            (rawMaterialId != null ? "rawMaterial=" + rawMaterialId + ", " : "") +
            (productsId != null ? "productsId=" + productsId + ", " : "") +
            (productionLineId != null ? "productionLineId=" + productionLineId + ", " : "") +
            (projectsId != null ? "projectsId=" + projectsId + ", " : "") +
            (usageDate != null ? "projectsId=" + usageDate + ", " : "") +
            (distinct != null ? "distinct=" + distinct + ", " : "") +
            "}";
    }
}

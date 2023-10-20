package com.mycompany.myapp.service.criteria;

import java.io.Serializable;
import java.util.Objects;
import org.springdoc.api.annotations.ParameterObject;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.*;

/**
 * Criteria class for the {@link com.mycompany.myapp.domain.ProductConsumption} entity. This class is used
 * in {@link com.mycompany.myapp.web.rest.ProductConsumptionResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /product-consumptions?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
@ParameterObject
@SuppressWarnings("common-java:DuplicatedBlocks")
public class ProductConsumptionCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private DoubleFilter quantityConsumed;

    private DoubleFilter totalProductsCost;

    private LongFilter projectsId;

    //private LongFilter productId;

    private LongFilter productsId;

    private Boolean distinct;

    public ProductConsumptionCriteria() {}

    public ProductConsumptionCriteria(ProductConsumptionCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.quantityConsumed = other.quantityConsumed == null ? null : other.quantityConsumed.copy();
        this.totalProductsCost = other.totalProductsCost == null ? null : other.totalProductsCost.copy();
        this.projectsId = other.projectsId == null ? null : other.projectsId.copy();
        ///this.productId = other.productId == null ? null : other.productId.copy();
        this.productsId = other.productsId == null ? null : other.productsId.copy();
        this.distinct = other.distinct;
    }

    @Override
    public ProductConsumptionCriteria copy() {
        return new ProductConsumptionCriteria(this);
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

    public DoubleFilter getTotalProductsCost() {
        return totalProductsCost;
    }

    public DoubleFilter totalProductsCost() {
        if (totalProductsCost == null) {
            totalProductsCost = new DoubleFilter();
        }
        return totalProductsCost;
    }

    public void setTotalProductsCost(DoubleFilter totalProductsCost) {
        this.totalProductsCost = totalProductsCost;
    }

    public LongFilter getProjectsId() {
        return projectsId;
    }

    public void setProjectsId(LongFilter projects) {
        this.projectsId = projects;
    }

    public LongFilter projectsId(){
        if(projectsId == null){
            projectsId = new LongFilter();
        }
        return projectsId;
    }

//    public LongFilter getProductId() {
//        return productId;
//    }
//
//    public void setProductId(LongFilter product) {
//        this.productId = product;
//    }
//
//    public LongFilter productId(){
//        if(productId == null){
//            productId = new LongFilter();
//        }
//        return productId;
//    }

    public LongFilter getProductsId() {
        return productsId;
    }

    public void setProductsId(LongFilter products) {
        this.productsId = products;
    }

    public LongFilter productsId(){
        if(productsId == null){
            productsId = new LongFilter();
        }
        return productsId;
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
        final ProductConsumptionCriteria that = (ProductConsumptionCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(quantityConsumed, that.quantityConsumed) &&
            Objects.equals(totalProductsCost, that.totalProductsCost) &&
                Objects.equals(projectsId, that.projectsId) &&
               // Objects.equals(productId, that.productId) &&
                Objects.equals(productsId, that.productsId) &&
            Objects.equals(distinct, that.distinct)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantityConsumed, totalProductsCost, projectsId, productsId,distinct);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ProductConsumptionCriteria{" +
            (id != null ? "id=" + id + ", " : "") +
            (quantityConsumed != null ? "quantityConsumed=" + quantityConsumed + ", " : "") +
            (totalProductsCost != null ? "totalProductsCost=" + totalProductsCost + ", " : "") +
            (projectsId != null ? "projectsId=" + projectsId + ", " : "") +
           // (productId != null ? "productId=" + productId + ", " : "") +
            (productsId != null ? "productsId=" + productsId + ", " : "") +
            (distinct != null ? "distinct=" + distinct + ", " : "") +
            "}";
    }
}

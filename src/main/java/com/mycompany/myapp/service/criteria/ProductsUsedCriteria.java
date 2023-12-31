package com.mycompany.myapp.service.criteria;

import java.io.Serializable;
import java.util.Objects;
import org.springdoc.api.annotations.ParameterObject;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.*;

/**
 * Criteria class for the {@link com.mycompany.myapp.domain.ProductsUsed} entity. This class is used
 * in {@link com.mycompany.myapp.web.rest.ProductsUsedResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /products-useds?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
@ParameterObject
@SuppressWarnings("common-java:DuplicatedBlocks")
public class ProductsUsedCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private LongFilter productId;

    private LongFilter productConsumed;

    private Boolean distinct;

    public ProductsUsedCriteria() {}

    public ProductsUsedCriteria(ProductsUsedCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.productId = other.productId == null ? null : other.productId.copy();
        this.productConsumed = other.productConsumed == null ? null : other.productConsumed.copy();
        this.distinct = other.distinct;
    }

    @Override
    public ProductsUsedCriteria copy() {
        return new ProductsUsedCriteria(this);
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

    public LongFilter getProductId() {
        return productId;
    }

    public LongFilter productId() {
        if (productId == null) {
            productId = new LongFilter();
        }
        return productId;
    }

    public void setProductId(LongFilter productId) {
        this.productId = productId;
    }

    public LongFilter getProductConsumed() {
        return productConsumed;
    }

    public LongFilter productConsumed() {
        if (productConsumed == null) {
            productConsumed = new LongFilter();
        }
        return productConsumed;
    }

    public void setProductConsumed(LongFilter productConsumed) {
        this.productConsumed = productConsumed;
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
        final ProductsUsedCriteria that = (ProductsUsedCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(productId, that.productId) &&
            Objects.equals(productConsumed, that.productConsumed) &&
            Objects.equals(distinct, that.distinct)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, productConsumed, distinct);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ProductsUsedCriteria{" +
            (id != null ? "id=" + id + ", " : "") +
            (productId != null ? "productId=" + productId + ", " : "") +
            (productConsumed != null ? "productConsumed=" + productConsumed + ", " : "") +
            (distinct != null ? "distinct=" + distinct + ", " : "") +
            "}";
    }
}

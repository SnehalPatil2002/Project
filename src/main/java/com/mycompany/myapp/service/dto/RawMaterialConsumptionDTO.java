package com.mycompany.myapp.service.dto;

import java.io.Serializable;
import java.time.Instant;
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
    private RawMaterialDTO rawMaterial;

    private ProductsDTO products;

    private ProductionLineDTO productionLine;

    private ProjectsDTO projects;

    private Instant usageDate;

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

    public RawMaterialDTO getRawMaterial() {
        return rawMaterial;
    }

    public void setRawMaterial(RawMaterialDTO rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    public ProductsDTO getProducts() {
        return products;
    }

    public void setProducts(ProductsDTO products) {
        this.products = products;
    }

    public ProductionLineDTO getProductionLine() {
        return productionLine;
    }

    public void setProductionLine(ProductionLineDTO productionLine) {
        this.productionLine = productionLine;
    }

    public ProjectsDTO getProjects() {
        return projects;
    }

    public void setProjects(ProjectsDTO projects) {
        this.projects = projects;
    }

    public Instant getUsageDate() {
        return usageDate;
    }

    public void setUsageDate(Instant usageDate) {
        this.usageDate = usageDate;
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
            ", rawMaterial='" + getRawMaterial() + "'" +
            ", products='" + getProducts() + "'" +
            ", productionLine='" + getProductionLine() + "'" +
            ", projects='" + getProjects() + "'" +
            "}";
    }
}

package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.*;
import com.mycompany.myapp.service.dto.*;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link StockRequest} and its DTO {@link StockRequestDTO}.
 */
@Mapper(componentModel = "spring")
public interface StockRequestMapper extends EntityMapper<StockRequestDTO, StockRequest> {

    @Mapping(target = "rawMaterial",qualifiedByName = "rawMaterialId")
    @Mapping(target = "products", qualifiedByName = "productsId")
    @Mapping(target = "productionLine", qualifiedByName = "productionLineId")
    @Mapping(target = "projects", qualifiedByName = "projectsId")
    StockRequestDTO toDto(StockRequest s);

    @Named("rawMaterialId")
    RawMaterialDTO toDtoRawMaterialDTO(RawMaterial rawMaterial);

    @Named("productsId")
    ProductsDTO toDtoProductsDTO(Products products);

    @Named("productionLineId")
    ProductionLineDTO toDtoProductionLineDTO(ProductionLine productionLine);

    @Named("projectsId")
    ProjectsDTO toDtoProjectsDTO(Projects projects);
}

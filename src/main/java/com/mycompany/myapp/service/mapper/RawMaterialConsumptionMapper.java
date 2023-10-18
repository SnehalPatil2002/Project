package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.*;
import com.mycompany.myapp.service.dto.*;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link RawMaterialConsumption} and its DTO {@link RawMaterialConsumptionDTO}.
 */
@Mapper(componentModel = "spring")
public interface RawMaterialConsumptionMapper extends EntityMapper<RawMaterialConsumptionDTO, RawMaterialConsumption> {
    @Mapping(target = "products" , qualifiedByName = "productsId")
    @Mapping(target = "rawMaterial", qualifiedByName = "rawMaterialId")
    @Mapping(target = "productionLine", qualifiedByName = "productionLineId")
    @Mapping(target = "projects", qualifiedByName = "projectsId")

    RawMaterialConsumptionDTO toDto(RawMaterialConsumption rawMaterialConsumption);

    @Named("productsId")
    ProductsDTO toDtoProductsDTO(Products products);

    @Named("rawMaterialId")
    RawMaterialDTO toDtoRawMaterialDTO(RawMaterial rawMaterial);

    @Named("productionLineId")
    ProductionLineDTO toDtoProductionLineDTO(ProductionLine productionLine);

    @Named("projectsId")
    ProjectsDTO toDtoProjectsDTO(Projects projects);
}

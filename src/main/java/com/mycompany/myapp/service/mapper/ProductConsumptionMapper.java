package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.ProductConsumption;
import com.mycompany.myapp.domain.Products;
import com.mycompany.myapp.domain.Projects;
import com.mycompany.myapp.service.dto.ProductConsumptionDTO;
import com.mycompany.myapp.service.dto.ProductsDTO;
import com.mycompany.myapp.service.dto.ProjectsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ProductConsumption} and its DTO {@link ProductConsumptionDTO}.
 */
@Mapper(componentModel = "spring")
public interface ProductConsumptionMapper extends EntityMapper<ProductConsumptionDTO, ProductConsumption> {

    @Mapping(target = "projects", qualifiedByName = "projectsId")
   // @Mapping(target = "product", qualifiedByName = "productId")
    @Mapping(target = "products", qualifiedByName = "productsId")
    ProductConsumptionDTO toDto(ProductConsumption productConsumption);

    @Named("projectsId")
    ProjectsDTO toDtoProjectsDTO(Projects projects);

    @Named("productsId")
    ProductsDTO toDtoProductsDTO(Products products);


}

package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.ProductionLine;
import com.mycompany.myapp.domain.Products;
import com.mycompany.myapp.service.dto.ProductionLineDTO;
import com.mycompany.myapp.service.dto.ProductsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ProductionLine} and its DTO {@link ProductionLineDTO}.
 */
@Mapper(componentModel = "spring")
public interface ProductionLineMapper extends EntityMapper<ProductionLineDTO, ProductionLine> {

    @Mapping(target = "products" , qualifiedByName = "productsId")
    ProductionLineDTO toDto(ProductionLine productionLine);

    @Named("productsId")
    ProductsDTO toDtoProductsDTO(Products products);
}

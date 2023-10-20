package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Products;
import com.mycompany.myapp.service.dto.ProductsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Products} and its DTO {@link ProductsDTO}.
 */
@Mapper(componentModel = "spring")
public interface ProductsMapper extends EntityMapper<ProductsDTO, Products> {

    @Mapping(target = "usedForProducts", qualifiedByName = "usedForProductsId")
    ProductsDTO toDto(Products s);

    @Named("usedForProductsId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ProductsDTO toDtoProductsDTO(Products products);
}

package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Products;
import com.mycompany.myapp.domain.RawMaterial;
import com.mycompany.myapp.domain.Warehouse;
import com.mycompany.myapp.service.dto.ProductsDTO;
import com.mycompany.myapp.service.dto.RawMaterialDTO;
import java.util.Set;
import java.util.stream.Collectors;

import com.mycompany.myapp.service.dto.WarehouseDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link RawMaterial} and its DTO {@link RawMaterialDTO}.
 */
@Mapper(componentModel = "spring")
public interface RawMaterialMapper extends EntityMapper<RawMaterialDTO, RawMaterial> {
    @Mapping(target = "products", source = "products", qualifiedByName = "productsIdSet")

    @Mapping(target = "warehouse", qualifiedByName = "warehouseId")
    RawMaterialDTO toDto(RawMaterial s);

    @Named("warehouseId")
//    @BeanMapping(ignoreByDefault = true)
//    @Mapping(target = "id", source = "id")
//    @Mapping(target = "whName", source = "whName")
//    @Mapping(target = "managerName", source = "managerName")
//    @Mapping(target = "managerEmail", source = "managerEmail")
    WarehouseDTO toDtoWarehouseDTO(Warehouse warehouse);

    @Mapping(target = "removeProducts", ignore = true)
    RawMaterial toEntity(RawMaterialDTO rawMaterialDTO);

    @Named("productsId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ProductsDTO toDtoProducts(Products products);

    @Named("productsIdSet")
    default Set<ProductsDTO> toDtoProductsIdSet(Set<Products> products) {
        return products.stream().map(this::toDtoProducts).collect(Collectors.toSet());
    }
}

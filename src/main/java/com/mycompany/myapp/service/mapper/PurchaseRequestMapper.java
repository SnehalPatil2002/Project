package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.PurchaseRequest;
import com.mycompany.myapp.domain.RawMaterial;
import com.mycompany.myapp.domain.Warehouse;
import com.mycompany.myapp.service.dto.PurchaseRequestDTO;
import com.mycompany.myapp.service.dto.RawMaterialDTO;
import com.mycompany.myapp.service.dto.WarehouseDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link PurchaseRequest} and its DTO {@link PurchaseRequestDTO}.
 */
@Mapper(componentModel = "spring")
public interface PurchaseRequestMapper extends EntityMapper<PurchaseRequestDTO, PurchaseRequest> {
    @Mapping(target = "rawMaterial", source = "rawMaterial", qualifiedByName = "rawMaterialId")
    PurchaseRequestDTO toDto(PurchaseRequest s);

    @Named("rawMaterialId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "unitPrice", source = "unitPrice")
    @Mapping(target = "quantity", source = "quantity")
    RawMaterialDTO toDtoRawMaterialDTO(RawMaterial rawMaterial);
}

package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.PurchaseQuotation;
import com.mycompany.myapp.domain.PurchaseQuotationDetails;
import com.mycompany.myapp.domain.RawMaterial;
import com.mycompany.myapp.service.dto.PurchaseQuotationDTO;
import com.mycompany.myapp.service.dto.PurchaseQuotationDetailsDTO;
import com.mycompany.myapp.service.dto.RawMaterialDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link PurchaseQuotationDetails} and its DTO {@link PurchaseQuotationDetailsDTO}.
 */
@Mapper(componentModel = "spring")
public interface PurchaseQuotationDetailsMapper extends EntityMapper<PurchaseQuotationDetailsDTO, PurchaseQuotationDetails> {
	
	@Mapping(target = "rawMaterial", qualifiedByName = "rawMaterialId")
	@Mapping(target = "purchaseQuotation", qualifiedByName = "purchaseQuotationId")
	PurchaseQuotationDetailsDTO toDto(PurchaseQuotationDetails p);
	
	@Named("rawMaterialId")
	RawMaterialDTO toDtoRawMaterialDTO(RawMaterial rawMaterial);
	
	@Named("purchaseQuotationId")
	PurchaseQuotationDTO toDtoPurchaseQuotationDTO(PurchaseQuotation purchaseQuotation);
}

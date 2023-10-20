package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.OrderRecieved;
import com.mycompany.myapp.domain.PurchaseQuotation;
import com.mycompany.myapp.domain.PurchaseQuotationDetails;
import com.mycompany.myapp.service.dto.OrderRecievedDTO;
import com.mycompany.myapp.service.dto.PurchaseQuotationDTO;
import com.mycompany.myapp.service.dto.PurchaseQuotationDetailsDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link OrderRecieved} and its DTO {@link OrderRecievedDTO}.
 */
@Mapper(componentModel = "spring")
public interface OrderRecievedMapper extends EntityMapper<OrderRecievedDTO, OrderRecieved> {
	
	
	@Mapping(target = "purchaseQuotation", qualifiedByName = "purchaseQuotationId")
	PurchaseQuotationDetailsDTO toDto(PurchaseQuotationDetails p);
	
	@Named("purchaseQuotationId")
	PurchaseQuotationDTO toDtoPurchaseQuotationDTO(PurchaseQuotation purchaseQuotation);
}

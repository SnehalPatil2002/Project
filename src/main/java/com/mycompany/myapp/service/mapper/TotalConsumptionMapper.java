package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Products;
import com.mycompany.myapp.domain.Projects;
import com.mycompany.myapp.domain.TotalConsumption;
import com.mycompany.myapp.service.dto.ProductsDTO;
import com.mycompany.myapp.service.dto.ProjectsDTO;
import com.mycompany.myapp.service.dto.TotalConsumptionDTO;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface TotalConsumptionMapper extends EntityMapper<TotalConsumptionDTO, TotalConsumption> {
	
	@Mapping(target = "projects", qualifiedByName = "projectsId")
	@Mapping(target = "products", qualifiedByName = "productsId")
	TotalConsumptionDTO toDto(TotalConsumption p);
	
	@Named("projectsId")
	ProjectsDTO toDtoProjectsDTO(Projects projects);
	
	@Named("productsId")
	ProductsDTO toDtoProductsDTO(Products products);
	
	
}

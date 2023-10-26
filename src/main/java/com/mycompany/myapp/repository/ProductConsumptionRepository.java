package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ProductConsumption;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data JPA repository for the ProductConsumption entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductConsumptionRepository
    extends JpaRepository<ProductConsumption, Long>, JpaSpecificationExecutor<ProductConsumption> {
    @Query(value = "SELECT SUM(total_products_cost) FROM product_consumption WHERE projects_id = :projects_id", nativeQuery = true)
    List<Integer> getProductsCostByProjectsId(@Param("projects_id") int id);
}

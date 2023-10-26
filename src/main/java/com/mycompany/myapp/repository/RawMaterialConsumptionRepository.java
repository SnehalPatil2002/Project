package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.RawMaterialConsumption;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;

/**
 * Spring Data JPA repository for the RawMaterialConsumption entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RawMaterialConsumptionRepository
    extends JpaRepository<RawMaterialConsumption, Long>, JpaSpecificationExecutor<RawMaterialConsumption> {
//    @Query(value = "SELECT SUM(total_material_cost) FROM raw_material_consumption WHERE usage_date = :date", nativeQuery = true)
//    List<Integer> getSumCostByDate(@Param("date") Date date);

    @Query(value = "SELECT SUM(total_material_cost) FROM raw_material_consumption WHERE usage_date = CURDATE()", nativeQuery = true)
    List<Integer> getSumCostByDate();

    @Query(value = "SELECT SUM(total_material_cost) FROM raw_material_consumption WHERE projects_id = :projects_id", nativeQuery = true)
    List<Integer> getMaterialCostByProjectsId(@Param("projects_id") int id);

}

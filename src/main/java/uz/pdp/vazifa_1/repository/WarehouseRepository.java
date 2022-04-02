package uz.pdp.vazifa_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.vazifa_1.entity.Warehouse;
import uz.pdp.vazifa_1.projection.CustomWarehouse;

@RepositoryRestResource(path = "warehouse",collectionResourceRel = "list", excerptProjection =
        CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {
}

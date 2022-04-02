package uz.pdp.vazifa_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.vazifa_1.entity.Measurment;
import uz.pdp.vazifa_1.projection.CustomMeasurment;

@RepositoryRestResource(path = "measurment",collectionResourceRel = "list", excerptProjection =
        CustomMeasurment.class)
public interface MeasurmentRepository extends JpaRepository<Measurment,Integer> {
}

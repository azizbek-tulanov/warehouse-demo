package uz.pdp.vazifa_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.vazifa_1.entity.Client;
import uz.pdp.vazifa_1.projection.CustomClient;

@RepositoryRestResource(path = "client",collectionResourceRel = "list", excerptProjection =
        CustomClient.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {
}

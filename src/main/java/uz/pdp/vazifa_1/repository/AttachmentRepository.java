package uz.pdp.vazifa_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.vazifa_1.entity.Attachment;
import uz.pdp.vazifa_1.projection.CustomAttachment;

@RepositoryRestResource(path = "attachment",collectionResourceRel = "list",
        excerptProjection =
                CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}

package uz.pdp.vazifa_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.vazifa_1.entity.AttachmentContent;
import uz.pdp.vazifa_1.projection.CustomAttachmentContent;

@RepositoryRestResource(path = "attachmentcontent",collectionResourceRel = "list",
        excerptProjection =
        CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {

}

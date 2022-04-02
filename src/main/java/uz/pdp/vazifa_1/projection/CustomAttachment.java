package uz.pdp.vazifa_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa_1.entity.Attachment;

@Projection(types = Attachment.class)

public interface CustomAttachment {
    Integer getId();
    String getName();
    String getContentType();
     long getSize();

}

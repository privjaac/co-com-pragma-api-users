package co.com.pragma.api.users.model.dto.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Data
public class BasicSearchDto implements Serializable {
   private static final long serialVersionUID = -1099762076017211129L;
   private Boolean status;
   private String created;
   private String updated;
   private String createdBy;
   private String updateBy;
}
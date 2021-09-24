package co.com.pragma.api.users.model.vo.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Data
public class BasicVo implements Serializable {
   private static final long serialVersionUID = -7846143440134530627L;
   private Boolean status;
   private String created;
   private String updated;
   private String createdBy;
   private String updateBy;
}
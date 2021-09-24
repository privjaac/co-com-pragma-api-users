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
public class BasicDto implements Serializable {
   private static final long serialVersionUID = -7345085707796620238L;
   private Boolean status;
}
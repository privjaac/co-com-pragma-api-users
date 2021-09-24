package co.com.pragma.api.users.model.dto.generictype;

import co.com.pragma.api.users.model.dto.basic.BasicSearchDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Data
public class GenericTypeSearchDto extends BasicSearchDto {
   private static final long serialVersionUID = -6297484188311682174L;
   private String name;
   private String entity;
}
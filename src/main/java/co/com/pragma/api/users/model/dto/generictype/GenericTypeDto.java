package co.com.pragma.api.users.model.dto.generictype;

import co.com.pragma.api.users.model.dto.basic.BasicDto;
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
public class GenericTypeDto extends BasicDto {
   private static final long serialVersionUID = -4457504851857236424L;
   private String name;
   private String entity;
   private String parentId;
}
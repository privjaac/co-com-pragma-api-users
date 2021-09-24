package co.com.pragma.api.users.model.dto.user;

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
public class UserSearchDto extends BasicSearchDto {
   private static final long serialVersionUID = -3704148836786931664L;
   private String callSing;
   private String name;
   private String lastName;
}
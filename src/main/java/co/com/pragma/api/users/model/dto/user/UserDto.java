package co.com.pragma.api.users.model.dto.user;

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
public class UserDto extends BasicDto {
   private static final long serialVersionUID = -2619888644666603652L;
   private String callSing;
   private String password;
   private String name;
   private String lastName;
}
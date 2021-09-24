package co.com.pragma.api.users.model.vo.user;

import co.com.pragma.api.users.model.vo.basic.BasicVo;
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
public class UserVo extends BasicVo {
   private static final long serialVersionUID = -3734209333295919677L;
   private String id;
   private String callSing;
   private String name;
   private String lastName;
}
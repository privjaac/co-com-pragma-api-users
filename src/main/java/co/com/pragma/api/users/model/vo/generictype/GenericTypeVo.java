package co.com.pragma.api.users.model.vo.generictype;

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
public class GenericTypeVo extends BasicVo {
   private static final long serialVersionUID = 7663815528936042618L;
   private String id;
   private String name;
   private String entity;
}
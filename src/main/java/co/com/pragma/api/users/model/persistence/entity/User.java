package co.com.pragma.api.users.model.persistence.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Data
@Document(collection = "users")
public class User extends Basic {
   private static final long serialVersionUID = -8803642192731453132L;
   @Id
   private String id;
   private String callSing;
   private String password;
   private String name;
   private String lastName;
}
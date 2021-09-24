package co.com.pragma.api.users.model.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Data
@Document(collection = "generic_type")
public class GenericType extends Basic {
   private static final long serialVersionUID = -3780292522609948790L;
   @Id
   private String id;
   private String name;
   private String entity;
   private String parentId;
}
package co.com.pragma.api.users.model.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Data
public class Basic implements Serializable {
   private static final long serialVersionUID = -7765756829575396830L;
   private Boolean status;
   @CreatedDate
   private LocalDateTime created;
   @LastModifiedDate
   private LocalDateTime updated;
   private String createdBy;
   private String updateBy;
}
package co.com.pragma.api.users.service.impl;

import co.com.pragma.api.users.configuration.helper.GlobalHelper;
import co.com.pragma.api.users.model.persistence.repo.GenericTypeRepo;
import co.com.pragma.api.users.service.impl.abst.GenericTypeAbstImpl;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class GenericTypeImpl extends GenericTypeAbstImpl {
   private final GlobalHelper helper;
   private final GenericTypeRepo repo;

   @Lazy
   public GenericTypeImpl(GlobalHelper helper, GenericTypeRepo repo) {
      super(helper, repo);
      this.helper = helper;
      this.repo = repo;
   }
}
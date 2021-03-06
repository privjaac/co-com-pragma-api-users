package co.com.pragma.api.users.service.impl;

import co.com.pragma.api.users.configuration.helper.GlobalHelper;
import co.com.pragma.api.users.configuration.helper.general.model.Response;
import co.com.pragma.api.users.model.persistence.repo.UserRepo;
import co.com.pragma.api.users.model.vo.user.UserVo;
import co.com.pragma.api.users.service.impl.abst.UserAbstImpl;
import co.com.pragma.api.users.web.exception.GlobalException;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserImpl extends UserAbstImpl {
   private final GlobalHelper helper;
   private final UserRepo repo;

   @Lazy
   public UserImpl(GlobalHelper helper, UserRepo repo) {
      super(helper, repo);
      this.helper = helper;
      this.repo = repo;
   }

   @Override
   public Mono<Response<UserVo>> login() throws GlobalException {
      return null;
   }

   @Override
   public Mono<Response<UserVo>> refreshToken() throws GlobalException {
      return null;
   }
}
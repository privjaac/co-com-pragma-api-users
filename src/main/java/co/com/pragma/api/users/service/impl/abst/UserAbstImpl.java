package co.com.pragma.api.users.service.impl.abst;

import co.com.pragma.api.users.configuration.helper.GlobalHelper;
import co.com.pragma.api.users.configuration.helper.general.model.Response;
import co.com.pragma.api.users.model.dto.user.UserDto;
import co.com.pragma.api.users.model.dto.user.UserSearchDto;
import co.com.pragma.api.users.model.persistence.repo.UserRepo;
import co.com.pragma.api.users.model.vo.user.UserVo;
import co.com.pragma.api.users.service.svc.UserSvc;
import co.com.pragma.api.users.web.exception.GlobalException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public abstract class UserAbstImpl implements UserSvc {
   private GlobalHelper helper;
   private UserRepo repo;

   public UserAbstImpl(GlobalHelper helper, UserRepo repo) {
      this.helper = helper;
      this.repo = repo;
   }

   @Override
   public Mono<Response<UserVo>> get(String s) throws GlobalException {
      return null;
   }

   @Override
   public Mono<Response<UserVo>> add(UserDto model) throws GlobalException {
      return null;
   }

   @Override
   public Mono<Response<UserVo>> edit(UserDto model, String s) throws GlobalException {
      return null;
   }

   @Override
   public Mono<Response<UserVo>> del(String s) throws GlobalException {
      return null;
   }

   @Override
   public Flux<Page<UserVo>> page(UserSearchDto model, Pageable pageable) {
      return null;
   }

   @Override
   public Flux<List<UserVo>> all(UserSearchDto model, Integer limit) {
      return null;
   }
}

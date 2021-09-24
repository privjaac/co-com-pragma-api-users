package co.com.pragma.api.users.web.api.abst;

import co.com.pragma.api.users.configuration.helper.GlobalHelper;
import co.com.pragma.api.users.configuration.helper.general.model.Response;
import co.com.pragma.api.users.configuration.helper.general.svc.ControllerSvc;
import co.com.pragma.api.users.model.dto.user.UserDto;
import co.com.pragma.api.users.model.dto.user.UserSearchDto;
import co.com.pragma.api.users.model.vo.user.UserVo;
import co.com.pragma.api.users.service.svc.UserSvc;
import co.com.pragma.api.users.web.exception.GlobalException;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.Serializable;
import java.util.List;

public abstract class UserAbstCtrl implements ControllerSvc<UserVo, UserDto, UserSearchDto, String>, Serializable {
   private static final long serialVersionUID = -7103656404583390132L;
   private GlobalHelper helper;
   private UserSvc svc;

   public UserAbstCtrl(GlobalHelper helper, UserSvc svc) {
      this.helper = helper;
      this.svc = svc;
   }

   @Override
   public Mono<Response<UserVo>> get(String id) throws GlobalException {
      return svc.get(id);
   }

   @Override
   public Mono<Response<UserVo>> add(@RequestBody UserDto model) throws GlobalException {
      return svc.add(model);
   }

   @Override
   public Mono<Response<UserVo>> edit(@RequestBody UserDto model, String id) throws GlobalException {
      return svc.edit(model, id);
   }

   @Override
   public Mono<Response<UserVo>> del(String id) throws GlobalException {
      return svc.del(id);
   }

   @Override
   public Flux<Page<UserVo>> page(UserSearchDto model, Integer pageNumber, Integer pageSize) {
      return svc.page(model, helper.getDefaultPageable(pageNumber, pageSize));
   }

   @Override
   public Flux<List<UserVo>> all(UserSearchDto model, Integer limit) {
      return svc.all(model, limit);
   }
}
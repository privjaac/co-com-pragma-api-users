package co.com.pragma.api.users.web.api;

import co.com.pragma.api.users.configuration.helper.GlobalHelper;
import co.com.pragma.api.users.configuration.helper.general.model.Response;
import co.com.pragma.api.users.configuration.helper.general.svc.ControllerSvc;
import co.com.pragma.api.users.model.dto.user.UserDto;
import co.com.pragma.api.users.model.dto.user.UserSearchDto;
import co.com.pragma.api.users.model.vo.user.UserVo;
import co.com.pragma.api.users.service.svc.UserSvc;
import co.com.pragma.api.users.web.exception.GlobalException;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class UserCtrl implements ControllerSvc<UserVo, UserDto, UserSearchDto, String> {
   private final GlobalHelper helper;
   private final UserSvc svc;

   @Lazy
   public UserCtrl(GlobalHelper helper, UserSvc svc) {
      this.helper = helper;
      this.svc = svc;
   }

   @Override
   public Response<UserVo> get(String id) throws GlobalException {
      return svc.get(id);
   }

   @Override
   public Response<UserVo> add(@RequestBody UserDto model) throws GlobalException {
      return svc.add(model);
   }

   @Override
   public Response<UserVo> edit(@RequestBody UserDto model, String id) throws GlobalException {
      return svc.edit(model, id);
   }

   @Override
   public Response<UserVo> del(String id) throws GlobalException {
      return svc.del(id);
   }

   @Override
   public Page<UserVo> page(UserSearchDto model, Integer pageNumber, Integer pageSize) {
      return svc.page(model, helper.getDefaultPageable(pageNumber, pageSize));
   }

   @Override
   public List<UserVo> all(UserSearchDto model, Integer limit) {
      return svc.all(model, limit);
   }
}
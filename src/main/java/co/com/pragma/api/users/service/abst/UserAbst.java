package co.com.pragma.api.users.service.abst;

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

import java.util.List;

public abstract class UserAbst implements UserSvc {
   private GlobalHelper helper;
   private UserRepo repo;

   public UserAbst(GlobalHelper helper, UserRepo repo) {
      this.helper = helper;
      this.repo = repo;
   }

   @Override
   public Response<UserVo> get(String s) throws GlobalException {
      return null;
   }

   @Override
   public Response<UserVo> add(UserDto model) throws GlobalException {
      return null;
   }

   @Override
   public Response<UserVo> edit(UserDto model, String s) throws GlobalException {
      return null;
   }

   @Override
   public Response<UserVo> del(String s) throws GlobalException {
      return null;
   }

   @Override
   public Page<UserVo> page(UserSearchDto model, Pageable pageable) {
      return null;
   }

   @Override
   public List<UserVo> all(UserSearchDto model, Integer limit) {
      return null;
   }
}

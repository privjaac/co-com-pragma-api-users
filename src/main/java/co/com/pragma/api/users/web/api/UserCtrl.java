package co.com.pragma.api.users.web.api;

import co.com.pragma.api.users.configuration.helper.GlobalHelper;
import co.com.pragma.api.users.configuration.helper.general.model.Response;
import co.com.pragma.api.users.configuration.helper.general.svc.ControllerSvc;
import co.com.pragma.api.users.model.dto.user.UserDto;
import co.com.pragma.api.users.model.dto.user.UserSearchDto;
import co.com.pragma.api.users.model.vo.user.UserVo;
import co.com.pragma.api.users.service.svc.UserSvc;
import co.com.pragma.api.users.web.api.abst.UserAbstCtrl;
import co.com.pragma.api.users.web.exception.GlobalException;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class UserCtrl extends UserAbstCtrl {
   private static final long serialVersionUID = -7217137555551765943L;
   private final GlobalHelper helper;
   private final UserSvc svc;

   @Lazy
   public UserCtrl(GlobalHelper helper, UserSvc svc) {
      super(helper, svc);
      this.helper = helper;
      this.svc = svc;
   }
}
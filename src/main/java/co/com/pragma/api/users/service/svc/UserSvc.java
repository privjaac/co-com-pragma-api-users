package co.com.pragma.api.users.service.svc;

import co.com.pragma.api.users.configuration.helper.general.model.Response;
import co.com.pragma.api.users.configuration.helper.general.svc.GlobalSvc;
import co.com.pragma.api.users.model.dto.user.UserDto;
import co.com.pragma.api.users.model.dto.user.UserSearchDto;
import co.com.pragma.api.users.model.vo.user.UserVo;
import co.com.pragma.api.users.web.exception.GlobalException;
import reactor.core.publisher.Mono;

public interface UserSvc extends GlobalSvc<UserVo, UserDto, UserSearchDto, String> {
   Mono<Response<UserVo>> login() throws GlobalException;

   Mono<Response<UserVo>> refreshToken() throws GlobalException;
}
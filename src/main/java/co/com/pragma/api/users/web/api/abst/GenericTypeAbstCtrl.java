package co.com.pragma.api.users.web.api.abst;

import co.com.pragma.api.users.configuration.helper.GlobalHelper;
import co.com.pragma.api.users.configuration.helper.general.model.Response;
import co.com.pragma.api.users.configuration.helper.general.svc.ControllerSvc;
import co.com.pragma.api.users.model.dto.generictype.GenericTypeDto;
import co.com.pragma.api.users.model.dto.generictype.GenericTypeSearchDto;
import co.com.pragma.api.users.model.vo.generictype.GenericTypeVo;
import co.com.pragma.api.users.service.svc.GenericTypeSvc;
import co.com.pragma.api.users.web.exception.GlobalException;
import org.springframework.data.domain.Page;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.Serializable;
import java.util.List;

public abstract class GenericTypeAbstCtrl implements ControllerSvc<GenericTypeVo, GenericTypeDto, GenericTypeSearchDto, String>, Serializable {
   private static final long serialVersionUID = 2298194789772696588L;
   private GlobalHelper helper;
   private GenericTypeSvc svc;

   public GenericTypeAbstCtrl(GlobalHelper helper, GenericTypeSvc svc) {
      this.helper = helper;
      this.svc = svc;
   }

   @Override
   public Mono<Response<GenericTypeVo>> get(String id) throws GlobalException {
      return svc.get(id);
   }

   @Override
   public Mono<Response<GenericTypeVo>> add(GenericTypeDto model) throws GlobalException {
      return svc.add(model);
   }

   @Override
   public Mono<Response<GenericTypeVo>> edit(GenericTypeDto model, String id) throws GlobalException {
      return svc.edit(model, id);
   }

   @Override
   public Mono<Response<GenericTypeVo>> del(String id) throws GlobalException {
      return svc.del(id);
   }

   @Override
   public Flux<Page<GenericTypeVo>> page(GenericTypeSearchDto model, Integer pageNumber, Integer pageSize) {
      return svc.page(model, helper.getDefaultPageable(pageNumber, pageSize));
   }

   @Override
   public Flux<List<GenericTypeVo>> all(GenericTypeSearchDto model, Integer limit) {
      return svc.all(model, limit);
   }
}
package co.com.pragma.api.users.service.impl.abst;

import co.com.pragma.api.users.configuration.helper.GlobalHelper;
import co.com.pragma.api.users.configuration.helper.general.model.Response;
import co.com.pragma.api.users.model.dto.generictype.GenericTypeDto;
import co.com.pragma.api.users.model.dto.generictype.GenericTypeSearchDto;
import co.com.pragma.api.users.model.persistence.repo.GenericTypeRepo;
import co.com.pragma.api.users.model.vo.generictype.GenericTypeVo;
import co.com.pragma.api.users.service.svc.GenericTypeSvc;
import co.com.pragma.api.users.web.exception.GlobalException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public abstract class GenericTypeAbstImpl implements GenericTypeSvc {
   private GlobalHelper helper;
   private GenericTypeRepo repo;

   public GenericTypeAbstImpl(GlobalHelper helper, GenericTypeRepo repo) {
      this.helper = helper;
      this.repo = repo;
   }

   @Override
   public Mono<Response<GenericTypeVo>> get(String s) throws GlobalException {
      return null;
   }

   @Override
   public Mono<Response<GenericTypeVo>> add(GenericTypeDto model) throws GlobalException {
      return null;
   }

   @Override
   public Mono<Response<GenericTypeVo>> edit(GenericTypeDto model, String s) throws GlobalException {
      return null;
   }

   @Override
   public Mono<Response<GenericTypeVo>> del(String s) throws GlobalException {
      return null;
   }

   @Override
   public Flux<Page<GenericTypeVo>> page(GenericTypeSearchDto model, Pageable pageable) {
      return null;
   }

   @Override
   public Flux<List<GenericTypeVo>> all(GenericTypeSearchDto model, Integer limit) {
      return null;
   }
}
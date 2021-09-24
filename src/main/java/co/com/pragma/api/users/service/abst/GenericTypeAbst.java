package co.com.pragma.api.users.service.abst;

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

import java.util.List;

public abstract class GenericTypeAbst implements GenericTypeSvc {
   private GlobalHelper helper;
   private GenericTypeRepo repo;

   public GenericTypeAbst(GlobalHelper helper, GenericTypeRepo repo) {
      this.helper = helper;
      this.repo = repo;
   }

   @Override
   public Response<GenericTypeVo> get(String s) throws GlobalException {
      return null;
   }

   @Override
   public Response<GenericTypeVo> add(GenericTypeDto model) throws GlobalException {
      return null;
   }

   @Override
   public Response<GenericTypeVo> edit(GenericTypeDto model, String s) throws GlobalException {
      return null;
   }

   @Override
   public Response<GenericTypeVo> del(String s) throws GlobalException {
      return null;
   }

   @Override
   public Page<GenericTypeVo> page(GenericTypeSearchDto model, Pageable pageable) {
      return null;
   }

   @Override
   public List<GenericTypeVo> all(GenericTypeSearchDto model, Integer limit) {
      return null;
   }
}
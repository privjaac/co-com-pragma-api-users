package co.com.pragma.api.users.service.svc;

import co.com.pragma.api.users.configuration.helper.general.svc.GlobalSvc;
import co.com.pragma.api.users.model.dto.generictype.GenericTypeDto;
import co.com.pragma.api.users.model.dto.generictype.GenericTypeSearchDto;
import co.com.pragma.api.users.model.vo.generictype.GenericTypeVo;

public interface GenericTypeSvc extends GlobalSvc<GenericTypeVo, GenericTypeDto, GenericTypeSearchDto, String> {
}
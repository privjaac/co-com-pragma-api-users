package co.com.pragma.api.users.web.api;

import co.com.pragma.api.users.configuration.helper.GlobalHelper;
import co.com.pragma.api.users.service.svc.GenericTypeSvc;
import co.com.pragma.api.users.web.api.abst.GenericTypeAbstCtrl;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/generic-type")
public class GenericTypeCtrl extends GenericTypeAbstCtrl {
   private static final long serialVersionUID = 3684893158985430959L;
   private final GlobalHelper helper;
   private final GenericTypeSvc svc;

   @Lazy
   public GenericTypeCtrl(GlobalHelper helper, GenericTypeSvc svc) {
      super(helper, svc);
      this.helper = helper;
      this.svc = svc;
   }
}
package co.com.pragma.api.users.configuration.helper.general.svc;


import co.com.pragma.api.users.configuration.helper.general.model.Response;
import co.com.pragma.api.users.web.exception.GlobalException;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ControllerSvc<ValueObject, DataTransferObject, DataTransferObjectSearch, TypeId> {
   @GetMapping(value = "/{id}")
   Mono<Response<ValueObject>> get(@PathVariable TypeId id) throws GlobalException;

   @ResponseStatus(HttpStatus.CREATED)
   @PostMapping(value = "/")
   Mono<Response<ValueObject>> add(DataTransferObject model) throws GlobalException;

   @PutMapping(value = "/{id}")
  Mono<Response<ValueObject>> edit(DataTransferObject model, @PathVariable TypeId id) throws GlobalException;

   @DeleteMapping(value = "/{id}")
   Mono<Response<ValueObject>> del(@PathVariable TypeId id) throws GlobalException;

   @GetMapping(value = "/page/all")
   Flux<Page<ValueObject>> page(
           @ModelAttribute DataTransferObjectSearch model,
           @RequestParam(required = false, defaultValue = "1") Integer pageNumber,
           @RequestParam(required = false, defaultValue = "100") Integer pageSize
   );

   @GetMapping(value = "/")
   Flux<List<ValueObject>> all(@ModelAttribute DataTransferObjectSearch model, Integer limit);
}
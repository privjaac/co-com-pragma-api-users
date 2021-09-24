package co.com.pragma.api.users.configuration.helper.general.svc;

import co.com.pragma.api.users.configuration.helper.general.model.Response;
import co.com.pragma.api.users.web.exception.GlobalException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @param <ValueObject>              valor del objeto a retornar
 * @param <DataTransferObject>       objeto de transferencia de datos (simples)
 * @param <DataTransferObjectSearch> objeto de transferencia de datos (búsqueda)
 * @param <TypeId>                   Tipo de dato de la entidad
 */
public interface GlobalSvc<ValueObject, DataTransferObject, DataTransferObjectSearch, TypeId> {
   Mono<Response<ValueObject>> get(TypeId id) throws GlobalException;

   Mono<Response<ValueObject>> add(DataTransferObject model) throws GlobalException;

   Mono<Response<ValueObject>> edit(DataTransferObject model, TypeId id) throws GlobalException;

   Mono<Response<ValueObject>> del(TypeId id) throws GlobalException;

   Flux<Page<ValueObject>> page(DataTransferObjectSearch model, Pageable pageable);

   Flux<List<ValueObject>> all(DataTransferObjectSearch model, Integer limit);
}
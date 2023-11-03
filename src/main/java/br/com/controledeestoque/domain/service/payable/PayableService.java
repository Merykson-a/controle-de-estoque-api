package br.com.controledeestoque.domain.service.payable;

import br.com.controledeestoque.api.io.payable.PayableCreateRequest;
import br.com.controledeestoque.domain.entity.payable.PayableEntity;

import java.util.List;

public interface PayableService {
    void create(PayableCreateRequest request);

    List<PayableEntity> getAll();
}

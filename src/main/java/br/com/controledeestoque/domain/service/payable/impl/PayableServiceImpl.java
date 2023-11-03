package br.com.controledeestoque.domain.service.payable.impl;

import br.com.controledeestoque.api.io.payable.PayableCreateRequest;
import br.com.controledeestoque.domain.entity.payable.PayableEntity;
import br.com.controledeestoque.domain.repository.PayableRepository;
import br.com.controledeestoque.domain.service.payable.PayableService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PayableServiceImpl implements PayableService {

    private final PayableRepository payableRepository;

    @Override
    public List<PayableEntity> getAll() {
        return payableRepository.findAllByDeletedFalse();
    }

    @Override
    public void create(PayableCreateRequest request) {
        PayableEntity payable = new PayableEntity();
        payable.setDescription(request.getDescription());
        payable.setDate(request.getDate());
        payable.setType(request.getType());
        payable.setValue(request.getValue());
        payable.setPaymentCode(request.getPaymentCode());

        payableRepository.save(payable);
    }
}

package br.com.controledeestoque.api.io.payable;

import br.com.controledeestoque.domain.entity.payable.PayableEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PayableMapper {

    public List<PayableListItemResponse> getSimplifiedListByEntities(List<PayableEntity> payables) {
        return payables.stream()
                       .map(payable -> PayableListItemResponse.builder()
                                                              .id(payable.getId())
                                                              .value(payable.getValue())
                                                              .description(payable.getDescription())
                                                              .date(payable.getDate())
                                                              .paymentCode(payable.getPaymentCode())
                                                              .type(payable.getType())
                                                              .build())
                       .collect(Collectors.toList());
    }
}

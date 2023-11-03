package br.com.controledeestoque.api.io.payable;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Builder
public class PayableListItemResponse {
    private UUID id;
    private double value;
    private String description;
    private String type;
    private LocalDate date;
    private String paymentCode;
}

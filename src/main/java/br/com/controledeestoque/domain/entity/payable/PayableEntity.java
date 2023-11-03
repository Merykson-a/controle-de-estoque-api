package br.com.controledeestoque.domain.entity.payable;

import br.com.controledeestoque.domain.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payables")
@Entity
public class PayableEntity extends BaseEntity {

    @Column(name = "value", nullable = false, columnDefinition = "DECIMAL(10,2)")
    private double value;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "payment_code", nullable = false)
    private String paymentCode;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "is_deleted", nullable = false)
    private boolean deleted;
}

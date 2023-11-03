package br.com.controledeestoque.domain.repository;

import br.com.controledeestoque.domain.entity.payable.PayableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PayableRepository extends JpaRepository<PayableEntity, UUID> {
    List<PayableEntity> findAllByDeletedFalse();
}

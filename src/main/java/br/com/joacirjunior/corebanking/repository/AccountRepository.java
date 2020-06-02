package br.com.joacirjunior.corebanking.repository;

import br.com.joacirjunior.corebanking.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity,Long> {

    Optional<AccountEntity> findByDocumentNumber(String documentNumber);

}

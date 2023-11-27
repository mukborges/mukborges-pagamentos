package br.com.mukborges.pagamentos.repository;

import br.com.mukborges.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {


}

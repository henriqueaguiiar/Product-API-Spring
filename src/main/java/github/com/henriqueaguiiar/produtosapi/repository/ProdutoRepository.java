package github.com.henriqueaguiiar.produtosapi.repository;

import github.com.henriqueaguiiar.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoRepository extends JpaRepository <Produto, String>{

}

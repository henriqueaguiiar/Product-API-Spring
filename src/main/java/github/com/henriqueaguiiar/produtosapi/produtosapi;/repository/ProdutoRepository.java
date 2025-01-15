package github.com.henriqueaguiiar.produtosapi.repository;

import github.com.henriqueaguiiar.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProdutoRepository extends JpaRepository <Produto, String>{

    List<Produto> findByNome(String nome);

}

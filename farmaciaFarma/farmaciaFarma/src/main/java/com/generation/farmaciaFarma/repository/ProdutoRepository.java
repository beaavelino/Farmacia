//Farmacia
package com.generation.farmaciaFarma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farmaciaFarma.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByDescricaoTituloContainingIgnoreCase(String descricaoTitulo);
	

}

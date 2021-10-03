//Farmacia
package com.generation.farmaciaFarma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmaciaFarma.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long>{
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String tipo);

}

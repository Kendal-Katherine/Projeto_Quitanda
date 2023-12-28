package com.generation.quitanda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.quitanda.model.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos, Long>{
	
	List<Produtos> findAllByNomeContainingIgnoreCase(@Param("nome") String Nome);

}

package com.blog_pessoal.blogPessoal.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog_pessoal.blogPessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	//findAll-Busca todos / ByTitulo-Pelo título / Containing-Like do sql / IgnoreCase-Desconsidera maiúsculo e minúsculo
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
}
package com.generation.quitanda.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produtos {

	@Id // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto_Increment
	private Long id;

	@Column(length = 100)
	@NotBlank(message = "O atributo nome é obrigatório!")
	@Size(max = 100, message = "O atributo nome deve conter no máximo 100 caracteres.")
	private String nome;

	@NotNull(message = "O atributo preço é obrigatório!")
	private Double preco;

	@NotNull(message = "O atributo quantidade é obrigatório!")
	private Long quantidade;

	@NotNull(message = "O Atributo Data de Validade é obrigatório!")
	@Column(name = "data_validade")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataValidade;

	@Column(length = 1000)
	@NotBlank(message = "O atributo descrição é obrigatório!")
	@Size(max = 1000, message = "O atributo descrição deve conter no máximo 1000 caracteres.")
	private String descricao;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	

}

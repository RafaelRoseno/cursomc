package com.brq.spring.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Builder;

@Builder
@Entity(name = "Estado")
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		private String nome;
		
		@OneToMany(mappedBy="estado")
		private List<Cidade> cidades = new ArrayList<>();
		
//		public Estado() {
//			
//		}

//		public Estado(Integer id, String nome, List<Cidade> cidades) {
//			super();
//			this.id = id;
//			this.nome = nome;
//			this.cidades = cidades;
//		}
//		
//		public Estado(Integer id, String nome) {
//			super();
//			this.id = id;
//			this.nome = nome;
//		}

		
	
}
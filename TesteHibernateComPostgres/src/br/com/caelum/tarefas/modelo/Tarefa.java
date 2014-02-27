package br.com.caelum.tarefas.modelo;

import java.util.Calendar;

@Entity
@Table(name = "tarefas")
public class Tarefa {

	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	private boolean finalizado;

	@Column(name = "data_finalizado", nullable = true)
	private Calendar dataFinalizacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

}

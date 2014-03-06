package main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarefas2")
public class Tarefa2 {
	@Id
	@GeneratedValue
	public Long id;
	public String descricao01;
	public String descricao02;
	public String descricao03;
	public String descricao04;
	public String descricao05;
	public String descricao06;
	public String descricao07;
	public String descricao08;
	public String descricao09;
	public String descricao10;
	public Double numerico01;
	public Double numerico02;
	public Double numerico03;
	public Double numerico04;
	public Double numerico05;
	public Double numerico06;
	public Double numerico07;
	public Double numerico08;
	public Double numerico09;
	public Double numerico10;
	public Float decimal01;
}

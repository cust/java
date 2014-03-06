package tabelascomheranca;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Tabela {
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
	public Double double01;
	public Double double02;
	public Double double03;
	public Double double04;
	public Double double05;
	public Double double06;
	public Double double07;
	public Double double08;
	public Double double09;
	public Double double10;
	public Float float01;
	public Float float02;
	public Float float03;
	public Float float04;
	public Float float05;
	public Float float06;
	public Float float07;
	public Float float08;
	public Float float09;
	public Float float10;
	public boolean boolean01;
	public boolean boolean02;
	public boolean boolean03;
	public boolean boolean04;
	public boolean boolean05;
	public boolean boolean06;
	public boolean boolean07;
	public boolean boolean08;
	public boolean boolean09;
	public boolean boolean10;
	public Date date01;
	public Date date02;
	public Date date03;
	public Date date04;
	public Date date05;
	public Date date06;
	public Date date07;
	public Date date08;
	public Date date09;
	public Date date10;
	public Integer integer01;
	public Integer integer02;
	public Integer integer03;
	public Integer integer04;
	public Integer integer05;
	public Integer integer06;
	public Integer integer07;
	public Integer integer08;
	public Integer integer09;
	public Integer integer10;
}

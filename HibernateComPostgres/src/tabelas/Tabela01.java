package tabelas;

import javax.persistence.Entity;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "id_tabela01", nullable = false)
public class Tabela01 extends Tabela {

}

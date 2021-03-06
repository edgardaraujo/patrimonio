package aluno.infnet.patrimonio.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patrimonio")
public class Patrimonio {

	@Id
	@GeneratedValue
	private Integer id;
	private String descricao;
	private String localizacao;

	public Patrimonio() {
		super();
	}

	public Patrimonio(Integer id, String descricao, String localizacao) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.localizacao = localizacao;
	}

	public Patrimonio(String descricao, String localizacao) {
		super();
		this.descricao = descricao;
		this.localizacao = localizacao;
	}

	@Override
	public String toString() {
		return "Patrimonio [id=" + id + ", descricao=" + descricao + ", localizacao=" + localizacao + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

}

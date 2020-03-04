package model.entity;

public class Endereco {
	
	private Integer id;
	private String rua;
	private String cep;
	private String estado;
	private String bairro;
	private String cidade;
	
	public Endereco(Integer id, String rua, String cep, String bairro, String estado, String cidade) {
		super();
		this.id = id;
		this.rua = rua;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
	}

	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", rua=" + rua + ", cep=" + cep + ", estado=" + estado + ", bairro=" + bairro
				+ ", cidade=" + cidade + "]";
	}
}
package Modelo;

public class Chamado {
	private String nome;
	private String tipo;
	private String Descricao;
	private String status;
	private String Atendente;
	
	public Chamado(String nome, String tipo,String descricao,String status,String atendente) {
		setNome(nome);
		setTipo(tipo);
		setDescricao(descricao);
		setStatus(status);
		setAtendente(atendente);
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public String getDescricao() {
		return Descricao;
	}

	
	public void setDescricao(String descrição) {
		Descricao = descrição;
	}



	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getAtendente() {
		return Atendente;
	}



	public void setAtendente(String atendente) {
		Atendente = atendente;
	}

	public Chamado clone(){
		return new Chamado(getNome(),getTipo(), getDescricao(), getStatus(), getAtendente());
	}

}

package model;

public class Empresa {
	
	private int Id;
	private String Nome;
	private String Endereco;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Empresa [Id=" + Id + ", Nome=" + Nome + ", Endereco=" + Endereco + "]";
	}
	
}

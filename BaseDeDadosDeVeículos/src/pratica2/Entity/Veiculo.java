package pratica2.Entity;

public class Veiculo {
    private String placa;
    public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getRenavam() {
		return renavam;
	}

	public void setRenavam(Integer renavam) {
		this.renavam = renavam;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	private Integer renavam;
	
    public Condutor getCondutor() {
		return condutor;
	}

	public void setCondutor(String nome, String cpf) {
		this.condutor = new Condutor(nome, cpf);
	}

	private Condutor condutor;
    private String modelo;
    private String dataFabricacao;

    public Veiculo(Integer renavam, String placa, String modelo, String dataFabricacao, Condutor condutor) {
        this.placa = placa;
        this.renavam = renavam;
        this.condutor = condutor;
        this.modelo = modelo;
        this.dataFabricacao = dataFabricacao;
    }

    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", renavam='" + renavam + '\'' +
                 condutor +
                ", modelo='" + modelo + '\'' +
                ", Data de fabricação=" + dataFabricacao +
                '}';
    }
    
}
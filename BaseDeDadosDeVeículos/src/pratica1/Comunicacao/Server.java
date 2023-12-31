package pratica1.Comunicacao;

import pratica1.Dados.ArvoreAVL;
import pratica1.Dados.No;
import pratica1.Entity.Veiculo;

public class Server {
    private ArvoreAVL<Veiculo> arvoreVeiculos;

    public Server() {
        arvoreVeiculos = new ArvoreAVL<>();
    }

    public Veiculo consultarVeiculo(String renavam) {
    	No<Veiculo> no = arvoreVeiculos.buscar(renavam);
    	Veiculo v = no.getValor();
        return v;
    }

    public boolean cadastrarVeiculo(Veiculo veiculo) {
        arvoreVeiculos.inserir(veiculo.getRenavam(), veiculo);
        return true; 
    }

    public void removerVeiculo(Veiculo veiculo) {
        arvoreVeiculos.remover(veiculo.getRenavam());
    }

    public void listarVeiculos() {
        arvoreVeiculos.percursoEmOrdem();
    }

    public int getQntVeiculos() {
        return arvoreVeiculos.getQuantidade();
    }
    
    public int getRotDir() {
    	return arvoreVeiculos.getRotDir();
    }
    
    public int getRotEsq() {
    	return arvoreVeiculos.getRotEsq();
    }

    public String encerrarConexao() {
        // Implementar lógica para encerrar a conexão, se necessário
        return "Conexão encerrada.";
    }
}

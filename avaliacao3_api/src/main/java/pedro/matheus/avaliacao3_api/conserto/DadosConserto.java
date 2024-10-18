package pedro.matheus.avaliacao3_api.conserto;

import pedro.matheus.avaliacao3_api.mecanico.DadosMecanico;
import pedro.matheus.avaliacao3_api.mecanico.Mecanico;
import pedro.matheus.avaliacao3_api.veiculo.DadosVeiculo;
import pedro.matheus.avaliacao3_api.veiculo.Veiculo;

public record DadosConserto(String entrada, String saida, DadosVeiculo veiculo, DadosMecanico mecanico) {

}

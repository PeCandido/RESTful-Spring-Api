package pedro.matheus.avaliacao3_api.veiculo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {

    @NotBlank
    private String marca;

    @NotBlank
    private String modelo;

    @NotBlank
    @Pattern(regexp = "^\\d{4}$")
    private String ano;

    private String cor;


    public Veiculo(DadosVeiculo dados){
        this.marca = dados.marca();
        this.modelo = dados.modelo();
        this.ano = dados.ano();
        this.cor = dados.cor();
    }
}

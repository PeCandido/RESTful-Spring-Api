package pedro.matheus.avaliacao3_api.veiculo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosVeiculo(
        @NotBlank
        String marca,
        @NotBlank
        String modelo,
        @NotBlank
        @Pattern(regexp = "^\\d{4}$")
        String ano,
        @NotBlank
        String cor) {
}

package br.senac.tads.dsw.filmes.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FilmesRequest {

    @NotBlank
    private String titulo;
    @NotBlank
    private String genero;
    @NotNull
    private int lancamento;
}
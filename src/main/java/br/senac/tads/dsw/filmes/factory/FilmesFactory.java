package br.senac.tads.dsw.filmes.factory;

import br.senac.tads.dsw.filmes.dto.FilmesRequest;
import br.senac.tads.dsw.filmes.model.FilmesModel;
import org.springframework.beans.BeanUtils;

public class FilmesFactory {

    public FilmesModel createFilme(FilmesRequest filmesRequest) {
        FilmesModel filmesModel = new FilmesModel();
        BeanUtils.copyProperties(filmesRequest, filmesModel);
        return filmesModel;
    }
}
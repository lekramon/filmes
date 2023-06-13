package br.senac.tads.dsw.filmes.service;


import br.senac.tads.dsw.filmes.dto.FilmesRequest;
import br.senac.tads.dsw.filmes.factory.FilmesFactory;
import br.senac.tads.dsw.filmes.model.FilmesModel;
import br.senac.tads.dsw.filmes.repository.FilmesRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FilmesService {

    final FilmesRepository filmesRepository;

    @Transactional
    public FilmesModel save(FilmesRequest filmesRequest) {
        FilmesFactory filmesFactory = new FilmesFactory();
        return filmesRepository.save(filmesFactory.createFilme(filmesRequest));
    }

    public List<FilmesModel> findFilmes() {
        return filmesRepository.findAll();
    }
}
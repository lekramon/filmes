package br.senac.tads.dsw.filmes.controller;

import br.senac.tads.dsw.filmes.dto.FilmesRequest;
import br.senac.tads.dsw.filmes.model.FilmesModel;
import br.senac.tads.dsw.filmes.service.FilmesService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/filmes")
public class FilmesController {

    final FilmesService filmesService;

    @PostMapping
    public ResponseEntity<FilmesModel> saveFilme(@RequestBody @Valid FilmesRequest filmesRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(filmesService.save(filmesRequest));
    }

    @GetMapping
    public ResponseEntity<List<FilmesModel>> getFilme() {
        return ResponseEntity.status(HttpStatus.OK).body(filmesService.findFilmes());
    }
}
package br.senac.tads.dsw.filmes.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_filmes")
public class FilmesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String titulo;
    @Column(nullable = false, length = 100)
    private String genero;
    @Column(nullable = false)
    private int lancamento;
}
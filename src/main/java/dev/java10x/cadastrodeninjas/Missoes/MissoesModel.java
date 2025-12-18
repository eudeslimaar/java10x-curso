package dev.java10x.cadastrodeninjas.Missoes;

import dev.java10x.cadastrodeninjas.Ninjas.Ninja;
import dev.java10x.cadastrodeninjas.Niveis.Difficult;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missao")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Difficult difficult;
    @OneToMany(mappedBy = "missoes" )
    private List<Ninja> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(Long id, String name, Difficult difficult) {
        this.id = id;
        this.name = name;
        this.difficult = difficult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Difficult getDifficult() {
        return difficult;
    }

    public void setDifficult(Difficult difficult) {
        this.difficult = difficult;
    }
}

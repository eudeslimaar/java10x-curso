package dev.java10x.cadastrodeninjas.Missoes;

import dev.java10x.cadastrodeninjas.Ninjas.NinjaModel;
import dev.java10x.cadastrodeninjas.Niveis.Difficult;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missao")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Difficult difficult;
    @OneToMany(mappedBy = "missoes" )
    private List<NinjaModel> ninjas;
}

package ead.experience.domain.ModelDB

import ead.experience.domain.AlunoDB

import io.quarkus.hibernate.orm.panache.PanacheEntity
import javax.persistence.*

@Entity
class AlunoMateriaDB : PanacheEntity(){
        @Id
        @GeneratedValue
        var id: Int? = null
        @ManyToOne( fetch = FetchType.EAGER)
        var materia: MateriaDB? = null
        @ManyToOne( fetch = FetchType.EAGER)
        var aluno: AlunoDB? = null
        var pontuacao: Float? = null
}
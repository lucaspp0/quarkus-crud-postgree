package ead.experience.domain.ModelDB

import ead.experience.domain.Professor
import io.quarkus.hibernate.orm.panache.PanacheEntity
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class MateriaDB{
        @Id
        var id: Int? = null
        var nome: String? = null
        var custo: Float? = null
        var foto: String? = null
        @ManyToOne( fetch = FetchType.EAGER)
        var professor: ProfessorDB? = null
}
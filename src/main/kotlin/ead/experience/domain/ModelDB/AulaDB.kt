package ead.experience.domain.ModelDB
import io.quarkus.hibernate.orm.panache.PanacheEntity
import ead.experience.domain.Materia
import ead.experience.domain.Professor
import java.util.*
import javax.persistence.*

@Entity
class AulaDB{
        @Id
        var id: Int? = null
        var dataInicio: Date? = null
        var dataFinal: Date? = null
        @ManyToOne( fetch = FetchType.EAGER)
        var materia: MateriaDB? = null
        var url: String? = null
        @ManyToOne( fetch = FetchType.EAGER)
        var professor: ProfessorDB? =null
}
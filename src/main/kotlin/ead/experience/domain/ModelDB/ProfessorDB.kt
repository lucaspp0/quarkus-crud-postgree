package ead.experience.domain.ModelDB

import io.quarkus.hibernate.orm.panache.PanacheEntity
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class ProfessorDB{
        @Id
        var id: Int? = null
        var nome: String? = null
        var email: String? = null
        var senha: String? = null
        var login: String? = null
        var foto: String? = null
}
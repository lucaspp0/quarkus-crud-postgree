package ead.experience.domain

import io.quarkus.hibernate.orm.panache.PanacheEntity
import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Null

@Entity
class AlunoDB{
        @Null
        @Id
        var id: Int? = null
        @Null
        var nome: String? = null
        var email: String= ""
        var senha: String= ""
        var login: String= ""
        var foto: String? = null
        var CH: Float? = null



}
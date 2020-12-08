package ead.experience.dto.autentificacao

import org.eclipse.microprofile.openapi.annotations.media.Schema
import java.io.File

open class ProfessorSendDto(
    var id: Int? = null,
    var nome: String? = null,
    var email: String,
    var senha: String,
    var login: String,
    var foto: String? = null
)
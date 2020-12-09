package ead.experience.repository

import ead.experience.domain.AlunoDB
import io.quarkus.hibernate.orm.panache.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class AlunoRepository: PanacheRepository<AlunoDB> {

}
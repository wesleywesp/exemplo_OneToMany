package pt.com.projeto.exemplo2.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pt.com.projeto.exemplo2.modelo.Comentario;

@Repository
public interface ComentarioRepositorio  extends CrudRepository<Comentario, Long>{

}

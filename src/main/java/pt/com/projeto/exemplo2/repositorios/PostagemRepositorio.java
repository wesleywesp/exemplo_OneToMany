package pt.com.projeto.exemplo2.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pt.com.projeto.exemplo2.modelo.Postagem;

@Repository
public interface PostagemRepositorio extends CrudRepository<Postagem , Long> {

}

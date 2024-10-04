package pt.com.projeto.exemplo2.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.com.projeto.exemplo2.modelo.Postagem;
import pt.com.projeto.exemplo2.repositorios.PostagemRepositorio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/postagem")
public class PostagemControle  {
    @Autowired
    private PostagemRepositorio postagem_Repositorio;

    @GetMapping("/listar")
    public Iterable<Postagem> listar() {
        return postagem_Repositorio.findAll();
    }
    
    @PostMapping("/cadastrar")
    public Postagem cadastrar(@RequestBody Postagem obj) {
        return postagem_Repositorio.save(obj);
    }

}

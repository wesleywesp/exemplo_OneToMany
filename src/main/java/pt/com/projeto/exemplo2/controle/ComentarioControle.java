package pt.com.projeto.exemplo2.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.com.projeto.exemplo2.modelo.Comentario;
import pt.com.projeto.exemplo2.repositorios.ComentarioRepositorio;

@RestController
@RequestMapping("/comentario")
public class ComentarioControle {
    @Autowired
    private ComentarioRepositorio comentario_Repositorio;

    @GetMapping("/listar")
    public Iterable<Comentario>listar(){
        return comentario_Repositorio.findAll();
    }
    @PostMapping("/cadastrar")
    public Comentario cadastrar(@RequestBody Comentario obj){

        return comentario_Repositorio.save(obj);


    }

}

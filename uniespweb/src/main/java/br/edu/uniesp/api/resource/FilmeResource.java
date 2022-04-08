package br.edu.uniesp.api.resource;
import br.edu.uniesp.api.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import br.edu.uniesp.api.model.Filme;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Filme")
public class FilmeResource {

    @Autowired
    private FilmeService service;


    @PostMapping
    public Filme salvar(@RequestBody Filme filme){
        filme = service.salvar(filme);
        return filme;
    }

    @GetMapping
    public List<Filme> listar(){
        return service.listar();
    }


    @DeleteMapping("{Id}")
    public void remover(@PathVariable int id){
         service.deletar(id);
    }

    @PutMapping
    public Filme atualizar(@RequestBody Filme filme) throws Exception {
        return service.atualizar(filme);

    }

}

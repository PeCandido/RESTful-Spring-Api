package pedro.matheus.avaliacao3_api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import pedro.matheus.avaliacao3_api.conserto.Conserto;
import pedro.matheus.avaliacao3_api.conserto.ConsertoRepository;
import pedro.matheus.avaliacao3_api.conserto.DadosConserto;
import pedro.matheus.avaliacao3_api.conserto.DadosListagemConserto;

import java.util.List;

@RestController
@RequestMapping("/consertos")
public class ConsertoController {

    @Autowired
    private ConsertoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosConserto conserto) {
        repository.save(new Conserto(conserto));
    }

    @GetMapping
    public Page<Conserto> listar(Pageable paginacao){
        return repository.findAll(paginacao);
    }

    @GetMapping("algunsdados")
    public List<DadosListagemConserto> listarAlgunsDados(){
        return repository.findAll().stream().map(DadosListagemConserto::new).toList();
    }
}

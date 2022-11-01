package ifpr.pgua.eic.listatelefonica.models.repositories;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import ifpr.pgua.eic.listatelefonica.models.Contato;
import ifpr.pgua.eic.listatelefonica.models.DAOs.ContatoDAO;
import ifpr.pgua.eic.listatelefonica.models.results.Result;

public class ContatoRepository {

    private ContatoDAO dao;

    public ContatoRepository(ContatoDAO dao) {
        this.dao = dao;
    }

    public Result cadastrar(String nome,String email,String telefone){      //requisitos e verificações dos dados inseridos
        if(!email.contains("@")){
            return Result.fail("email invalido");
        }

        Contato contato = new Contato(nome, email, telefone);

        return dao.inserir(contato);
    }
    

    public List<Contato> listar(){
        return dao.buscarTodos();
    }

    public List<Contato> filtrarPorNome(String nome){
        return Collections.emptyList();
    }
}

package ifpr.pgua.eic.listatelefonica.models.DAOs;

import java.util.List;

import ifpr.pgua.eic.listatelefonica.models.Contato;
import ifpr.pgua.eic.listatelefonica.models.results.Result;

public interface ContatoDAO {   //interface é um conjunto de metodos a serem implementados
    Result inserir(Contato contato);
    List<Contato> buscarTodos();
}

//se a interface for implementada, os métodos serão obrigatoriamente junto

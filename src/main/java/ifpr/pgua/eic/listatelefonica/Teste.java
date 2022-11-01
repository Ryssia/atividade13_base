package ifpr.pgua.eic.listatelefonica;

import java.util.List;

import ifpr.pgua.eic.listatelefonica.models.Contato;
import ifpr.pgua.eic.listatelefonica.models.FabricaConexoes;
import ifpr.pgua.eic.listatelefonica.models.DAOs.ContatoDAO;
import ifpr.pgua.eic.listatelefonica.models.DAOs.JDBCContatoDAO;
import ifpr.pgua.eic.listatelefonica.models.results.Result;

public class Teste {
    public static void main(String[] args) {
        FabricaConexoes fabrica = FabricaConexoes.getInstance();
        ContatoDAO contadoDAO = new JDBCContatoDAO(fabrica);

        contadoDAO.inserir(new Contato("Zé", "ze@teste.com", "12345"));

        List<Contato> contatos = contadoDAO.buscarTodos();

        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}

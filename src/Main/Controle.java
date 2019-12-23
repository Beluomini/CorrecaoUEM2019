package Main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author radames
 */
public class Controle {

    List<Resposta> lista = new ArrayList<>();


    public Resposta buscar(int chave, String qualQuestao) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
            if (chave==lista.get(i).getResposta()&& qualQuestao.equals(lista.get(i).getQuestao())) {
                return lista.get(i);//se encontrou, retorna a linha toda (um contato)
            }
        }
        return null; //se não encontrou na lista, retorna um contato nulo
    }

    public void inserir(Resposta resposta) {
        lista.add(resposta);
    }

    public List<String> listar() {
        
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            ls.add(""
                    + lista.get(i).getMateria() + ";"
                    + lista.get(i).getQuestao() + ";"
                    + lista.get(i).getResposta()
            );
        }
        return ls;
    }
    
    public int qtdRespostasTotal (){
        int qtd = 0;
        for (int i = 0; i < lista.size(); i++) {
            qtd+=1;
        }
        return qtd;
    }
    
    public void remover(Resposta resposta){
        lista.remove(resposta);
    }
}

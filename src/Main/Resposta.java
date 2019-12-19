
package Main;

/**
 *
 * @author radames
 */
public class Resposta {
    private int prova;
    private int questao;
    private int resposta;
    
    

    public Resposta() {
    }

    public Resposta(int prova, int questao, int resposta) {
        this.prova = prova;
        this.questao = questao;
        this.resposta = resposta;
    }

    @Override
    public String toString() {
        return "Resposta{" + "prova=" + prova + ", questao=" + questao + ", resposta=" + resposta + '}';
    }
    
    public int getProva() {
        return prova;
    }

    public void setProva(int prova) {
        this.prova = prova;
    }
    
    public int getQuestao() {
        return questao;
    }

    public void setQuestao(int questao) {
        this.questao = questao;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }
    
}

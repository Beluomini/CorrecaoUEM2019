
package Main;

/**
 *
 * @author radames
 */
public class Resposta {
    private int materia;
    private int questao;
    private int resposta;

    public Resposta() {
    }

    public Resposta(int materia, int questao, int resposta) {
        this.materia = materia;
        this.questao = questao;
        this.resposta = resposta;
    }

    @Override
    public String toString() {
        return "Resposta{" + "materia=" + materia + ", questao=" + questao + ", resposta=" + resposta + '}';
    }
    
    public int getMateria() {
        return materia;
    }

    public void setMateria(int materia) {
        this.materia = materia;
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

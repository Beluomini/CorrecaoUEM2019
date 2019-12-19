package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import myTools.Ferramentas;
import java.io.File;
import javax.swing.WindowConstants;
import java.util.List;
import tools.CentroDoMonitorMaior;


public class Prova1 extends JDialog{
 


JButton btProva2 = new JButton("Prova 2");

JLabel lbTitulo = new JLabel("CONHECIMENTOS GERAIS");

JLabel lb1 = new JLabel("Questão 1");
JLabel lb2 = new JLabel("Questão 2");
JLabel lb3 = new JLabel("Questão 3");
JLabel lb4 = new JLabel("Questão 4");
JLabel lb5 = new JLabel("Questão 5");
JLabel lb6 = new JLabel("Questão 6");
JLabel lb7 = new JLabel("Questão 7");
JLabel lb8 = new JLabel("Questão 8");
JLabel lb9 = new JLabel("Questão 9");
JLabel lb10 = new JLabel("Questão 10");
JLabel lb11 = new JLabel("Questão 11");
JLabel lb12 = new JLabel("Questão 12");
JLabel lb13 = new JLabel("Questão 13");
JLabel lb14 = new JLabel("Questão 14");
JLabel lb15 = new JLabel("Questão 15");
JLabel lb16 = new JLabel("Questão 16");
JLabel lb17 = new JLabel("Questão 17");
JLabel lb18 = new JLabel("Questão 18");
JLabel lb19 = new JLabel("Questão 19");
JLabel lb20 = new JLabel("Questão 20");
JLabel lb21 = new JLabel("Questão 21");
JLabel lb22 = new JLabel("Questão 22");
JLabel lb23 = new JLabel("Questão 23");
JLabel lb24 = new JLabel("Questão 24");
JLabel lb25 = new JLabel("Questão 25");
JLabel lb26 = new JLabel("Questão 26");
JLabel lb27 = new JLabel("Questão 27");
JLabel lb28 = new JLabel("Questão 28");
JLabel lb29 = new JLabel("Questão 29");
JLabel lb30 = new JLabel("Questão 30");
JLabel lb31 = new JLabel("Questão 31");
JLabel lb32 = new JLabel("Questão 32");
JLabel lb33 = new JLabel("Questão 33");
JLabel lb34 = new JLabel("Questão 34");
JLabel lb35 = new JLabel("Questão 35");
JLabel lb36 = new JLabel("Questão 36");
JLabel lb37 = new JLabel("Questão 37");
JLabel lb38 = new JLabel("Questão 38");
JLabel lb39 = new JLabel("Questão 39");
JLabel lb40 = new JLabel("Questão 40");
JTextField tf1 = new JTextField(2);
JTextField tf2 = new JTextField(2);
JTextField tf3 = new JTextField(2);
JTextField tf4 = new JTextField(2);
JTextField tf5 = new JTextField(2);
JTextField tf6 = new JTextField(2);
JTextField tf7 = new JTextField(2);
JTextField tf8 = new JTextField(2);
JTextField tf9 = new JTextField(2);
JTextField tf10 = new JTextField(2);
JTextField tf11 = new JTextField(2);
JTextField tf12 = new JTextField(2);
JTextField tf13 = new JTextField(2);
JTextField tf14 = new JTextField(2);
JTextField tf15 = new JTextField(2);
JTextField tf16 = new JTextField(2);
JTextField tf17 = new JTextField(2);
JTextField tf18 = new JTextField(2);
JTextField tf19 = new JTextField(2);
JTextField tf20 = new JTextField(2);
JTextField tf21 = new JTextField(2);
JTextField tf22 = new JTextField(2);
JTextField tf23 = new JTextField(2);
JTextField tf24 = new JTextField(2);
JTextField tf25 = new JTextField(2);
JTextField tf26 = new JTextField(2);
JTextField tf27 = new JTextField(2);
JTextField tf28 = new JTextField(2);
JTextField tf29 = new JTextField(2);
JTextField tf30 = new JTextField(2);
JTextField tf31 = new JTextField(2);
JTextField tf32 = new JTextField(2);
JTextField tf33 = new JTextField(2);
JTextField tf34 = new JTextField(2);
JTextField tf35 = new JTextField(2);
JTextField tf36 = new JTextField(2);
JTextField tf37 = new JTextField(2);
JTextField tf38 = new JTextField(2);
JTextField tf39 = new JTextField(2);
JTextField tf40 = new JTextField(2);
double r1;
double r2;
double r3;
double r4;
double r5;
double r6;
double r7;
double r8;
double r9;
double r10;
double r11;
double r12;
double r13;
double r14;
double r15;
double r16;
double r17;
double r18;
double r19;
double r20;
double r21;
double r22;
double r23;
double r24;
double r25;
double r26;
double r27;
double r28;
double r29;
double r30;
double r31;
double r32;
double r33;
double r34;
double r35;
double r36;
double r37;
double r38;
double r39;
double r40;

    JPanel pnPrincipal = new JPanel(new GridLayout(1, 3));
    JPanel pnLeste = new JPanel(new GridLayout(20, 2));
    JPanel pnOeste = new JPanel(new GridLayout(20, 2));
    JPanel pnCentro = new JPanel(new GridLayout(20, 2));
    JPanel pnNorte = new JPanel(new BorderLayout());
    JPanel pnSul = new JPanel(new BorderLayout());


Controle controle = new Controle();
Ferramentas fer = new Ferramentas();


public Prova1() {
Resposta c = new Resposta();
List<String> listaAuxiliar = fer.abrirArquivo(new File("").getAbsolutePath()+ "/src/Main/Respostas.txt");
        if (listaAuxiliar != null) {
            for (int i = 0; i < listaAuxiliar.size(); i++) {
                String aux[] = listaAuxiliar.get(i).split(";");
                c = new Resposta(Integer.valueOf(aux[0]), Integer.valueOf(aux[1]), Integer.valueOf(aux[2]));
            }
        }        setTitle("Alternativas");
        setSize(800, 600);//tamanho da janela
        setModal(true);
        setLayout(new BorderLayout());//informa qual gerenciador de layout será usado
        setBackground(Color.CYAN);//cor do fundo da janela
        Container cp = getContentPane();//container principal, para adicionar nele os outros componentes


cp.add(pnPrincipal, BorderLayout.CENTER);
        cp.add(pnSul, BorderLayout.SOUTH);
        cp.add(pnNorte, BorderLayout.NORTH);

        pnNorte.add(lbTitulo, BorderLayout.CENTER);        pnPrincipal.add(pnOeste);
        pnPrincipal.add(pnCentro);
        pnPrincipal.add(pnLeste);
        
        pnSul.add(btProva2);


pnOeste.add(lb1);
pnOeste.add(tf1);

pnOeste.add(lb2);
pnOeste.add(tf2);

pnOeste.add(lb3);
pnOeste.add(tf3);

pnOeste.add(lb4);
pnOeste.add(tf4);

pnOeste.add(lb5);
pnOeste.add(tf5);

pnOeste.add(lb6);
pnOeste.add(tf6);

pnOeste.add(lb7);
pnOeste.add(tf7);

pnOeste.add(lb8);
pnOeste.add(tf8);

pnOeste.add(lb9);
pnOeste.add(tf9);

pnOeste.add(lb10);
pnOeste.add(tf10);

pnOeste.add(lb11);
pnOeste.add(tf11);

pnOeste.add(lb12);
pnOeste.add(tf12);

pnOeste.add(lb13);
pnOeste.add(tf13);

pnOeste.add(lb14);
pnOeste.add(tf14);

pnOeste.add(lb15);
pnOeste.add(tf15);

pnOeste.add(lb16);
pnOeste.add(tf16);

pnOeste.add(lb17);
pnOeste.add(tf17);

pnOeste.add(lb18);
pnOeste.add(tf18);

pnOeste.add(lb19);
pnOeste.add(tf19);

pnOeste.add(lb20);
pnOeste.add(tf20);

pnLeste.add(lb21);
pnLeste.add(tf21);

pnLeste.add(lb22);
pnLeste.add(tf22);

pnLeste.add(lb23);
pnLeste.add(tf23);

pnLeste.add(lb24);
pnLeste.add(tf24);

pnLeste.add(lb25);
pnLeste.add(tf25);

pnLeste.add(lb26);
pnLeste.add(tf26);

pnLeste.add(lb27);
pnLeste.add(tf27);

pnLeste.add(lb28);
pnLeste.add(tf28);

pnLeste.add(lb29);
pnLeste.add(tf29);

pnLeste.add(lb30);
pnLeste.add(tf30);

pnLeste.add(lb31);
pnLeste.add(tf31);

pnLeste.add(lb32);
pnLeste.add(tf32);

pnLeste.add(lb33);
pnLeste.add(tf33);

pnLeste.add(lb34);
pnLeste.add(tf34);

pnLeste.add(lb35);
pnLeste.add(tf35);

pnLeste.add(lb36);
pnLeste.add(tf36);

pnLeste.add(lb37);
pnLeste.add(tf37);

pnLeste.add(lb38);
pnLeste.add(tf38);

pnLeste.add(lb39);
pnLeste.add(tf39);

pnLeste.add(lb40);
pnLeste.add(tf40);

tf1.setText("1");
tf2.setText("2");
tf3.setText("3");
tf4.setText("4");
tf5.setText("5");
tf6.setText("6");
tf7.setText("7");
tf8.setText("78");
tf9.setText("89");
tf10.setText("90");
tf11.setText("8");
tf12.setText("6");
tf13.setText("5");
tf14.setText("4");
tf15.setText("3");
tf16.setText("3");
tf17.setText("4");
tf18.setText("4");
tf19.setText("3");
tf20.setText("4");
tf21.setText("4");
tf22.setText("5");
tf23.setText("5");
tf24.setText("4");
tf25.setText("4");
tf26.setText("3");
tf27.setText("4");
tf28.setText("4");
tf29.setText("5");
tf30.setText("6");
tf31.setText("54");
tf32.setText("4");
tf33.setText("1");
tf34.setText("4");
tf35.setText("5");
tf36.setText("3");
tf37.setText("3");
tf38.setText("4");
tf39.setText("5");
tf40.setText("6");
// Botões
            btProva2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
try{

                 Resposta resposta1 = new Resposta();
            resposta1.setProva(1);
            resposta1.setQuestao(1);
            resposta1.setResposta(Integer.valueOf(tf1.getText()));
            controle.inserir(resposta1);
                 Resposta resposta2 = new Resposta();
            resposta2.setProva(1);
            resposta2.setQuestao(2);
            resposta2.setResposta(Integer.valueOf(tf2.getText()));
            controle.inserir(resposta2);
                 Resposta resposta3 = new Resposta();
            resposta3.setProva(1);
            resposta3.setQuestao(3);
            resposta3.setResposta(Integer.valueOf(tf3.getText()));
            controle.inserir(resposta3);
                 Resposta resposta4 = new Resposta();
            resposta4.setProva(1);
            resposta4.setQuestao(4);
            resposta4.setResposta(Integer.valueOf(tf4.getText()));
            controle.inserir(resposta4);
                 Resposta resposta5 = new Resposta();
            resposta5.setProva(1);
            resposta5.setQuestao(5);
            resposta5.setResposta(Integer.valueOf(tf5.getText()));
            controle.inserir(resposta5);
                 Resposta resposta6 = new Resposta();
            resposta6.setProva(1);
            resposta6.setQuestao(6);
            resposta6.setResposta(Integer.valueOf(tf6.getText()));
            controle.inserir(resposta6);
                 Resposta resposta7 = new Resposta();
            resposta7.setProva(1);
            resposta7.setQuestao(7);
            resposta7.setResposta(Integer.valueOf(tf7.getText()));
            controle.inserir(resposta7);
                 Resposta resposta8 = new Resposta();
            resposta8.setProva(1);
            resposta8.setQuestao(8);
            resposta8.setResposta(Integer.valueOf(tf8.getText()));
            controle.inserir(resposta8);
                 Resposta resposta9 = new Resposta();
            resposta9.setProva(1);
            resposta9.setQuestao(9);
            resposta9.setResposta(Integer.valueOf(tf9.getText()));
            controle.inserir(resposta9);
                 Resposta resposta10 = new Resposta();
            resposta10.setProva(1);
            resposta10.setQuestao(10);
            resposta10.setResposta(Integer.valueOf(tf10.getText()));
            controle.inserir(resposta10);
                 Resposta resposta11 = new Resposta();
            resposta11.setProva(1);
            resposta11.setQuestao(11);
            resposta11.setResposta(Integer.valueOf(tf11.getText()));
            controle.inserir(resposta11);
                 Resposta resposta12 = new Resposta();
            resposta12.setProva(1);
            resposta12.setQuestao(12);
            resposta12.setResposta(Integer.valueOf(tf12.getText()));
            controle.inserir(resposta12);
                 Resposta resposta13 = new Resposta();
            resposta13.setProva(1);
            resposta13.setQuestao(13);
            resposta13.setResposta(Integer.valueOf(tf13.getText()));
            controle.inserir(resposta13);
                 Resposta resposta14 = new Resposta();
            resposta14.setProva(1);
            resposta14.setQuestao(14);
            resposta14.setResposta(Integer.valueOf(tf14.getText()));
            controle.inserir(resposta14);
                 Resposta resposta15 = new Resposta();
            resposta15.setProva(1);
            resposta15.setQuestao(15);
            resposta15.setResposta(Integer.valueOf(tf15.getText()));
            controle.inserir(resposta15);
                 Resposta resposta16 = new Resposta();
            resposta16.setProva(1);
            resposta16.setQuestao(16);
            resposta16.setResposta(Integer.valueOf(tf16.getText()));
            controle.inserir(resposta16);
                 Resposta resposta17 = new Resposta();
            resposta17.setProva(1);
            resposta17.setQuestao(17);
            resposta17.setResposta(Integer.valueOf(tf17.getText()));
            controle.inserir(resposta17);
                 Resposta resposta18 = new Resposta();
            resposta18.setProva(1);
            resposta18.setQuestao(18);
            resposta18.setResposta(Integer.valueOf(tf18.getText()));
            controle.inserir(resposta18);
                 Resposta resposta19 = new Resposta();
            resposta19.setProva(1);
            resposta19.setQuestao(19);
            resposta19.setResposta(Integer.valueOf(tf19.getText()));
            controle.inserir(resposta19);
                 Resposta resposta20 = new Resposta();
            resposta20.setProva(1);
            resposta20.setQuestao(20);
            resposta20.setResposta(Integer.valueOf(tf20.getText()));
            controle.inserir(resposta20);
                 Resposta resposta21 = new Resposta();
            resposta21.setProva(1);
            resposta21.setQuestao(21);
            resposta21.setResposta(Integer.valueOf(tf21.getText()));
            controle.inserir(resposta21);
                 Resposta resposta22 = new Resposta();
            resposta22.setProva(1);
            resposta22.setQuestao(22);
            resposta22.setResposta(Integer.valueOf(tf22.getText()));
            controle.inserir(resposta22);
                 Resposta resposta23 = new Resposta();
            resposta23.setProva(1);
            resposta23.setQuestao(23);
            resposta23.setResposta(Integer.valueOf(tf23.getText()));
            controle.inserir(resposta23);
                 Resposta resposta24 = new Resposta();
            resposta24.setProva(1);
            resposta24.setQuestao(24);
            resposta24.setResposta(Integer.valueOf(tf24.getText()));
            controle.inserir(resposta24);
                 Resposta resposta25 = new Resposta();
            resposta25.setProva(1);
            resposta25.setQuestao(25);
            resposta25.setResposta(Integer.valueOf(tf25.getText()));
            controle.inserir(resposta25);
                 Resposta resposta26 = new Resposta();
            resposta26.setProva(1);
            resposta26.setQuestao(26);
            resposta26.setResposta(Integer.valueOf(tf26.getText()));
            controle.inserir(resposta26);
                 Resposta resposta27 = new Resposta();
            resposta27.setProva(1);
            resposta27.setQuestao(27);
            resposta27.setResposta(Integer.valueOf(tf27.getText()));
            controle.inserir(resposta27);
                 Resposta resposta28 = new Resposta();
            resposta28.setProva(1);
            resposta28.setQuestao(28);
            resposta28.setResposta(Integer.valueOf(tf28.getText()));
            controle.inserir(resposta28);
                 Resposta resposta29 = new Resposta();
            resposta29.setProva(1);
            resposta29.setQuestao(29);
            resposta29.setResposta(Integer.valueOf(tf29.getText()));
            controle.inserir(resposta29);
                 Resposta resposta30 = new Resposta();
            resposta30.setProva(1);
            resposta30.setQuestao(30);
            resposta30.setResposta(Integer.valueOf(tf30.getText()));
            controle.inserir(resposta30);
                 Resposta resposta31 = new Resposta();
            resposta31.setProva(1);
            resposta31.setQuestao(31);
            resposta31.setResposta(Integer.valueOf(tf31.getText()));
            controle.inserir(resposta31);
                 Resposta resposta32 = new Resposta();
            resposta32.setProva(1);
            resposta32.setQuestao(32);
            resposta32.setResposta(Integer.valueOf(tf32.getText()));
            controle.inserir(resposta32);
                 Resposta resposta33 = new Resposta();
            resposta33.setProva(1);
            resposta33.setQuestao(33);
            resposta33.setResposta(Integer.valueOf(tf33.getText()));
            controle.inserir(resposta33);
                 Resposta resposta34 = new Resposta();
            resposta34.setProva(1);
            resposta34.setQuestao(34);
            resposta34.setResposta(Integer.valueOf(tf34.getText()));
            controle.inserir(resposta34);
                 Resposta resposta35 = new Resposta();
            resposta35.setProva(1);
            resposta35.setQuestao(35);
            resposta35.setResposta(Integer.valueOf(tf35.getText()));
            controle.inserir(resposta35);
                 Resposta resposta36 = new Resposta();
            resposta36.setProva(1);
            resposta36.setQuestao(36);
            resposta36.setResposta(Integer.valueOf(tf36.getText()));
            controle.inserir(resposta36);
                 Resposta resposta37 = new Resposta();
            resposta37.setProva(1);
            resposta37.setQuestao(37);
            resposta37.setResposta(Integer.valueOf(tf37.getText()));
            controle.inserir(resposta37);
                 Resposta resposta38 = new Resposta();
            resposta38.setProva(1);
            resposta38.setQuestao(38);
            resposta38.setResposta(Integer.valueOf(tf38.getText()));
            controle.inserir(resposta38);
                 Resposta resposta39 = new Resposta();
            resposta39.setProva(1);
            resposta39.setQuestao(39);
            resposta39.setResposta(Integer.valueOf(tf39.getText()));
            controle.inserir(resposta39);
                 Resposta resposta40 = new Resposta();
            resposta40.setProva(1);
            resposta40.setQuestao(40);
            resposta40.setResposta(Integer.valueOf(tf40.getText()));
            controle.inserir(resposta40);

           } catch (Exception e) {
                   JOptionPane.showMessageDialog(cp, "Algum valor está incorreto");
                }
           try{
                List<String> a = controle.listar();
                fer.salvarArquivo(new File("").getAbsolutePath() + "/src/Main/Respostas.txt", a);
                } catch (Exception e) {
                    System.out.println("DEU RUIM");
                }            }
        });


setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //antes de sair do sistema, grava os dados da lista em disco
        CentroDoMonitorMaior centroDoMonitorMaior = new CentroDoMonitorMaior();
        setLocation(centroDoMonitorMaior.getCentroMonitorMaior(this));
        setVisible(true);//faz a janela ficar visível

    } //fim do construtor 

}//fim

package Main;

import Geradores.GerarProva2;
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
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import tools.CentroDoMonitorMaior;

public class Resultado extends JDialog {

    JButton btOk = new JButton("OK");

    JLabel lbTitulo = new JLabel("RESULTADO");

    JLabel lbPortugues = new JLabel("Lingua Portuguesa:");
    JLabel lbLiteratura = new JLabel("Literatura:");
    JLabel lbLinguaEstrangeira = new JLabel("");
    JLabel lbEspecifica1 = new JLabel("");
    JLabel lbEspecifica2 = new JLabel("");
    JLabel lbTotal = new JLabel("Total:");
    
    JLabel lbPort = new JLabel("");
    JLabel lbLit = new JLabel("");
    JLabel lbLinEst = new JLabel("");
    JLabel lbEsp1 = new JLabel("");
    JLabel lbEsp2 = new JLabel("");
    JLabel lbTot = new JLabel("");
    
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
    JPanel pnCentro = new JPanel(new GridLayout(7, 2));
    JPanel pnNorte = new JPanel();
    JPanel pnSul = new JPanel(new BorderLayout());

    Controle controle = new Controle();
    Ferramentas fer = new Ferramentas();
    
    String especifica1;
    String especifica2;
    String linguaEst;
    
    int esp1;
    int esp2;
    int linEst;

    public Resultado() {
        Resposta c = new Resposta();
        List<String> listaAuxiliar = fer.abrirArquivo(new File("").getAbsolutePath() + "/src/Main/Respostas.txt");
        if (listaAuxiliar != null) {
            for (int i = 0; i < listaAuxiliar.size(); i++) {
                String aux[] = listaAuxiliar.get(i).split(";");
                c = new Resposta(Integer.valueOf(aux[0]), Integer.valueOf(aux[1]), Integer.valueOf(aux[2]));
            }
        }
        
        List<String> listaAuxiliar2 = fer.abrirArquivo(new File("").getAbsolutePath() + "/src/Main/Especificas.txt");
        if (listaAuxiliar2 != null) {
            for (int i = 0; i < listaAuxiliar2.size(); i++) {
                String aux1[] = listaAuxiliar2.get(i).split(";");
                linguaEst=aux1[0];
                especifica1=aux1[1];
                especifica2=aux1[2];
            }
        }
        
        if(linguaEst.equals("Espanhol")){
                linEst = 4;
            }else if(linguaEst.equals("Françes")){
                linEst = 5;
            }else if(linguaEst.equals("Françes")){
                linEst = 6;
            }
                
        if(especifica1.equals("Arte")){
                esp1 = 7;
            }else if(especifica1.equals("Biologia")){
                esp1 = 8;
            }else if(especifica1.equals("EdFisica")){
                esp1 = 9;
            }else if(especifica1.equals("Filosofia")){
                esp1 = 10;
            }else if(especifica1.equals("Fisica")){
                esp1 = 11;
            }else if(especifica1.equals("Geografia")){
                esp1 = 12;
            }else if(especifica1.equals("Historia")){
                esp1 = 13;
            }else if(especifica1.equals("Matematica")){
                esp1 = 14;
            }
        
        if(especifica2.equals("Historia")){
                esp2 = 13;
            }else if(especifica2.equals("Matematica")){
                esp2 = 14;
            }else if(especifica2.equals("Quimica")){
                esp2 = 15;
            }else if(especifica2.equals("Sociologia")){
                esp2 = 16;
            }
        
        setTitle("Alternativas");
        setSize(800, 600);//tamanho da janela
        setModal(true);
        setLayout(new BorderLayout());//informa qual gerenciador de layout será usado
        setBackground(Color.CYAN);//cor do fundo da janela
        Container cp = getContentPane();//container principal, para adicionar nele os outros componentes

        cp.add(pnPrincipal, BorderLayout.CENTER);
        cp.add(pnSul, BorderLayout.SOUTH);
        cp.add(pnNorte, BorderLayout.NORTH);

        pnNorte.add(lbTitulo);
        pnPrincipal.add(pnCentro);
        pnSul.add(btOk);
        
        pnCentro.add(lbPortugues);
        pnCentro.add(lbPort);
        
        pnCentro.add(lbLiteratura);
        pnCentro.add(lbLit);
        
        pnCentro.add(lbLinguaEstrangeira);
        pnCentro.add(lbLinEst);
        
        pnCentro.add(lbEspecifica1);
        pnCentro.add(lbEsp1);
        
        pnCentro.add(lbEspecifica2);
        pnCentro.add(lbEsp2);
        
        lbLinguaEstrangeira.setText(linguaEst);
        lbEspecifica1.setText(especifica1);
        lbEspecifica2.setText(especifica2);
        
        List<String> zerar = controle.listar();
        zerar.clear();
        fer.salvarArquivo(new File("").getAbsolutePath() + "/src/Main/Respostas.txt", zerar);
        
        //--------------------------------- C O N T A ---------------------------------------
        
        
        
        
        
        
        
        
        
        
        //--------------------------------- C O N T A ---------------------------------------
        
// Botões
        btOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
            }
        });

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //antes de sair do sistema, grava os dados da lista em disco
        CentroDoMonitorMaior centroDoMonitorMaior = new CentroDoMonitorMaior();
        setLocation(centroDoMonitorMaior.getCentroMonitorMaior(this));
        setVisible(true);//faz a janela ficar visível

    } //fim do construtor 

}//fim

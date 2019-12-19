package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import tools.CentroDoMonitorMaior;

public class ProdutoGUI extends JDialog {

    JButton btProva2 = new JButton("Prova 2");

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
    /*
     JLabel lb41 = new JLabel("Questão 41");
     JLabel lb42 = new JLabel("Questão 42");
     JLabel lb43 = new JLabel("Questão 43");
     JLabel lb44 = new JLabel("Questão 44");
     JLabel lb45 = new JLabel("Questão 45");
     JLabel lb46 = new JLabel("Questão 46");
     JLabel lb47 = new JLabel("Questão 47");
     JLabel lb48 = new JLabel("Questão 48");
     JLabel lb49 = new JLabel("Questão 49");
     JLabel lb50 = new JLabel("Questão 50");
     */

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
    /*
     JTextField tf41 = new JTextField(2);
     JTextField tf42 = new JTextField(2);
     JTextField tf43 = new JTextField(2);
     JTextField tf44 = new JTextField(2);
     JTextField tf45 = new JTextField(2);
     JTextField tf46 = new JTextField(2);
     JTextField tf47 = new JTextField(2);
     JTextField tf48 = new JTextField(2);
     JTextField tf49 = new JTextField(2);
     JTextField tf50 = new JTextField(2);
     */

    JPanel pnPrincipal = new JPanel(new GridLayout(1, 3));
    JPanel pnLeste = new JPanel(new GridLayout(20, 2));
    JPanel pnOeste = new JPanel(new GridLayout(20, 2));
    JPanel pnCentro = new JPanel(new GridLayout(20, 2));
    JPanel pnSul = new JPanel(new BorderLayout());

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
    double r41;
    double r42;
    double r43;
    double r44;
    double r45;
    double r46;
    double r47;
    double r48;
    double r49;
    double r50;

    public ProdutoGUI() {

        setTitle("Alternativas");
        setSize(800, 600);//tamanho da janela
        setModal(true);
        setLayout(new BorderLayout());//informa qual gerenciador de layout será usado
        setBackground(Color.CYAN);//cor do fundo da janela
        Container cp = getContentPane();//container principal, para adicionar nele os outros componentes

        cp.add(pnPrincipal, BorderLayout.CENTER);
        cp.add(pnSul, BorderLayout.SOUTH);

        pnPrincipal.add(pnOeste);
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
        
        // Botões
        btProva2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Component[] cmps = pnOeste.getComponents();
                for (Component c : cmps) {
                    if (c instanceof JTextField) {
                    }
                }
            }
        });

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //antes de sair do sistema, grava os dados da lista em disco
        CentroDoMonitorMaior centroDoMonitorMaior = new CentroDoMonitorMaior();
        setLocation(centroDoMonitorMaior.getCentroMonitorMaior(this));
        setVisible(true);//faz a janela ficar visível

    } //fim do construtor 

}//fim

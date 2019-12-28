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

    JLabel lbConhecimentosGerais = new JLabel("Conhecimentos Gerais:");
    JLabel lbPortugues = new JLabel("Lingua Portuguesa:");
    JLabel lbLiteratura = new JLabel("Literatura:");
    JLabel lbLinguaEstrangeira = new JLabel("");
    JLabel lbEspecifica1 = new JLabel("");
    JLabel lbEspecifica2 = new JLabel("");
    JLabel lbTotal = new JLabel("Total:");

    JLabel lbCG = new JLabel("");
    JLabel lbPort = new JLabel("");
    JLabel lbLit = new JLabel("");
    JLabel lbLinEst = new JLabel("");
    JLabel lbEsp1 = new JLabel("");
    JLabel lbEsp2 = new JLabel("");
    JLabel lbTot = new JLabel("");

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

        List<String> listaAuxiliar = fer.abrirArquivo(new File("").getAbsolutePath() + "/src/Dados/Especificas.txt");
        if (listaAuxiliar != null) {
            for (int i = 0; i < listaAuxiliar.size(); i++) {
                String aux1[] = listaAuxiliar.get(i).split(";");
                linguaEst = aux1[0];
                especifica1 = aux1[1];
                especifica2 = aux1[2];
            }
        }

        if (linguaEst.equals("Espanhol")) {
            linEst = 4;
        } else if (linguaEst.equals("Françes")) {
            linEst = 5;
        } else if (linguaEst.equals("Françes")) {
            linEst = 6;
        }

        if (especifica1.equals("Arte")) {
            esp1 = 7;
        } else if (especifica1.equals("Biologia")) {
            esp1 = 8;
        } else if (especifica1.equals("EdFisica")) {
            esp1 = 9;
        } else if (especifica1.equals("Filosofia")) {
            esp1 = 10;
        } else if (especifica1.equals("Fisica")) {
            esp1 = 11;
        } else if (especifica1.equals("Geografia")) {
            esp1 = 12;
        } else if (especifica1.equals("Historia")) {
            esp1 = 13;
        } else if (especifica1.equals("Matematica")) {
            esp1 = 14;
        }

        if (especifica2.equals("Historia")) {
            esp2 = 13;
        } else if (especifica2.equals("Matematica")) {
            esp2 = 14;
        } else if (especifica2.equals("Quimica")) {
            esp2 = 15;
        } else if (especifica2.equals("Sociologia")) {
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

        pnCentro.add(lbConhecimentosGerais);
        pnCentro.add(lbCG);

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

        pnCentro.add(lbTotal);
        pnCentro.add(lbTot);

        lbLinguaEstrangeira.setText(linguaEst);
        lbEspecifica1.setText(especifica1);
        lbEspecifica2.setText(especifica2);

        List<String> zerar = controle.listar();
        zerar.clear();
        fer.salvarArquivo(new File("").getAbsolutePath() + "/src/Main/Respostas.txt", zerar);

        //--------------------------------- C O N T A ---------------------------------------
        double notaCG = 0;
        double notaLP = 0;
        double notaLI = 0;
        double notaLE = 0;
        double notaEsp1 = 0;
        double notaEsp2 = 0;

        List<String> respostas = fer.abrirArquivo(new File("").getAbsolutePath() + "/src/Dados/Respostas.txt");
        List<String> gabaritos = fer.abrirArquivo(new File("").getAbsolutePath() + "/src/Dados/Gabarito.txt");

        System.out.println(linguaEst + " - " + linEst + " --- " + especifica1 + " - " + esp1 + " --- " + especifica2 + " - " + esp2);

        if (respostas != null) {
            for (int i = 0; i < respostas.size(); i++) {
                for (int j = 0; j < gabaritos.size(); j++) {

                    boolean um = false;
                    boolean dois = false;
                    boolean quatro = false;
                    boolean oito = false;
                    boolean dezesseis = false;

                    boolean umAlu = false;
                    boolean doisAlu = false;
                    boolean quatroAlu = false;
                    boolean oitoAlu = false;
                    boolean dezesseisAlu = false;

                    double notaQst = 0;

                    String r[] = respostas.get(i).split(";");
                    String g[] = gabaritos.get(j).split(";");

                    int matAlu = Integer.valueOf(r[0]);
                    int qstAlu = Integer.valueOf(r[1]);
                    int rspAlu = Integer.valueOf(r[2]);

                    int matGab = Integer.valueOf(g[0]);
                    int qstGab = Integer.valueOf(g[1]);
                    int rspGab = Integer.valueOf(g[2]);

                    double qtdcertosqst = 0;

                    //--------------------------------- C O N T A ---------------------------------------        
                    if (matAlu == matGab) {
                        if (qstAlu == qstGab) {

                            //------ ver no gabarito quais estão certas -------
                            if (rspGab != 0) {
                                System.out.println(qstGab + "----------");
                                if (rspGab % 2 != 0) {
                                    um = true;
                                    qtdcertosqst += 1;
                                    rspGab = rspGab - 1;
                                    if (rspGab - 2 < 0) { //ve se foi 1
                                    } else if (rspGab - 4 < 0) { //ve se for 2
                                        dois = true;
                                        qtdcertosqst += 1;

                                    } else if (rspGab - 8 < 0) {
                                        if (rspGab - 4 > 0) { //6
                                            dois = true;
                                            qtdcertosqst += 1;
                                            quatro = true;
                                            qtdcertosqst += 1;
                                        } else if (rspGab - 4 == 0) {//4
                                            quatro = true;
                                            qtdcertosqst += 1;
                                        }

                                    } else if (rspGab - 16 < 0) {
                                        if (rspGab - 8 > 0) {
                                            oito = true;
                                            qtdcertosqst += 1;
                                            rspGab = rspGab - 8;
                                            if (rspGab - 4 > 0) {
                                                dois = true;
                                                qtdcertosqst += 1;
                                                quatro = true;
                                                qtdcertosqst += 1;
                                            } else if (rspGab - 4 == 0) {
                                                quatro = true;
                                                qtdcertosqst += 1;
                                            } else if (rspGab - 4 < 0) {
                                                dois = true;
                                                qtdcertosqst += 1;
                                            }
                                        } else if (rspGab - 8 == 0) {
                                            oito = true;
                                            qtdcertosqst += 1;
                                        }

                                    } else {
                                        dezesseis = true;                                       
                                        qtdcertosqst += 1;
                                        rspGab = rspGab - 16;
                                        if (rspGab - 8 > 0) {
                                            oito = true;
                                            qtdcertosqst += 1;
                                            rspGab = rspGab - 8;
                                            if (rspGab - 4 > 0) {
                                                dois = true;
                                                qtdcertosqst += 1;
                                                quatro = true;
                                                qtdcertosqst += 1;
                                            } else if (rspGab - 4 == 0) {
                                                quatro = true;
                                                qtdcertosqst += 1;
                                            } else if (rspGab - 4 < 0) {
                                                dois = true;
                                                qtdcertosqst += 1;
                                            }
                                        } else if (rspGab - 8 == 0) {
                                            oito = true;
                                            qtdcertosqst += 1;
                                        } else {
                                            if (rspGab - 4 > 0) {
                                                dois = true;
                                                qtdcertosqst += 1;
                                                quatro = true;
                                                qtdcertosqst += 1;
                                            } else if (rspGab - 4 == 0) {
                                                quatro = true;
                                                qtdcertosqst += 1;
                                            } else if (rspGab - 4 < 0) {
                                                dois = true;
                                                qtdcertosqst += 1;
                                            }
                                        }
                                    }

                                } else {
                                    if (rspGab - 4 < 0) { //ve se for 2
                                        dois = true;
                                        qtdcertosqst += 1;

                                    } else if (rspGab - 8 < 0) {
                                        if (rspGab - 4 > 0) { //6
                                            dois = true;
                                            qtdcertosqst += 1;
                                            quatro = true;
                                            qtdcertosqst += 1;
                                        } else if (rspGab - 4 == 0) {//4
                                            quatro = true;
                                            qtdcertosqst += 1;
                                        }

                                    } else if (rspGab - 16 < 0) {
                                        if (rspGab - 8 > 0) {
                                            oito = true;
                                            qtdcertosqst += 1;
                                            rspGab = rspGab - 8;
                                            if (rspGab - 4 > 0) {
                                                dois = true;
                                                qtdcertosqst += 1;
                                                quatro = true;
                                                qtdcertosqst += 1;
                                            } else if (rspGab - 4 == 0) {
                                                quatro = true;
                                                qtdcertosqst += 1;
                                            } else if (rspGab - 4 < 0) {
                                                dois = true;
                                                qtdcertosqst += 1;
                                            }
                                        } else if (rspGab - 8 == 0) {
                                            oito = true;
                                            qtdcertosqst += 1;
                                        }

                                    } else {
                                        dezesseis = true;
                                        qtdcertosqst += 1;
                                        rspGab = rspGab - 16;
                                        if (rspGab - 8 > 0) {
                                            oito = true;
                                            qtdcertosqst += 1;
                                            rspGab = rspGab - 8;
                                            if (rspGab - 4 > 0) {
                                                dois = true;
                                                qtdcertosqst += 1;
                                                quatro = true;
                                                qtdcertosqst += 1;
                                            } else if (rspGab - 4 == 0) {
                                                quatro = true;
                                                qtdcertosqst += 1;
                                            } else if (rspGab - 4 < 0) {
                                                dois = true;
                                                qtdcertosqst += 1;
                                            }
                                        } else if (rspGab - 8 == 0) {
                                            oito = true;
                                            qtdcertosqst += 1;
                                        } else {
                                            if (rspGab - 4 > 0) {
                                                dois = true;
                                                qtdcertosqst += 1;
                                                quatro = true;
                                                qtdcertosqst += 1;
                                            } else if (rspGab - 4 == 0) {
                                                quatro = true;
                                                qtdcertosqst += 1;
                                            } else if (rspGab - 4 < 0) {
                                                dois = true;
                                                qtdcertosqst += 1;
                                            }
                                        }
                                    }
                                }

                            }

                            //------ ver no gabarito quais estão certas -------
                            //=================================================        
                            //------ ver nas respostas quantas acertou -------
                            
                            rspGab = Integer.valueOf(g[2]);
                            
                            if (rspAlu < rspGab) {

                                if (rspAlu != 0) {

                                    if (rspAlu % 2 != 0) {
                                        umAlu = true;
                                        rspAlu = rspAlu - 1;
                                        if (rspAlu - 2 < 0) { //ve se foi 1
                                        } else if (rspAlu - 4 < 0) { //ve se for 2
                                            doisAlu = true;

                                        } else if (rspAlu - 8 < 0) {
                                            if (rspAlu - 4 > 0) { //6
                                                doisAlu = true;
                                                quatroAlu = true;
                                            } else if (rspAlu - 4 == 0) {//4
                                                quatroAlu = true;
                                            }

                                        } else if (rspAlu - 16 < 0) {
                                            if (rspAlu - 8 > 0) {
                                                oitoAlu = true;
                                                rspAlu = rspAlu - 8;
                                                if (rspAlu - 4 > 0) {
                                                    doisAlu = true;
                                                    quatroAlu = true;
                                                } else if (rspAlu - 4 == 0) {
                                                    quatroAlu = true;
                                                } else if (rspAlu - 4 < 0) {
                                                    doisAlu = true;
                                                }
                                            } else if (rspAlu - 8 == 0) {
                                                oitoAlu = true;
                                            }

                                        } else {
                                            dezesseisAlu = true;
                                            rspAlu = rspAlu - 16;
                                            if (rspAlu - 8 > 0) {
                                                oitoAlu = true;
                                                rspAlu = rspAlu - 8;
                                                if (rspAlu - 4 > 0) {
                                                    doisAlu = true;
                                                    quatroAlu = true;
                                                } else if (rspAlu - 4 == 0) {
                                                    quatroAlu = true;
                                                } else if (rspAlu - 4 < 0) {
                                                    doisAlu = true;
                                                }
                                            } else if (rspAlu - 8 == 0) {
                                                oitoAlu = true;
                                            } else {
                                                if (rspAlu - 4 > 0) {
                                                    doisAlu = true;
                                                    quatroAlu = true;
                                                } else if (rspAlu - 4 == 0) {
                                                    quatroAlu = true;
                                                } else if (rspAlu - 4 < 0) {
                                                    doisAlu = true;
                                                }
                                            }
                                        }

                                    } else {
                                        if (rspAlu - 4 < 0) { //ve se for 2
                                            doisAlu = true;

                                        } else if (rspAlu - 8 < 0) {
                                            if (rspAlu - 4 > 0) { //6
                                                doisAlu = true;
                                                quatroAlu = true;
                                            } else if (rspAlu - 4 == 0) {//4
                                                quatroAlu = true;
                                            }

                                        } else if (rspAlu - 16 < 0) {
                                            if (rspAlu - 8 > 0) {
                                                oitoAlu = true;
                                                rspAlu = rspAlu - 8;
                                                if (rspAlu - 4 > 0) {
                                                    doisAlu = true;
                                                    quatroAlu = true;
                                                } else if (rspAlu - 4 == 0) {
                                                    quatroAlu = true;
                                                } else if (rspAlu - 4 < 0) {
                                                    doisAlu = true;
                                                }
                                            } else if (rspAlu - 8 == 0) {
                                                oitoAlu = true;
                                            }

                                        } else {
                                            dezesseisAlu = true;
                                            rspAlu = rspAlu - 16;
                                            if (rspAlu - 8 > 0) {
                                                oitoAlu = true;
                                                rspAlu = rspAlu - 8;
                                                if (rspAlu - 4 > 0) {
                                                    doisAlu = true;
                                                    quatroAlu = true;
                                                } else if (rspAlu - 4 == 0) {
                                                    quatroAlu = true;
                                                } else if (rspAlu - 4 < 0) {
                                                    doisAlu = true;
                                                }
                                            } else if (rspAlu - 8 == 0) {
                                                oitoAlu = true;
                                            } else {
                                                if (rspAlu - 4 > 0) {
                                                    doisAlu = true;
                                                    quatroAlu = true;
                                                } else if (rspAlu - 4 == 0) {
                                                    quatroAlu = true;
                                                } else if (rspAlu - 4 < 0) {
                                                    doisAlu = true;
                                                }
                                            }
                                        }
                                    }

                                }

                            } else if (rspAlu == rspGab) {
                                notaQst = 6;
                            } else {
                                notaQst = 0;
                            }

                            boolean zerador = false;

                            System.out.println(um + "-" + dois + "-" + quatro + "-" + oito + "-" + dezesseis);
                            System.out.println(umAlu + "-" + doisAlu + "-" + quatroAlu + "-" + oitoAlu + "-" + dezesseisAlu);
                          
                            if (qtdcertosqst == 0) {
                                if (umAlu && doisAlu && quatroAlu && oitoAlu && dezesseisAlu) {
                                    zerador = true;
                                } else {
                                    notaQst = 6;
                                }
                            } else {
                                //System.out.println(notaQst);
                                if (um) {
                                    if (umAlu) {
                                        notaQst += (6 / qtdcertosqst);
                                    }
                                } else {
                                    if (umAlu) {
                                        zerador = true;
                                    }
                                }
                                //System.out.println(notaQst);
                                if (dois) {
                                    if (doisAlu) {
                                        notaQst += (6 / qtdcertosqst);
                                    }
                                } else {
                                    if (doisAlu) {
                                        zerador = true;
                                    }
                                }
                                //System.out.println(notaQst);
                                if (quatro) {
                                    if (quatroAlu) {
                                        notaQst += (6 / qtdcertosqst);
                                    }
                                } else {
                                    if (quatroAlu) {
                                        zerador = true;
                                    }
                                }
                                //System.out.println(notaQst);
                                if (oito) {
                                    if (oitoAlu) {
                                        notaQst += (6 / qtdcertosqst);
                                    }
                                } else {
                                    if (oitoAlu) {
                                        zerador = true;
                                    }
                                }
                                //System.out.println(notaQst);
                                if (dezesseis) {
                                    if (dezesseisAlu) {
                                        notaQst += (6 / qtdcertosqst);
                                    }
                                } else {
                                    if (dezesseisAlu) {
                                        zerador = true;
                                    }
                                }
                                //System.out.println(notaQst);
                            }

                            if (zerador) {
                                notaQst = 0;
                            }
                            
                            System.out.println("-->" + notaQst);

                            //------ ver nas respostas quantas acertou -------
                            //================================================= 
                            //------ atribuir nota correspondente a materia -------
                            
                            if (matGab == 1) {
                                notaCG += notaQst;
                            } else if (matGab == 2) {
                                notaLP += notaQst;
                            } else if (matGab == 3) {
                                notaLI += notaQst;
                            } else if (matGab == linEst) {
                                notaLE += notaQst;
                            } else if (matGab == esp1) {
                                notaEsp1 += notaQst;
                            } else if (matGab == esp2) {
                                notaEsp2 += notaQst;
                            }

                            //------ atribuir nota correspondente a materia -------
                        }
                    }

                }
            }
        }

        //--------------------------------- C O N T A ---------------------------------------
        lbCG.setText(String.valueOf(notaCG));
        lbPort.setText(String.valueOf(notaLP));
        lbLit.setText(String.valueOf(notaLI));
        lbLinEst.setText(String.valueOf(notaLE));
        lbEsp1.setText(String.valueOf(notaEsp1));
        lbEsp2.setText(String.valueOf(notaEsp2));
        lbTot.setText(String.valueOf(notaCG + notaEsp1 + notaEsp2 + notaLE + notaLI + notaLP));

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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geradores;

import Main.Controle;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import myTools.Ferramentas;

/**
 *
 * @author radames
 */
public class GerarProva1 {

    public GerarProva1() {
        gerarClasseGUI();
    }

    Controle controle = new Controle();

    private void gerarClasseGUI() {
        Ferramentas ferramentas = new Ferramentas();

        List<String> arquivoBase = ferramentas.abrirArquivo("src/Main/Respostas.txt");

        List<String> codigoGerado = new ArrayList<>();

        //fazer a classe de controle de lista
        codigoGerado.clear();
        codigoGerado.add(
                "package Main;\n"
                + "\n"
                + "import java.awt.BorderLayout;\n"
                + "import java.awt.Color;\n"
                + "import java.awt.Component;\n"
                + "import java.awt.Container;\n"
                + "import java.awt.GridLayout;\n"
                + "import java.awt.event.ActionEvent;\n"
                + "import javax.swing.JOptionPane;\n"
                + "import java.awt.event.ActionListener;\n"
                + "import javax.swing.JButton;\n"
                + "import javax.swing.JDialog;\n"
                + "import javax.swing.JLabel;\n"
                + "import javax.swing.JPanel;\n"
                + "import javax.swing.JTextField;\n"
                + "import myTools.Ferramentas;\n"
                + "import java.io.File;\n"
                + "import javax.swing.WindowConstants;\n"
                + "import java.util.List;\n"
                + "import tools.CentroDoMonitorMaior;\n\n");

        codigoGerado.add("public class Prova1 extends JDialog{\n"
                + " \n\n");

        codigoGerado.add("JButton btProva2 = new JButton(\"Prova 2\");\n");
        codigoGerado.add("JLabel lbTitulo = new JLabel(\"CONHECIMENTOS GERAIS\");\n");

        for (int i = 1; i <= 40; i++) {
            codigoGerado.add("JLabel lb" + i + " = new JLabel(\"Questão " + i + "\");");
        }

        for (int i = 1; i <= 40; i++) {
            codigoGerado.add("JTextField tf" + i + " = new JTextField(2);");
        }

        for (int i = 1; i <= 40; i++) {
            codigoGerado.add("double r" + i + ";");
        }

        codigoGerado.add("\n"
                + "    JPanel pnPrincipal = new JPanel(new GridLayout(1, 3));\n"
                + "    JPanel pnLeste = new JPanel(new GridLayout(20, 2));\n"
                + "    JPanel pnOeste = new JPanel(new GridLayout(20, 2));\n"
                + "    JPanel pnCentro = new JPanel(new GridLayout(20, 2));\n"
                + "    JPanel pnNorte = new JPanel(new BorderLayout());\n"
                + "    JPanel pnSul = new JPanel(new BorderLayout());\n\n");

        codigoGerado.add("Controle controle = new Controle();\n"
                + "Ferramentas fer = new Ferramentas();\n\n");

        codigoGerado.add("public Prova1() {\n"
                + "Resposta c = new Resposta();\n"
                + "List<String> listaAuxiliar = fer.abrirArquivo(new File(\"\").getAbsolutePath()+ \"/src/Main/Respostas.txt\");\n"
                + "        if (listaAuxiliar != null) {\n"
                + "            for (int i = 0; i < listaAuxiliar.size(); i++) {\n"
                + "                String aux[] = listaAuxiliar.get(i).split(\";\");\n"
                + "                c = new Resposta(Integer.valueOf(aux[0]), Integer.valueOf(aux[1]), Integer.valueOf(aux[2]));\n"
                + "            }\n"
                + "        }"
                + "        setTitle(\"Alternativas\");\n"
                + "        setSize(800, 600);//tamanho da janela\n"
                + "        setModal(true);\n"
                + "        setLayout(new BorderLayout());//informa qual gerenciador de layout será usado\n"
                + "        setBackground(Color.CYAN);//cor do fundo da janela\n"
                + "        Container cp = getContentPane();//container principal, para adicionar nele os outros componentes\n\n");

        codigoGerado.add("cp.add(pnPrincipal, BorderLayout.CENTER);\n"
                + "        cp.add(pnSul, BorderLayout.SOUTH);\n"
                + "        cp.add(pnNorte, BorderLayout.NORTH);\n"
                + "\n"
                + "        pnNorte.add(lbTitulo, BorderLayout.CENTER);"
                + "        pnPrincipal.add(pnOeste);\n"
                + "        pnPrincipal.add(pnCentro);\n"
                + "        pnPrincipal.add(pnLeste);\n"
                + "        \n"
                + "        pnSul.add(btProva2);\n\n");

        for (int i = 1; i <= 20; i++) {
            codigoGerado.add("pnOeste.add(lb" + i + ");\n"
                    + "pnOeste.add(tf" + i + ");\n");
        }

        for (int i = 21; i <= 40; i++) {
            codigoGerado.add("pnLeste.add(lb" + i + ");\n"
                    + "pnLeste.add(tf" + i + ");\n");
        }

        //------------------------REMOVER-------------------------------------------
        Ferramentas fer = new Ferramentas();
        List<String> c = fer.abrirArquivo(new File("").getAbsolutePath() + "/src/Main/Respostas.txt");
        System.out.println(c.size());

        
            for (int j = 0; j < c.size(); j++) {
                String aux[] = c.get(j).split(";");
                codigoGerado.add("tf" + (j+1) + ".setText(\"" + aux[2] + "\");");
            }
        
        //------------------------REMOVER-------------------------------------------

        codigoGerado.add("// Botões\n"
                + "            btProva2.addActionListener(new ActionListener() {\n"
                + "            @Override\n"
                + "            public void actionPerformed(ActionEvent ae) {\n"
                + "try{\n");

        for (int i = 1; i <= 40; i++) {
            codigoGerado.add("     "
                    + "            Resposta resposta" + i + " = new Resposta();\n"
                    + "            resposta" + i + ".setProva(1);\n"
                    + "            resposta" + i + ".setQuestao(" + i + ");\n"
                    + "            resposta" + i + ".setResposta(Integer.valueOf(tf" + i + ".getText()));\n"
                    + "            controle.inserir(resposta" + i + ");");
        }

        codigoGerado.add("\n"
                + "           } catch (Exception e) {\n"
                + "                   JOptionPane.showMessageDialog(cp, \"Algum valor está incorreto\");\n"
                + "                }\n"
                + "           try{\n"
                + "                List<String> a = controle.listar();\n"
                + "                fer.salvarArquivo(new File(\"\").getAbsolutePath() + \"/src/Main/Respostas.txt\", a);\n"
                + "                } catch (Exception e) {\n"
                + "                    System.out.println(\"DEU RUIM\");\n"
                + "                }"
                + "            }\n"
                + "        });\n\n");

//---------------------------------------------------
        codigoGerado.add("setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //antes de sair do sistema, grava os dados da lista em disco\n"
                + "        CentroDoMonitorMaior centroDoMonitorMaior = new CentroDoMonitorMaior();\n"
                + "        setLocation(centroDoMonitorMaior.getCentroMonitorMaior(this));\n"
                + "        setVisible(true);//faz a janela ficar visível\n"
                + "\n"
                + "    } //fim do construtor \n"
                + "\n"
                + "}//fim");

        String cc = "C:/Users/lucas/Documents/NetBeansProjects/ProjetoGabaritoUEM/src/Main/";
        System.out.println("Vai criar a classe nesse caminho=> " + cc);
        ferramentas.salvarArquivo(cc + "Prova1.java", codigoGerado);
    }
}

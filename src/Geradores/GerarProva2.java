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
public class GerarProva2 {

    public GerarProva2() {
        gerarClasseGUI();
    }

    Controle controle = new Controle();

    String linguaEstrangeira;
    String esp1;
    String esp2;
    
    int linEst;
    int especifica1;
    int especifica2;

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

        codigoGerado.add("public class Prova2 extends JDialog{\n"
                + " \n\n");
        
        int contadorVazio=0;
        for (int i = 0; i < 30; i++) {
            codigoGerado.add("JLabel lbVazio"+i+" = new JLabel(\"\");");
        }

        codigoGerado.add("JButton btCalcular = new JButton(\"Calcular\");");
        
        codigoGerado.add("JLabel lbLP = new JLabel(\"Lingua Portuguesa\");");
        codigoGerado.add("JLabel lbLiteratura = new JLabel(\"Literatura\");");
        //------------------------ACESSO AO TXT-------------------------------------------
        Ferramentas fer = new Ferramentas();
        List<String> c = fer.abrirArquivo(new File("").getAbsolutePath() + "/src/Main/Especificas.txt");
        System.out.println(c.size());

        for (int j = 0; j < c.size(); j++) {
            String aux[] = c.get(j).split(";");
            codigoGerado.add("JLabel lb" + aux[0] + " = new JLabel(\"" + aux[0] + "\");");
            codigoGerado.add("JLabel lb" + aux[1] + " = new JLabel(\"" + aux[1] + "\");");
            codigoGerado.add("JLabel lb" + aux[2] + " = new JLabel(\"" + aux[2] + "\");");
            linguaEstrangeira = aux[0];
            esp1 = aux[1];
            esp2 = aux[2];
        }

        //------------------------ACESSO AO TXT-------------------------------------------
        codigoGerado.add("\n");

        for (int i = 1; i <= 50; i++) {
            codigoGerado.add("JLabel lb" + i + " = new JLabel(\"Questão " + i + "\");");
        }

        for (int i = 1; i <= 50; i++) {
            codigoGerado.add("JTextField tf" + i + " = new JTextField(2);");
        }

        for (int i = 1; i <= 50; i++) {
            codigoGerado.add("double r" + i + ";");
        }

        codigoGerado.add("\n"
                + "    JPanel pnPrincipal = new JPanel(new GridLayout(1, 3));\n"
                + "    JPanel pnLeste = new JPanel(new GridLayout(30, 2));\n"
                + "    JPanel pnOeste = new JPanel(new GridLayout(30, 2));\n"
                + "    JPanel pnCentro = new JPanel(new GridLayout(30, 2));\n"
                + "    JPanel pnNorte = new JPanel();\n"
                + "    JPanel pnSul = new JPanel(new BorderLayout());\n\n");

        codigoGerado.add("Controle controle = new Controle();\n"
                + "Ferramentas fer = new Ferramentas();\n\n");

        codigoGerado.add("public Prova2() {\n"
                + "Resposta c = new Resposta();\n"
                + "List<String> listaAuxiliar = fer.abrirArquivo(new File(\"\").getAbsolutePath()+ \"/src/Main/Respostas.txt\");\n"
                + "        if (listaAuxiliar != null) {\n"
                + "            for (int i = 0; i < listaAuxiliar.size(); i++) {\n"
                + "                String aux[] = listaAuxiliar.get(i).split(\";\");\n"
                + "                c = new Resposta(Integer.valueOf(aux[0]), Integer.valueOf(aux[1]), Integer.valueOf(aux[2]));\n"
                + "                controle.inserir(c);\n"
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
                + "\n"
                + "        pnPrincipal.add(pnOeste);\n"
                + "        pnPrincipal.add(pnCentro);\n"
                + "        pnPrincipal.add(pnLeste);\n"
                + "        \n"
                + "        pnSul.add(btCalcular);\n\n");

        
        codigoGerado.add("pnOeste.add(lbLP);\n");
        codigoGerado.add("pnOeste.add(lbVazio"+contadorVazio+");\n");
        contadorVazio++;

        for (int i = 1; i <= 10; i++) {
            codigoGerado.add("pnOeste.add(lb" + i + ");\n"
                    + "pnOeste.add(tf" + i + ");\n");
        }

        codigoGerado.add("pnOeste.add(lbVazio"+contadorVazio+");\n");
        contadorVazio++;
        codigoGerado.add("pnOeste.add(lbVazio"+contadorVazio+");\n");
        contadorVazio++;
        codigoGerado.add("pnOeste.add(lbLiteratura);\n");
        codigoGerado.add("pnOeste.add(lbVazio"+contadorVazio+");\n");
        contadorVazio++;

        for (int i = 11; i <= 15; i++) {
            codigoGerado.add("pnOeste.add(lb" + i + ");\n"
                    + "pnOeste.add(tf" + i + ");\n");
        }

        codigoGerado.add("pnOeste.add(lbVazio"+contadorVazio+");\n");
        contadorVazio++;
        codigoGerado.add("pnOeste.add(lbVazio"+contadorVazio+");\n");
        contadorVazio++;
        codigoGerado.add("pnOeste.add(lb" + linguaEstrangeira + ");\n");
        codigoGerado.add("pnOeste.add(lbVazio"+contadorVazio+");\n");
        contadorVazio++;

        for (int i = 16; i <= 20; i++) {
            codigoGerado.add("pnOeste.add(lb" + i + ");\n"
                    + "pnOeste.add(tf" + i + ");\n");
        }

        codigoGerado.add("pnOeste.add(lbVazio"+contadorVazio+");\n");
        contadorVazio++;
        codigoGerado.add("pnOeste.add(lbVazio"+contadorVazio+");\n");
        contadorVazio++;
        codigoGerado.add("pnOeste.add(lb" + esp1 + ");\n");
        codigoGerado.add("pnOeste.add(lbVazio"+contadorVazio+");\n");
        contadorVazio++;

        for (int i = 21; i <= 23; i++) {
            codigoGerado.add("pnOeste.add(lb" + i + ");\n"
                    + "pnOeste.add(tf" + i + ");\n");
        }
        
        for (int i = 24; i <= 35; i++) {
            codigoGerado.add("pnLeste.add(lb" + i + ");\n"
                    + "pnLeste.add(tf" + i + ");\n");
        }

        codigoGerado.add("pnLeste.add(lbVazio"+contadorVazio+");\n");
        contadorVazio++;
        codigoGerado.add("pnLeste.add(lbVazio"+contadorVazio+");\n");
        contadorVazio++;
        codigoGerado.add("pnLeste.add(lb" + esp2 + ");\n");
        codigoGerado.add("pnLeste.add(lbVazio"+contadorVazio+");\n");
        contadorVazio++;

        for (int i = 36; i <= 50; i++) {
            codigoGerado.add("pnLeste.add(lb" + i + ");\n"
                    + "pnLeste.add(tf" + i + ");\n");
        }
        

        codigoGerado.add("// Botões\n"
                + "            btCalcular.addActionListener(new ActionListener() {\n"
                + "            @Override\n"
                + "            public void actionPerformed(ActionEvent ae) {\n"
                + "try{\n");

        for (int i = 1; i <= 10; i++) {
            codigoGerado.add("     "
                    + "            Resposta resposta" + i + " = new Resposta();\n"
                    + "            resposta" + i + ".setMateria(2);\n"
                    + "            resposta" + i + ".setQuestao(" + i + ");\n"
                    + "            resposta" + i + ".setResposta(Integer.valueOf(tf" + i + ".getText()));\n"
                    + "            controle.inserir(resposta" + i + ");");
        }

        for (int i = 11; i <= 15; i++) {
            codigoGerado.add("     "
                    + "            Resposta resposta" + i + " = new Resposta();\n"
                    + "            resposta" + i + ".setMateria(3);\n"
                    + "            resposta" + i + ".setQuestao(" + i + ");\n"
                    + "            resposta" + i + ".setResposta(Integer.valueOf(tf" + i + ".getText()));\n"
                    + "            controle.inserir(resposta" + i + ");");
        }

        for (int i = 16; i <= 20; i++) {    
            switch (linguaEstrangeira) {
                case "Espanhol":
                    linEst = 4;
                case "Frances":
                    linEst = 5;
                case "Ingles":
                    linEst = 6;
            }
            codigoGerado.add("     "
                    + "            Resposta resposta" + i + " = new Resposta();\n"
                    + "            resposta" + i + ".setMateria("+ linEst +");\n"
                    + "            resposta" + i + ".setQuestao(" + i + ");\n"
                    + "            resposta" + i + ".setResposta(Integer.valueOf(tf" + i + ".getText()));\n"
                    + "            controle.inserir(resposta" + i + ");");
        }
        
        for (int i = 21; i <= 35; i++) {    
            switch (esp1) {
                case "Arte":
                    especifica1 = 7;
                case "Biologia":
                    especifica1 = 8;
                case "EdFisica":
                    especifica1 = 9;
                case "Filosofia":
                    especifica1 = 10;
                case "Fisica":
                    especifica1 = 11;
                case "Geografia":
                    especifica1 = 12;
                case "Historia":
                    especifica1 = 13;
                case "Matematica":
                    especifica1 = 14;
            }
            codigoGerado.add("     "
                    + "            Resposta resposta" + i + " = new Resposta();\n"
                    + "            resposta" + i + ".setMateria("+ especifica1 +");\n"
                    + "            resposta" + i + ".setQuestao(" + i + ");\n"
                    + "            resposta" + i + ".setResposta(Integer.valueOf(tf" + i + ".getText()));\n"
                    + "            controle.inserir(resposta" + i + ");");
        }
        
        for (int i = 36; i <= 50; i++) {    
            switch (esp2) {
                case "Historia":
                    especifica2 = 13;
                case "Matematica":
                    especifica2 = 14;
                case "Quimica":
                    especifica2 = 15;
                case "Sociologia":
                    especifica2 = 16;
            }
            codigoGerado.add("     "
                    + "            Resposta resposta" + i + " = new Resposta();\n"
                    + "            resposta" + i + ".setMateria("+ especifica2 +");\n"
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

        String cc = new File("").getAbsolutePath() + "/src/Main/";
        System.out.println("Vai criar a classe nesse caminho=> " + cc);
        ferramentas.salvarArquivo(cc + "Prova2.java", codigoGerado);
    }
}

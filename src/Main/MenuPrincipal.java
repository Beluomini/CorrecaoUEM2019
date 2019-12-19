package Main;

import Geradores.GerarProva1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import myTools.Ferramentas;
import tools.CentroDoMonitorMaior;

public class MenuPrincipal extends JFrame {

    Container cp;
    JPanel pnNorte = new JPanel();
    JPanel pnCentro = new JPanel();
    JPanel pnSul = new JPanel();
    JLabel lbTitulo = new JLabel("Correção do gabarito provisório - UEM");

    Font fonte = new Font("Monotype Corsiva", Font.BOLD, 30);

    JLabel labelComImagemDeTamanhoDiferente = new JLabel();
    JLabel lbEspecifica1 = new JLabel("Especifica 1: ");
    JLabel lbEspecifica2 = new JLabel("Especifica 2: ");

    JButton btAvancar = new JButton("Avançar");
    JButton btOk1 = new JButton("Ok");
    JButton btOk2 = new JButton("Ok");
    JButton btCancelar1 = new JButton("Cancelar");
    JButton btCancelar2 = new JButton("Cancelar");

    JComboBox cbEspecifica1 = new JComboBox();
    JComboBox cbEspecifica2 = new JComboBox();

    Point p;

    Ferramentas fer = new Ferramentas();
    Controle controle = new Controle();

    public MenuPrincipal(Dimension dimensao) {

        List<String> listaAuxiliar = fer.abrirArquivo(new File("").getAbsolutePath()+ "/src/Main/Respostas.txt");
        if (listaAuxiliar != null) {
            for (int i = 0; i < listaAuxiliar.size(); i++) {
                String aux[] = listaAuxiliar.get(i).split(";");
                Resposta c = new Resposta(Integer.valueOf(aux[0]), Integer.valueOf(aux[1]), Integer.valueOf(aux[2]));
                controle.inserir(c);
            }
        }

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(dimensao);
        setTitle(lbTitulo.getText());

        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        pnNorte.add(lbTitulo);
        lbTitulo.setFont(fonte);
        pnNorte.setBackground(Color.green);

        String esp1;
        String esp2;

        List especificas1 = new ArrayList();

        List especificas2 = new ArrayList();

        especificas1.add("Arte ");
        especificas1.add("Biologia");
        especificas1.add("EdFisica");
        especificas1.add("Filosofia");
        especificas1.add("Fisica");
        especificas1.add("Geografia");
        especificas1.add("Historia");
        especificas1.add("Matematica");

        especificas2.add("Historia");
        especificas2.add("Matematica");
        especificas2.add("Quimica");
        especificas2.add("Sociologia");

        for (Object e : especificas1) {
            cbEspecifica1.addItem(e.toString());
        }

        pnSul.add(lbEspecifica1);
        pnSul.add(cbEspecifica1);
        pnSul.add(btOk1);
        pnSul.add(btCancelar1);
        pnSul.add(lbEspecifica2);
        pnSul.add(cbEspecifica2);
        pnSul.add(btOk2);
        pnSul.add(btCancelar2);
        pnSul.add(btAvancar);

        btAvancar.setBackground(Color.GREEN);
        btOk1.setBackground(Color.GREEN);
        btOk2.setBackground(Color.GREEN);
        btCancelar1.setBackground(Color.RED);
        btCancelar2.setBackground(Color.RED);
        btCancelar1.setForeground(Color.WHITE);
        btCancelar2.setForeground(Color.WHITE);

        btOk2.setVisible(false);
        cbEspecifica2.setEnabled(false);
        btCancelar1.setVisible(false);
        btCancelar2.setVisible(false);
        btAvancar.setVisible(false);

        btOk1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btOk1.setVisible(false);
                btCancelar1.setVisible(true);
                btOk2.setVisible(true);
                cbEspecifica1.setEnabled(false);
                cbEspecifica2.setEnabled(true);

                for (Object a : especificas2) {
                    if (a.toString().equals(cbEspecifica1.getSelectedItem().toString())) {

                    } else {
                        cbEspecifica2.addItem(a.toString());
                    }
                }

            }
        });

        btOk2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btCancelar2.setVisible(true);
                btOk2.setVisible(false);
                cbEspecifica2.setEnabled(false);
                btAvancar.setVisible(true);

            }
        });

        btCancelar1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                btCancelar2.setVisible(false);
                btCancelar1.setVisible(false);
                btOk2.setVisible(false);
                cbEspecifica2.setEnabled(false);
                btAvancar.setVisible(false);
                cbEspecifica1.setEnabled(true);
                btOk1.setVisible(true);
                cbEspecifica2.removeAllItems();

            }
        });
        btCancelar2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btCancelar2.setVisible(false);
                btOk2.setVisible(true);
                cbEspecifica2.setEnabled(true);
                btAvancar.setVisible(false);

            }
        });

        btAvancar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String esp1 = cbEspecifica1.getSelectedItem().toString();
                String esp2 = cbEspecifica2.getSelectedItem().toString();

                GerarProva1 gerarQuestionario1 = new GerarProva1();
                Prova1 prova1 = new Prova1();
            }
        });

        //para ajustar o tamanho de uma imagem
        try {
            ImageIcon icone = new ImageIcon(getClass().getResource("/fotos/uem.jpg"));
            Image imagemAux;
            imagemAux = icone.getImage();
            icone.setImage(imagemAux.getScaledInstance(674, 308, Image.SCALE_FAST));

            labelComImagemDeTamanhoDiferente = new JLabel();
            labelComImagemDeTamanhoDiferente.setIcon(icone);
        } catch (Exception e) {
            System.out.println("erro ao carregar a imagem");
        }

        pnCentro.add(labelComImagemDeTamanhoDiferente);
        pnCentro.setBackground(Color.BLACK);

        cp.add(pnNorte, BorderLayout.NORTH);
        cp.add(pnCentro, BorderLayout.CENTER);
        cp.add(pnSul, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Sai do sistema  
                System.exit(0);
            }
        });

        pack();
        p = new CentroDoMonitorMaior().getCentroMonitorMaior(this);
        setLocation(p);
        setVisible(true);
    }
}

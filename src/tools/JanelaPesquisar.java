package tools;



// @author Radames
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class JanelaPesquisar extends JDialog {

    private String valorRetornado = "";
    private List<String> lista;
    private int x=0;
    private int y=0;

    public JanelaPesquisar(List<String> lista, int x,int y) {//esse construtor é importante para receber dados 
        this.lista = lista;
        this.x = x;
        this.y = y;
    }

    public String getValorRetornado() {
        inicialize();

        setVisible(true);
        return valorRetornado;
    }

    public void finalizeJanela() {
        dispose();
    }

    public void inicialize() {

        setTitle("Pesquisar");
        setSize(350, 400);
        setModal(true);
        Container containerLista = new JPanel();
        Container cp;
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        // populate list
        final FilteredJList list = new FilteredJList(containerLista);
        for (int i = 0; i < lista.size(); i++) {
            list.addItem(lista.get(i));
        }
        containerLista.setLayout(new GridLayout(1, 1));
        containerLista.add(list);
        // add to gui
        JPanel painelDireita = new JPanel();
        painelDireita.setLayout(new GridLayout(3, 1));

        painelDireita.add(new JLabel());
        JScrollPane pane = new JScrollPane(containerLista, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        JPanel painelCentro = new JPanel();
        painelCentro.setLayout(new BorderLayout());
        painelCentro.add(list.getFilterField(), BorderLayout.NORTH);
        painelCentro.add(pane, BorderLayout.CENTER);
        cp.add(painelCentro, BorderLayout.CENTER);
        cp.add(painelDireita, BorderLayout.EAST);
        cp.add(new JLabel("<Clic duplo = seleciona>"), BorderLayout.SOUTH);
       
        //setLocationRelativeTo(null);
        setLocation(x- getWidth() / 2, y+50);
        
        list.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { //clic duplo
                    valorRetornado = (String) list.getSelectedValue();
                    dispose();
                }
            }
        });
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent we) {
            }

            @Override
            public void windowClosing(WindowEvent we) {
            }

            @Override
            public void windowClosed(WindowEvent we) {
                valorRetornado = null;
                dispose();
            }

            @Override
            public void windowIconified(WindowEvent we) {
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
            }

            @Override
            public void windowActivated(WindowEvent we) {
                
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
            }
        });

    }
}

package tools;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author radames
 */
public class MinhaJOptionPane extends JDialog {

    private boolean resp = false;
    private final Container cp;
    private final JPanel painelMsg = new JPanel();
    private final JPanel painelBotoes = new JPanel();
    private final JButton btnOk = new JButton("Ok");
    private final JButton btnCancel = new JButton("Cancelar");
    private final JLabel labelMsg = new JLabel();
    private String msg;
    private Point p;

    public MinhaJOptionPane(Point pos, String msg) {
        this.p = pos;
        this.msg = msg;
        cp = getContentPane();
    }

    public boolean getValorRetornado() {
        inicialize();
        setVisible(true);
        return resp;
    }

    public void finalizeJanela() {
        dispose();
    }

    public void inicialize() {
        setSize(350, 80);

        // setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setModal(true);
        cp.setLayout(new BorderLayout());
        cp.add(painelMsg, BorderLayout.CENTER);
        cp.add(painelBotoes, BorderLayout.SOUTH);

        painelMsg.setLayout(new FlowLayout(FlowLayout.CENTER));
        painelMsg.add(labelMsg);
        painelBotoes.add(btnOk);
        painelBotoes.add(btnCancel);

        labelMsg.setText(msg);
        pack();
        setLocation(p.x + JDialog.WIDTH / 2, p.y);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resp = true;
                dispose();
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resp = false;
                dispose();
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
                resp = false;
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


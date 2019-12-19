package tools;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author radames
 */
public class CentroDoMonitorMaior {

    public Point getCentroMonitorMaior(JFrame f) {
        Point posicaoDoFrameCentralizado;
        {
            GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice[] devices = e.getScreenDevices();
            int maior = 0;
            int qualOMaiorMonitor = 0;
            for (int i = 0; i < devices.length; i++) {

                if (devices[i].getDisplayMode().getWidth() > maior) {
                    maior = devices[i].getDisplayMode().getWidth();
                    qualOMaiorMonitor = i;
                }
            }

            GraphicsConfiguration[] configurations = devices[qualOMaiorMonitor].getConfigurations();
            Rectangle retanguloDoMaiorMonitor = configurations[0].getBounds();
            Dimension tamanhoDaTela = Toolkit.getDefaultToolkit().getScreenSize();
            int larguraDoFrame = f.getWidth();
            int alturaDoFrame = f.getHeight();
            //Point meio = new Point(retanguloDoMaiorMonitor.width / 2, retanguloDoMaiorMonitor.height / 2);
            posicaoDoFrameCentralizado = new Point(retanguloDoMaiorMonitor.x + (retanguloDoMaiorMonitor.width / 2) - (larguraDoFrame / 2),
                    retanguloDoMaiorMonitor.y + (retanguloDoMaiorMonitor.height / 2) - (alturaDoFrame / 2));
        }
        return posicaoDoFrameCentralizado;
        
        /*
        CentroDoMonitorMaior centroDoMonitorMaior = new CentroDoMonitorMaior();
        setLocation(centroDoMonitorMaior.getCentroMonitorMaior(this));
        */
    }
    public Point getCentroMonitorMaior(JDialog f) {
        Point posicaoDoFrameCentralizado;
        {
            GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice[] devices = e.getScreenDevices();
            int maior = 0;
            int qualOMaiorMonitor = 0;
            for (int i = 0; i < devices.length; i++) {

                if (devices[i].getDisplayMode().getWidth() > maior) {
                    maior = devices[i].getDisplayMode().getWidth();
                    qualOMaiorMonitor = i;
                }
            }

            GraphicsConfiguration[] configurations = devices[qualOMaiorMonitor].getConfigurations();
            Rectangle retanguloDoMaiorMonitor = configurations[0].getBounds();
            Dimension tamanhoDaTela = Toolkit.getDefaultToolkit().getScreenSize();
            int larguraDoFrame = f.getWidth();
            int alturaDoFrame = f.getHeight();
            //Point meio = new Point(retanguloDoMaiorMonitor.width / 2, retanguloDoMaiorMonitor.height / 2);
            posicaoDoFrameCentralizado = new Point(retanguloDoMaiorMonitor.x + (retanguloDoMaiorMonitor.width / 2) - (larguraDoFrame / 2),
                    retanguloDoMaiorMonitor.y + (retanguloDoMaiorMonitor.height / 2) - (alturaDoFrame / 2));
        }
        return posicaoDoFrameCentralizado;
        
        /*
        CentroDoMonitorMaior centroDoMonitorMaior = new CentroDoMonitorMaior();
        setLocation(centroDoMonitorMaior.getCentroMonitorMaior(this));
        */
    }
}

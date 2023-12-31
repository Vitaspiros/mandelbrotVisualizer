import java.awt.Container;


import javax.swing.JFrame;

public class App extends JFrame {
    static final int WIDTH = 800;
    static final int HEIGHT = 800;

    static Plotter plotter;

    Container cp;
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.pack();
        app.setSize(WIDTH,HEIGHT);
        app.addWindowListener(new WindowKiller());
        app.setVisible(true);
    }

    public App() {
        super("Mandelbrot set");
        this.pack();
        cp=getContentPane();

        plotter = new Plotter(WIDTH,HEIGHT);
        plotter.addMouseListener(new MouseHandler());
        cp.add(plotter);
    }
}

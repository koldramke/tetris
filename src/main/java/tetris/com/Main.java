package tetris.com;

import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class Main {

    public static void main( String[] args )
    {
        JFrame window = new JFrame("Eduardo's Tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        //Add GamePanel to the window
        GamePanel game_panel = new GamePanel();
        window.add(game_panel);
        window.pack(); // O tamanho do Game Panel torna-se no tamanho da janela

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}

package tetris.com;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{

        public static final int WIDTH = 1280;
        public static final int HEIGHT = 720;
        final int FPS = 60;
        Thread gameThread; // Run the game loop

        public GamePanel(){
            //Panel Settings
            this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
            this.setBackground(Color.black);
            this.setLayout(null);
        }

        public void startGame() {
            gameThread = new Thread(this);
            gameThread.start();
        }

        @Override
        public void run() {//Quando se inicia uma thread automaticamente chama este método

            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'run'");
        }

        private void update(){ //Update qualquer informação (números, scores..)

        }
        private void paintComponent (Graphics g){
            super.paintComponent(g);
        }
}

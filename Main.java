import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){
        int rowCount=21;
        int columnCount=19;
        int titleSize=32;
        int boardWidth=columnCount*titleSize;
        int boardHeight=rowCount*titleSize;


        JFrame frame = new JFrame("PAC MAN");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacMan pacmangame=new PacMan();
        frame.add(pacmangame);
        frame.pack();
        pacmangame.requestFocus();
        frame.setVisible(true);



    }
}
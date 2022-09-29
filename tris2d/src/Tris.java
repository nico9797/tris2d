import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Tris implements ActionListener {
    boolean flag=true;
    GridLayout grid=new GridLayout(3,3);
    BorderLayout border=new BorderLayout();
    JPanel panel=new JPanel();
    JPanel panel2=new JPanel();

    JButton[] button=new JButton[9];
    JButton restartButton=new JButton("Restart");
    Random r=new Random();

    Tris(){
        JFrame frame=new JFrame("TRIS");
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setSize(500,500);
        panel.setLayout(border);
        panel.add(panel2,BorderLayout.CENTER);
        panel2.setLayout(grid);
        panel.add(restartButton,BorderLayout.SOUTH);
        for(int i=0;i<9;i++){
            button[i]=new JButton();
            panel2.add(button[i]);
            button[i].addActionListener(this);
            button[i].setFont(new Font("Monospaced",Font.BOLD+Font.ITALIC,40));
        }
        restartButton.addActionListener(this);
        restartButton.setFont(new Font("Monospaced",Font.BOLD+Font.ITALIC,40));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==restartButton){
            restart();
            for(int i=0;i<9;i++) {
                button[i].setEnabled(true);
                button[i].setBackground(Color.white);
            }
        }

        if(flag) {
            for (int i = 0; i < 9; i++) {
                if (e.getSource() == button[i]&&button[i].getText()=="") {
                    button[i].setText("X");
                   win();
                    flag=false;
                }
            }
        }
        int n=0;
        while(!flag&&n<1000){
            n++;

            int j=r.nextInt(9); System.out.print(j);
            if(button[j].getText()==""){
                button[j].setText("O");

                win();
                flag=true;
            }
            }
        }

        boolean win(){
            if(button[0].getText()=="X"&&button[1].getText()=="X"&&button[2].getText()=="X"){
                button[0].setBackground(Color.green);
                button[1].setBackground(Color.green);
                button[2].setBackground(Color.green);
                for(int i=0;i<9;i++) button[i].setEnabled(false);
                return true;
            }
            if(button[3].getText()=="X"&&button[4].getText()=="X"&&button[5].getText()=="X"){
                button[3].setBackground(Color.green);
                button[4].setBackground(Color.green);
                button[5].setBackground(Color.green);
                for(int i=0;i<9;i++) button[i].setEnabled(false);
                return true;
            }
            if(button[6].getText()=="X"&&button[7].getText()=="X"&&button[8].getText()=="X"){
                button[6].setBackground(Color.green);
                button[7].setBackground(Color.green);
                button[8].setBackground(Color.green);
                for(int i=0;i<9;i++) button[i].setEnabled(false);
                return true;
            }
            if(button[0].getText()=="X"&&button[3].getText()=="X"&&button[6].getText()=="X"){
                button[0].setBackground(Color.green);
                button[3].setBackground(Color.green);
                button[6].setBackground(Color.green);
                for(int i=0;i<9;i++) button[i].setEnabled(false);
                return true;
            }
            if(button[1].getText()=="X"&&button[4].getText()=="X"&&button[7].getText()=="X"){
                button[1].setBackground(Color.green);
                button[4].setBackground(Color.green);
                button[7].setBackground(Color.green);
                for(int i=0;i<9;i++) button[i].setEnabled(false);
                return true;
            }
            if(button[2].getText()=="X"&&button[5].getText()=="X"&&button[8].getText()=="X"){
                button[2].setBackground(Color.green);
                button[5].setBackground(Color.green);
                button[8].setBackground(Color.green);
                for(int i=0;i<9;i++) button[i].setEnabled(false);
                return true;
            }
            if(button[0].getText()=="X"&&button[4].getText()=="X"&&button[8].getText()=="X"){
                button[0].setBackground(Color.green);
                button[4].setBackground(Color.green);
                button[8].setBackground(Color.green);
                for(int i=0;i<9;i++) button[i].setEnabled(false);
                return true;
            }
            if(button[2].getText()=="X"&&button[4].getText()=="X"&&button[6].getText()=="X"){
                button[2].setBackground(Color.green);
                button[4].setBackground(Color.green);
                button[6].setBackground(Color.green);
                for(int i=0;i<9;i++) button[i].setEnabled(false);
                return true;
            }


            if(button[0].getText()=="O"&&button[1].getText()=="O"&&button[2].getText()=="O"){
                button[0].setBackground(Color.RED);
                button[1].setBackground(Color.RED);
                button[2].setBackground(Color.RED);
                for(int i=0;i<9;i++) button[i].setEnabled(false);
                return true;
            }
            if(button[3].getText()=="O"&&button[4].getText()=="O"&&button[5].getText()=="O"){
                button[3].setBackground(Color.RED);
                button[4].setBackground(Color.RED);
                button[5].setBackground(Color.RED);
                for(int i=0;i<9;i++) button[i].setEnabled(false);
                return true;
            }
            if(button[6].getText()=="O"&&button[7].getText()=="O"&&button[8].getText()=="O"){
                button[6].setBackground(Color.RED);
                button[7].setBackground(Color.RED);
                button[8].setBackground(Color.RED);
                for(int i=0;i<9;i++) button[i].setEnabled(false);
                return true;
            }
            if(button[0].getText()=="O"&&button[3].getText()=="O"&&button[6].getText()=="O"){
                button[0].setBackground(Color.RED);
                button[3].setBackground(Color.RED);
                button[6].setBackground(Color.RED);
                for(int i=0;i<9;i++) button[i].setEnabled(false);
                return true;
            }
            if(button[1].getText()=="O"&&button[4].getText()=="O"&&button[7].getText()=="O"){
                button[1].setBackground(Color.RED);
                button[4].setBackground(Color.RED);
                button[7].setBackground(Color.RED);
                for(int i=0;i<9;i++) button[i].setEnabled(false);
                return true;
            }
            if(button[2].getText()=="O"&&button[5].getText()=="O"&&button[8].getText()=="O"){
                button[2].setBackground(Color.RED);
                button[5].setBackground(Color.RED);
                button[8].setBackground(Color.RED);
                for(int i=0;i<9;i++) button[i].setEnabled(false);
                return true;
            }
            if(button[0].getText()=="O"&&button[4].getText()=="O"&&button[8].getText()=="O"){
                button[0].setBackground(Color.RED);
                button[4].setBackground(Color.RED);
                button[8].setBackground(Color.RED);
                for(int i=0;i<9;i++) button[i].setEnabled(false);
                return true;
            }
            if(button[2].getText()=="O"&&button[4].getText()=="O"&&button[6].getText()=="O"){
                button[2].setBackground(Color.RED);
                button[4].setBackground(Color.RED);
                button[6].setBackground(Color.RED);
                for(int i=0;i<9;i++) button[i].setEnabled(false);
                return true;
            }
            return false;
    }
    void restart(){
        for(int i=0;i<9;i++){
            button[i].setText("");
        }
    }
    }


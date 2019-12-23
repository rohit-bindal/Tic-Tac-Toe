/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame ;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author kana
 */
class bwm extends WindowAdapter
{
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}
public class tictactoegame extends Frame implements ActionListener{
    Scanner sc=new Scanner(System.in);
      int player1[]=new int[9];
      int player2[]=new int[9];  
     int i;
    int turn=0;
    tictactoegame f;
    private Label tictactoe;
    private Button start;
    private Button b[]=new Button[9];
    private Panel p1;
    private Label l1,l2;
    String player1n,player2n;
    public tictactoegame()
            
    {   
        player1n=JOptionPane.showInputDialog(null,"Enter player1 name");
        
        player2n=JOptionPane.showInputDialog(null,"Enter player2 name");
      
        addWindowListener(new bwm());
    int i;
    for(i=0;i<9;i++)
    {
        player1[i]=-1;
        player2[i]=-1;
    }
    p1=new Panel();
    p1.setLayout(new GridLayout(1,3));
    Panel p2=new Panel();
    Panel p3=new Panel();
    start=new Button("Play Game");
    start.addActionListener(this);
    p3.add(start);
    add(p3,BorderLayout.SOUTH);
        setVisible(true);
        setSize(300,300);
        setBackground(Color.black);
        l1=new Label(player1n);
        l1.setForeground(Color.red);
        p1.add(l1);
        
      
            tictactoe=new Label("Tic Tac Toe");
        tictactoe.setBounds(20,20,150,50);
        tictactoe.setForeground(Color.blue);
                tictactoe.setBackground(Color.BLACK);
         p1.add(tictactoe);
        l2=new Label(player2n);
        l2.setForeground(Color.red);
        p1.add(l2);
    
       
       
        p2.setLayout(new GridLayout(3,3));
        for(i=0;i<9;i++)
        {
            b[i]=new Button();
            b[i].addActionListener(this);
            p2.add(b[i]);
           
        }
      
       
        
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
    }
public void actionPerformed(ActionEvent ae)
{ int i; if(ae.getSource()==start)
{   
     l1.setBackground(Color.YELLOW);
     
     
     
       
    }

    for(i=0;i<=8;i++)
{
    if(ae.getSource()==b[i])
    {   
   
        
     
        turn++;
        if(turn%2!=0)
        {
            b[i].setLabel("0");
            b[i].disable();
            try{player1[i]=Integer.parseInt(b[i].getActionCommand());}
            catch(Exception e){}
            l1.setBackground(Color.black);
            l2.setBackground(Color.yellow);
         if(p1wins()==true)
    {
        
        JOptionPane.showMessageDialog(null,player1n+" Won");
        System.exit(0);
        
    }}
        else 
        {
            b[i].setLabel("1");
            b[i].disable();
            try{player2[i]=Integer.parseInt(b[i].getActionCommand());}
            catch(Exception e){}
             if(p2wins()==true)
    {            
       
                JOptionPane.showMessageDialog(null,player2n+" Won");
                 System.exit(0);
             
    }
            
             
            l2.setBackground(Color.black);
            l1.setBackground(Color.yellow);
        }
        if(turn==9)
        {
            JOptionPane.showMessageDialog(null,"Match Draw");
            System.exit(0);
                
    }      }
}}
public boolean p1wins()
{  
        if(player1[0]==0&&player1[1]==0&&player1[2]==0)
        {
            return true;
        }
        else if(player1[3]==0&&player1[4]==0&&player1[5]==0)
        {
            return true;
        }
        else if(player1[6]==0&&player1[7]==0&&player1[8]==0)
        {
            return true;
        }
        else if(player1[0]==0&&player1[3]==0&&player1[6]==0)
        {
            return true;
        }
        else if(player1[1]==0&&player1[4]==0&&player1[7]==0)
        {
            return true;
        }
        else if(player1[2]==0&&player1[5]==0&&player1[8]==0)
        {
            return true;
        }
        else if(player1[0]==0&&player1[4]==0&&player1[8]==0)
        {
            return true;
        }
        else if(player1[2]==0&&player1[4]==0&&player1[6]==0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
 
}
public boolean p2wins()
{
    if(player2[0]==1&&player2[1]==1&&player2[2]==1)
        {
            return true;
        }
        else if(player2[3]==1&&player2[4]==1&&player2[5]==1)
        {
            return true;
        }
        else if(player2[6]==1&&player2[7]==1&&player2[8]==1)
        {
            return true;
        }
        else if(player2[0]==1&&player2[3]==1&&player2[6]==1)
        {
            return true;
        }
        else if(player2[1]==1&&player2[4]==1&&player2[7]==1)
        {
            return true;
        }
        else if(player2[2]==1&&player2[5]==1&&player2[8]==1)
        {
            return true;
        }
        else if(player2[0]==1&&player2[4]==1&&player2[8]==1)
        {
            return true;
        }
        else if(player2[2]==1&&player2[4]==1&&player2[6]==1)
        {
            return true;
        }
        else
        {
            return false;
        }
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          tictactoegame f=new tictactoegame();
        f.setTitle("Tic-Tac-Toe"); 
        
        // TODO code application logic here
    }
    
}

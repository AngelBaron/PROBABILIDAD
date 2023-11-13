/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probalidadyestadistica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author lucho
 */
public class INTERFAZ extends JFrame implements ActionListener{
    private JLabel titulo,txtX,txtx,txtn,txtp,txtparametro,txtR,txtN;
    private JTextField X,x,n,p,parametro,R,N;
    private JButton boton;
    
    
    public INTERFAZ(){
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.yellow);
        setSize(600,600);
        creacionDeElementos();
    }
    
    public void creacionDeElementos(){
        titulo = new JLabel("CALCULO DE PROBABILIDADES");
        titulo.setBounds(220,10,300,30);
        add(titulo);
        
        txtX = new JLabel("X:");
        txtX.setBounds(20,50,100,60);
        add(txtX);
        
        X = new JTextField();
        X.setBounds(30,65,100,30);
        add(X);
        
        txtx = new JLabel("x:");
        txtx.setBounds(20,100,100,60);
        add(txtx);
        
        x = new JTextField();
        x.setBounds(30,115,100,30);
        add(x);
        
        txtn = new JLabel("n:");
        txtn.setBounds(20,150,100,60);
        add(txtn);
        
        n = new JTextField();
        n.setBounds(40,165,100,30);
        add(n);
        
        txtp = new JLabel("p:");
        txtp.setBounds(20,200,100,60);
        add(txtp);
        
        p = new JTextField();
        p.setBounds(30,215,100,30);
        add(p);
        
        txtparametro = new JLabel("Parametro especial");
        txtparametro.setBounds(20,250,180,60);
        add(txtparametro);
        
        parametro = new JTextField();
        parametro.setBounds(150,265,100,30);
        add(parametro);
        
        txtR = new JLabel("R:");
        txtR.setBounds(20,300,100,60);
        add(txtR);
        
        R = new JTextField();
        R.setBounds(30,315,100,30);
        add(R);
        
        txtN = new JLabel("N:");
        txtN.setBounds(20,350,100,60);
        add(txtN);
        
        N = new JTextField();
        N.setBounds(30,365,100,30);
        add(N);
        
        boton = new JButton("Calcular");
        boton.setBounds(220,400,100,30);
        add(boton);
        boton.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        Calculo cal = new Calculo();
        JOptionPane.showMessageDialog(null, "Hipergeometrica es: "+ cal.hiper(Double.parseDouble(R.getText()), Double.parseDouble(x.getText()), Double.parseDouble(N.getText()), Double.parseDouble(n.getText()))+ "\n Pisson: "+ cal.pisson(Double.parseDouble(parametro.getText()), Double.parseDouble(x.getText())) +
                "\n Binomial:"+ cal.binomial(Double.parseDouble(n.getText()), Double.parseDouble(x.getText()), Double.parseDouble(p.getText())));
    }
    
    
    
}

package com.sokolovskyi.jasm.ide;

import javax.swing.*;
import java.awt.*;


class NoteLogo extends JFrame{
    NoteLogo(){
        super("JASM");

        initLogo();

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setVisible(false);
        dispose();
    }

    private void initLogo(){

        //TODO: trouble with icon, resizing
        //setIconImage(new ImageIcon("./src/asserts/logo64_64.png").getImage());

        JLabel logo = new JLabel();
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png")));
        logo.setHorizontalAlignment(JLabel.CENTER);

        JPanel logoPanel = new JPanel(new BorderLayout());
        logoPanel.add(logo);

        add(logoPanel);

        setResizable(false);
        setPreferredSize(new Dimension(270, 225));
        pack();
        setLocationRelativeTo(null);
        setBounds(IDEParams.CORD_X_MAIN_WIN, IDEParams.CORD_Y_MAIN_WIN, 700, 700);
        setVisible(true);
    }
}

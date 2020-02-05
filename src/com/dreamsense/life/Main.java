package com.dreamsense.life;

import javax.swing.JFrame;

public class Main extends JFrame {

  public Main() {

  }

  private void init() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(Settings.winWidth, Settings.winHeight);
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.init();
    main.setVisible(true);
  }
}

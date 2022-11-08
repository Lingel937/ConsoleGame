
/*

Author:   Valentin Lingelbach
Version:  WIP_0.1
Date:     21.10.2022

  This Script only runs the main Sequences of the Game. not a lot of code here (else you get bonked)

*/

class Main {
  public static void main(String[] args) {

    new Basic().createCharakter();
    Game.go();
    /*
    * Weapon Stick = new Weapon("Stick", 3, 100, 1, 50, 5);
    * Stick.print();
    * Stick.LevelUp();
    * Stick.print();
    */
  }
}
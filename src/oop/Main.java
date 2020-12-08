package oop;
import oop.Squirrel;

public class Main {
  
  public static void main(String[] args) {
    Squirrel squirrel1;
    Squirrel squirrel2;
    Squirrel squirrel3;
    Squirrel squirrel4;

    squirrel1 = new Squirrel("jo", "green", 1, 100, 2, "park 5 under tree");
    squirrel2 = new Squirrel("flow", "brown", 2, 150, 1, "park 3 beside tree");
    squirrel3 = new Squirrel("do", "black", 1, 134.5, 1.8, "park 1 at entrance");
    squirrel4 = new Squirrel("who", "red", 3, 200.7, 1.9, "park 2 near lamp");

    squirrel1.buryfood();
    squirrel3.buryfood();

    squirrel4.jump();
    squirrel2.makeNoise();

    squirrel1.predator("lion");
    squirrel4.wagTail();
  }

}

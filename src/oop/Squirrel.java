package oop;

public class Squirrel {
  // instance variables
  int age;
  double weight;
  double frontTeethLength;
  String color;
  String name;
  String foodStorageLocation;

  public Squirrel(String newName, String newColor, int newAge, double newWeight, double newFrontTeethLength, String newFoodStorageLocation){
    this.name = newName;
    this.color = newColor;
    this.age = newAge;
    this.weight = newWeight;
    this.frontTeethLength = newFrontTeethLength;
    this.foodStorageLocation = newFoodStorageLocation;
  }

  public void makeNoise(){
    System.out.println(this.name + " is squeaking.");
  }

  public void jump(){
    System.out.println(this.name + " jumped.");
  }

  public void buryfood(){
    System.out.println(this.name + " burried food at: " + this.foodStorageLocation);
  }

  public void wagTail() {
    System.out.println(this.name + " is wagging his tail.");
  }

  public void predator(String strPredator){
    System.out.println(this.name + " indentified the predator: " + strPredator);
  }

}
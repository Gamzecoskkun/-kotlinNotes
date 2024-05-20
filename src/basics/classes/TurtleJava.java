public class TurtleJava {


    int feetCount = 4;
    String feetColor = "Brown";
    int headCount = 1;
    String headColor = "Brown";
    String shelterColor = "Green";
    int tailCount = 1;
    String tailColor = "Brown";
    int age = 1;
    String name = "Tosbik";
    String sex = "Female";
    boolean isMarried = true;

    public TurtleJava() {

    }

    String makeASound() {
        return "hsgsghs";
    }

    void eatMeal() {

    }

    void walk() {

    }

    void swim() {

    }

    public TurtleJava(int mFeetCount) {
        feetCount = mFeetCount;

    }


    public TurtleJava(int mFeetCount, String name) {
        feetCount = mFeetCount;
        this.name=name;
    }


    public static void main(String[] args) {
        TurtleJava turtleJavaZero = new TurtleJava();
        TurtleJava turtleJavaOne = new TurtleJava(4);
        TurtleJava turtleJavaTwo = new TurtleJava(4,"Murtle");
    }
}
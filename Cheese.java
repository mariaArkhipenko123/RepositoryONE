package bsu.rfe.java.group6.lab1.ArhipenkoMaria.var1;

public class Cheese extends Food implements Nutritious {
    private boolean eaten = false;
    public Cheese() {
        super("Сыр", " ");
    }
    public void consume(){
        System.out.println(this + " съеден");
        eaten = true;
    }

    public int calculateCalories() {
        int resultCalories = 0;
        if (eaten == true) {
            resultCalories = 100;
        }
        return resultCalories;
    }
}

package bsu.rfe.java.group6.lab1.ArkhipenkoMaria.var1;

import java.util.Comparator;

public class FoodComparator implements Comparator<Food>  {

    public int compare(Food arg0, Food arg1) {
        // если 1-ый объект = null, то он всегда "больше", т.е. перемещается
        // в конец массива
        if (arg0==null) return 1;
        // если 2-ой объект = null, а 1-ый - нет (не сработала предыдущая
        // строчка), то 1-ый всегда меньше, т.е. перемешается в начало массива
        if (arg1==null) return -1;
        // если оба объекта не null, то результат сравнения определяется
        // сравнением их name
        return arg0.getParameter().compareTo(arg1.getParameter());
    }

    // Collections.sort(breakfast, new FoodComparator());

}

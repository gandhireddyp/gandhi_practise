package designpatters.java.decorator;

import java.util.Random;

public class Number implements INumber {

    @Override
    public void print() {
        System.out.println(new Random().nextInt());
    }

}

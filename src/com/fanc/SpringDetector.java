package com.fanc;

import java.lang.reflect.Constructor;
import java.util.Random;
import java.util.*;

/**
 * @Author : fanc
 * @Date : 2019/11/4 8:07 下午
 */

class Groundhog {
    private int number;
    public Groundhog(int n) {
        number = n;
    }

    @Override
    public String toString() {
        return "G#" + number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Groundhog && ((Groundhog)obj).number == number;
    }
}

class Prediction {
    private static Random rand = new Random(47);
    private boolean shadow = rand.nextDouble() > 0.5;

    @Override
    public String toString() {
        if (shadow) {
            return "Six more";
        }
        else {
            return "Spring";
        }
    }
}

public class SpringDetector {
    public static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception {
        Constructor<T> constructor = type.getConstructor(int.class);
        Map<Groundhog, Prediction> map = new HashMap<>();
        for (int i = 0; i < 5; i ++) {
            map.put(constructor.newInstance(i), new Prediction());
        }
        System.out.println("map" + map);
        Groundhog groundhog = new Groundhog(3);
        if (map.containsKey(groundhog)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) throws Exception{
        detectSpring(Groundhog.class);
    }
}

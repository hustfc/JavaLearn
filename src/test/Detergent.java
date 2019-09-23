package test;

import com.fanc.Cleanser;

/**
 * @Author : fanc
 * @Date : 2019-09-21 16:34
 */
public class Detergent extends Cleanser {
    @Override
    public void scrub() {
        append(" Detergent.scrub() ");
        super.scrub();
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.scrub();
        x.apply();
        System.out.println(x);
    }
}

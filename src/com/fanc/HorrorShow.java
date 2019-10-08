package com.fanc;



/**
 * @Author : fanc
 * @Date : 2019-09-25 10:54
 */

interface Moster {
    void menace();
}

/**
 * 接口继承
 */
interface DangerousMoster extends Moster {
    void destroy();
}

interface Lethal {
    void kill();
}

/**
 * 实现两个接口
 */
class DragonZilla implements DangerousMoster {
    @Override
    public void menace() {
        System.out.println("menace in dragon");
    }

    @Override
    public void destroy() {
        System.out.println("destroy in dragon");
    }
}


/**
 * 接口可以多重继承
 */
interface Vampire extends DangerousMoster, Lethal {
    void drinkBlood();
}

class veryBadVampire implements Vampire {
    @Override
    public void menace() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void kill() {
    }

    @Override
    public void drinkBlood() {
    }
}

/**
 * 接口向上转型
 */
public class HorrorShow {
    /**
     * 接口名可以作为参数类型
     *
     * @param b
     */
    static void u(Moster b) {
        b.menace();
    }

    static void v(DangerousMoster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
        System.out.println(l.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        // 这个类实现了两个接口
        DangerousMoster barney = new DragonZilla();
        // 向上转型调用
        u(barney);
        v(barney);

        Vampire vlad = new veryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
        // 如果是接口需要new成一个对象的时候，必须实现它
        Vampire vlad1 = new Vampire() {
            @Override
            public void drinkBlood() {

            }

            @Override
            public void destroy() {

            }

            @Override
            public void kill() {

            }

            @Override
            public void menace() {

            }
        };
    }
}

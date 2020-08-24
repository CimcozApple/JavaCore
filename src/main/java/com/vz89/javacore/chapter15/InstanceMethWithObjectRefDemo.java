package main.java.com.vz89.javacore.chapter15;

interface MyFunc2<T> {
    boolean func(T v1, T v2);
}

class HighTemp {
    private int hTemp;

    HighTemp(int ht) {
        hTemp = ht;
    }

    boolean sameTemp(HighTemp ht) {
        return hTemp == ht.hTemp;
    }

    boolean lessThanTemp(HighTemp ht) {
        return hTemp < ht.hTemp;
    }
}

public class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc2<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) if (f.func(vals[i], v)) ;
        return count;
    }

    public static void main(String[] args) {
        int count;

        HighTemp[] weekDayHighs = {new HighTemp(89), new HighTemp(82), new HighTemp(90), new HighTemp(89), new HighTemp(89), new HighTemp(91), new HighTemp(84), new HighTemp(83)};
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Дней, когда максимальная температура была 89: " + count);

        HighTemp[] weekDayHigh2 = {new HighTemp(32), new HighTemp(12), new HighTemp(24), new HighTemp(19), new HighTemp(18), new HighTemp(12), new HighTemp(-1), new HighTemp(13)};
        count = counter(weekDayHigh2,HighTemp::sameTemp, new HighTemp(12));
        System.out.println("Дней, когда максимальная температура была 12: " + count);

        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println("Дней, когда максимальная температура была меньше 89: " + count);

        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println("Дней, когда максимальная температура была меньше 19: " + count);
    }


}

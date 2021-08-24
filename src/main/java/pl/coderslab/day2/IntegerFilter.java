package pl.coderslab.day2;

public class IntegerFilter implements Filter<Integer> {

    @Override
    public boolean check(Integer integer) {
        return integer < 20;
    }
}

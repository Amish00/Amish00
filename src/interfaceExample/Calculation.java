package interfaceExample;

public class Calculation implements Num{
    @Override
    public int add(int x, int y) {
        return x+y;
    }
    @Override
    public  int diff(int x, int y){
        return x-y;
    }

}

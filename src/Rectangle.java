public class Rectangle implements Resizeable {
    double mod1,mod2;

    Rectangle(){

    }
    Rectangle(double mod1, double mod2){
        this.mod1 =mod1;
        this.mod2 = mod2;
    }

    public double getMod1() {
        return mod1;
    }

    public void setMod1(double mod1) {
        this.mod1 = mod1;
    }

    public double getMod2() {
        return mod2;
    }

    public void setMod2(double mod2) {
        this.mod2 = mod2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "mod1=" + mod1 +
                ", mod2=" + mod2 +
                '}';
    }
}

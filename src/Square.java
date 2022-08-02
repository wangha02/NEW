public class Square implements Resizeable {
    double mod;

    Square(){

    }
    Square(double mod){
        this.mod = mod;
    }

    public double getMod() {
        return mod;
    }

    public void setMod(double mod) {
        this.mod = mod;
    }

    @Override
    public String toString() {
        return "Square{" +
                "mod=" + mod +
                '}';
    }
}

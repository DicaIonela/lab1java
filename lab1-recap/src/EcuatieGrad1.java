public class EcuatieGrad1 {
    private int a;
    private int b;

    public EcuatieGrad1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "EcuatieGrad1:" +
                 a +"x+" + b +
                "=0\n";
    }
    public float rezolva()
    {
        return (float)-b/a;
    }
}

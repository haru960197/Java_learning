public class Wand {
    private String name;
    private double power;

    public String getName() { return this.name; }
    public double getPower() { return this.power; }

    public void setName(String name) { 
        if ( name == null || name.length() < 3) {
            throw new IllegalArgumentException
                ("名前が短すぎる。処理を中断。");
        }
        this.name = name;
    }
    public void setPower(double power) {
        if ( power < 0.5 || power > 100 ) {
            throw new IllegalArgumentException
                ("powerは0.5以上100以下に設定してください。処理を中断。");
        }
        this.power = power;
    }
}
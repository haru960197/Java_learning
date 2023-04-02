public class PoisonMatango extends Matango {
    int pp = 5;
    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Hero h) {
        super.attack(h);
        if (this.pp > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int damage = h.hp / 5;
            System.out.println(damage + "ポイントのダメージ！");
            h.hp -= damage;
            this.pp--;
        }
    }
}

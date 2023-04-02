public class Cleric2 {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

    public void selfAid() {
        this.mp -= 5;
        this.hp = this.MAX_HP;
    }
    public int pray(int praySec) {
        int bonus = new java.util.Random(3).nextInt();
        int oldMP = this.mp;
        int newMP = Math.min(this.MAX_MP, oldMP + praySec + bonus);
        this.mp = newMP;
        return newMP - oldMP;
    }
}

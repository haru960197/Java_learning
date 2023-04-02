public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

    public void selfAid() {
        System.out.println(name + "はセルフエイドを唱えた！");
        this.mp -= 5;
        System.out.println("MPが5減った！");
        this.hp = this.MAX_HP;
        System.out.println("HPが" + this.MAX_HP + "に回復した！");
    }

    public int pray(int prayTime) {
        System.out.println(name + "は" + prayTime + "秒祈った！");
        int recoveryMp = prayTime + new java.util.Random(3).nextInt();
        this.mp += recoveryMp;
        if (this.mp > this.MAX_MP) {
            // あふれたMP分を修正
            recoveryMp -= this.mp - this.MAX_MP;
            this.mp = this.MAX_MP;
        }
        System.out.println("MPが" + this.mp + "に回復した！");
        return recoveryMp;
    }
}
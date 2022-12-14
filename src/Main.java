public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(230);
        boss.setDamage(55);
        boss.setDefenceType("physical");
        System.out.println("health: " + boss.getHealth() + "\ndamage: " +
                boss.getDamage() + "\nDefenceType: " + boss.getDefenceType());
    }
}
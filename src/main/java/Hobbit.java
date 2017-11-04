public class Hobbit extends Character {
    public Hobbit(String n){
        super(n);
        this.hp = 3;
        this.power = 0;
    }

    public void kick(Character character){
        toCry();
    }

    private void toCry(){
        System.out.println("Hobbit " + this.name + " is crying");
    }
}

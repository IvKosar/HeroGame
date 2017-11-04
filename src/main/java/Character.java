public abstract class Character {
    protected String name;
    protected int hp;
    protected int power;
    protected boolean isAlive;

    public Character(String n){
        this.name = n;
        this.isAlive = true;
    }

    public String toString(){
        return this.getClass().getCanonicalName() + " " + this.name;
    }

    public String getName(){
        return this.name;
    }

    public int getPower(){
        return this.power;
    }

    public void decreasePower(int power){
        this.power -= power;
    }

    public int getHp(){
        return this.hp;
    }

    public void decreaseHp(int kickHp){
        this.hp -= kickHp;
        if (this.hp <= 0){
            setToDead();
        }
        else{
            System.out.println(this.getClass().getCanonicalName() + " "  +
                    this.name + " was damaged by " + Integer.toString(kickHp) + " hp");
        }
    }

    public void setToDead(){
        this.isAlive = false;
        System.out.println(this.getClass().getCanonicalName() + " " + this.name + " is DEAD!");
    }

    abstract void kick(Character c);
}

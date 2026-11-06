//Sophia Liao

public class Candy {
    private String name;
    private int sweetnessLevel;
    private boolean isPoisonous;

    public Candy(String name, int sweetnessLevel, boolean isPoisonous) {
        this.name = name;
        this.sweetnessLevel = sweetnessLevel;
        this.isPoisonous = isPoisonous;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSweetnessLevel(int sweetnessLevel) {
        this.sweetnessLevel = sweetnessLevel;
    }

    public void setIsPoisonous(boolean isPoisonous) {
        this.isPoisonous = isPoisonous;
    }

    public boolean equals(Candy other) {
        if (other == null) {
            return false;
        }
        return this.name.equals(other.name) &&
                this.sweetnessLevel == other.sweetnessLevel &&
                this.isPoisonous == other.isPoisonous;
    }
}
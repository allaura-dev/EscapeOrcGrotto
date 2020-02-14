
package armor.medium;
import java.util.Random;

public class Medium extends armor.Armor{

    protected Random randNum = new Random();
    private int armourPoints;
    private int agilityBuffer;
    private int staminaDebuff;
    
    public Medium() {}
    
//getters 
    public int GetArmorPoints() {
        return this.armourPoints;
    }
    
    public int GetAgilityBuffer() {
        return this.agilityBuffer;
    }

    public int GetStaminaDebuff(){
        return this.staminaDebuff;
    }
    
    //setters
    @Override
    public void SetArmorPoints(int armorPoints) {
        this.armourPoints = armorPoints;
    }

    @Override
    public void SetAgilityBuffer(int agilityBuffer) {
        this.agilityBuffer = agilityBuffer;
    }

    @Override
    public void SetStaminaDebuff(int staminaDebuff){
        this.staminaDebuff = staminaDebuff;
    }
} // class
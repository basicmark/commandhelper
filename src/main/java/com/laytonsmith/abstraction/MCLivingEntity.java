
package com.laytonsmith.abstraction;

import com.laytonsmith.abstraction.blocks.MCBlock;
import com.laytonsmith.abstraction.enums.MCProjectileType;
import com.laytonsmith.core.constructs.Target;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author layton
 */
public interface MCLivingEntity extends MCEntity {

	public void addEffect(int potionID, int strength, int seconds, boolean ambient, Target t);
	public boolean removeEffect(int potionID);
	public List<MCEffect> getEffects();
    public void damage(double amount);
    public void damage(double amount, MCEntity source);
	public boolean getCanPickupItems();
	public String getCustomName();
	public MCEntityEquipment getEquipment();
    public double getEyeHeight();
    public double getEyeHeight(boolean ignoreSneaking);
    public MCLocation getEyeLocation();
    public double getHealth();
    public MCPlayer getKiller();
    public double getLastDamage();
	public MCLivingEntity getTarget(Target t);
	public MCBlock getTargetBlock(HashSet<Short> transparent, int maxDistance, boolean castToByte);
	public MCBlock getTargetBlock(HashSet<Byte> transparent, int maxDistance);
    public List<MCBlock> getLastTwoTargetBlocks(HashSet<Byte> transparent, int maxDistance);
    public List<MCBlock> getLineOfSight(HashSet<Byte> transparent, int maxDistance);
    public double getMaxHealth();
    public int getMaximumAir();
    public int getMaximumNoDamageTicks();
    public int getNoDamageTicks();
    public int getRemainingAir();
	public boolean isCustomNameVisible();
    public MCProjectile launchProjectile(MCProjectileType projectile);
	public void resetMaxHealth();
	public void setCanPickupItems(boolean pickup);
	public void setCustomName(String name);
	public void setCustomNameVisible(boolean visible);
    public void setHealth(double health);
    public void setLastDamage(double damage);
	public void setMaxHealth(double health);
    public void setMaximumAir(int ticks);
    public void setMaximumNoDamageTicks(int ticks);
    public void setNoDamageTicks(int ticks);
    public void setRemainingAir(int ticks);
	public void setTarget(MCLivingEntity target, Target t);

	public static class MCEffect{

		private int potionID;
		private int strength;
		private int secondsRemaining;
		private boolean ambient;
		public MCEffect(int potionID, int strength, int secondsRemaining, boolean ambient){
			this.potionID = potionID;
			this.strength = strength;
			this.secondsRemaining = secondsRemaining;
			this.ambient = ambient;
		}

		public int getPotionID() {
			return potionID;
		}

		public int getStrength() {
			return strength;
		}

		public int getSecondsRemaining() {
			return secondsRemaining;
		}
		
		public boolean isAmbient() {
			return ambient;
		}

	}
}

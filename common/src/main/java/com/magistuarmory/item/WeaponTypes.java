package com.magistuarmory.item;

import com.magistuarmory.EpicKnights;
import com.magistuarmory.config.WeaponsConfig;

public final class WeaponTypes
{
    public static final WeaponsConfig WEAPONS_CONFIG = EpicKnights.CONFIG.weapons;
    
    public static final WeaponType STILETTO = new WeaponType(WEAPONS_CONFIG.stiletto.baseAttackDamage, WEAPONS_CONFIG.stiletto.baseAttackSpeed, WEAPONS_CONFIG.stiletto.bonusAttackReach, 0.0f, 0.6f, 15, WEAPONS_CONFIG.stiletto.enabled);
    public static final WeaponType SHORT_SWORD = new WeaponType(WEAPONS_CONFIG.shortSword.baseAttackDamage, WEAPONS_CONFIG.shortSword.baseAttackSpeed, WEAPONS_CONFIG.shortSword.bonusAttackReach, 0.0f, 0.9f, 0, WEAPONS_CONFIG.shortSword.enabled);
    public static final WeaponType KATZBALGER = new WeaponType(WEAPONS_CONFIG.katzbalger.baseAttackDamage, WEAPONS_CONFIG.katzbalger.baseAttackSpeed, WEAPONS_CONFIG.katzbalger.bonusAttackReach, 0.0f, 1.1f, 0, WEAPONS_CONFIG.katzbalger.enabled);
    public static final WeaponType PIKE = new WeaponType(WEAPONS_CONFIG.pike.baseAttackDamage, WEAPONS_CONFIG.pike.baseAttackSpeed, WEAPONS_CONFIG.pike.bonusAttackReach, 0.0f, 3.0f, 0, WEAPONS_CONFIG.pike.enabled).setTwoHanded(2);
    public static final WeaponType RANSEUR = new WeaponType(WEAPONS_CONFIG.ranseur.baseAttackDamage, WEAPONS_CONFIG.ranseur.baseAttackSpeed, WEAPONS_CONFIG.ranseur.bonusAttackReach, 0.0f, 2.5f, 0, WEAPONS_CONFIG.ranseur.enabled).setTwoHanded(1).setMaxBlockDamage(3.0f);
    public static final WeaponType AHLSPIESS = new WeaponType(WEAPONS_CONFIG.ahlspiess.baseAttackDamage, WEAPONS_CONFIG.ahlspiess.baseAttackSpeed, WEAPONS_CONFIG.ahlspiess.bonusAttackReach, 0.02f, 4.0f, 12, WEAPONS_CONFIG.ahlspiess.enabled).setTwoHanded(2).setMaxBlockDamage(3.0f);
    public static final WeaponType GIANT_LANCE = new WeaponType(WEAPONS_CONFIG.giantLance.baseAttackDamage, WEAPONS_CONFIG.giantLance.baseAttackSpeed, WEAPONS_CONFIG.giantLance.bonusAttackReach, 0.0f, 4.5f, 10, WEAPONS_CONFIG.giantLance.enabled);
    public static final WeaponType BASTARD_SWORD = new WeaponType(WEAPONS_CONFIG.bastardSword.baseAttackDamage, WEAPONS_CONFIG.bastardSword.baseAttackSpeed, WEAPONS_CONFIG.bastardSword.bonusAttackReach, 0.02f, 1.8f, 0, WEAPONS_CONFIG.bastardSword.enabled).setTwoHanded(1).setMaxBlockDamage(5.0f);
    public static final WeaponType ESTOC = new WeaponType(WEAPONS_CONFIG.estoc.baseAttackDamage, WEAPONS_CONFIG.estoc.baseAttackSpeed, WEAPONS_CONFIG.estoc.bonusAttackReach, 0.02f, 2.0f, 3, WEAPONS_CONFIG.estoc.enabled).setTwoHanded(1).setMaxBlockDamage(5.0f);
    public static final WeaponType CLAYMORE = new WeaponType(WEAPONS_CONFIG.claymore.baseAttackDamage, WEAPONS_CONFIG.claymore.baseAttackSpeed, WEAPONS_CONFIG.claymore.bonusAttackReach, 0.1f, 2.6f, 0, WEAPONS_CONFIG.claymore.enabled).setTwoHanded(2).setMaxBlockDamage(6.0f);
    public static final WeaponType ZWEIHANDER = new WeaponType(WEAPONS_CONFIG.zweihander.baseAttackDamage, WEAPONS_CONFIG.zweihander.baseAttackSpeed, WEAPONS_CONFIG.zweihander.bonusAttackReach, 0.05f, 4.0f, 4, WEAPONS_CONFIG.zweihander.enabled).setTwoHanded(2).setMaxBlockDamage(6.0f);
    public static final WeaponType FlAME_BLADED_SWORD = new WeaponType(WEAPONS_CONFIG.flameBladedSword.baseAttackDamage, WEAPONS_CONFIG.flameBladedSword.baseAttackSpeed, WEAPONS_CONFIG.flameBladedSword.bonusAttackReach, 0.05f, 4.0f, 4, WEAPONS_CONFIG.flameBladedSword.enabled).setTwoHanded(2).setFlamebladed().setMaxBlockDamage(6.0f);
    public static final WeaponType LOCHABER_AXE = new WeaponType(WEAPONS_CONFIG.lochaberAxe.baseAttackDamage, WEAPONS_CONFIG.lochaberAxe.baseAttackSpeed, WEAPONS_CONFIG.lochaberAxe.bonusAttackReach, 0.05f, 3.5f, 0, WEAPONS_CONFIG.lochaberAxe.enabled).setTwoHanded(1).setMaxBlockDamage(3.0f);
    public static final WeaponType CONCAVE_EDGED_HALBERD = new WeaponType(WEAPONS_CONFIG.concaveEdgedHalberd.baseAttackDamage, WEAPONS_CONFIG.concaveEdgedHalberd.baseAttackSpeed, WEAPONS_CONFIG.concaveEdgedHalberd.bonusAttackReach, 0.05f, 4.1f, 2, WEAPONS_CONFIG.concaveEdgedHalberd.enabled).setTwoHanded(2).setMaxBlockDamage(3.0f).setHalberd();
    public static final WeaponType HEAVY_MACE = new WeaponType(WEAPONS_CONFIG.heavyMace.baseAttackDamage, WEAPONS_CONFIG.heavyMace.baseAttackSpeed, WEAPONS_CONFIG.heavyMace.bonusAttackReach, 0.05f, 2.6f, 11, WEAPONS_CONFIG.heavyMace.enabled);
    public static final WeaponType HEAVY_WAR_HAMMER = new WeaponType(WEAPONS_CONFIG.heavyWarHammer.baseAttackDamage, WEAPONS_CONFIG.heavyWarHammer.baseAttackSpeed, WEAPONS_CONFIG.heavyWarHammer.bonusAttackReach, 0.05f, 2.5f, 15, WEAPONS_CONFIG.heavyWarHammer.enabled);
    public static final WeaponType LUCERNE_HAMMER = new WeaponType(WEAPONS_CONFIG.lucerneHammer.baseAttackDamage, WEAPONS_CONFIG.lucerneHammer.baseAttackSpeed, WEAPONS_CONFIG.lucerneHammer.bonusAttackReach, 0.05f, 2.5f, 20, WEAPONS_CONFIG.lucerneHammer.enabled).setTwoHanded(1);
    public static final WeaponType MORNINGSTAR = new WeaponType(WEAPONS_CONFIG.morningstar.baseAttackDamage, WEAPONS_CONFIG.morningstar.baseAttackSpeed, WEAPONS_CONFIG.morningstar.bonusAttackReach, 0.05f, 2.5f, 0, WEAPONS_CONFIG.morningstar.enabled);
    public static final WeaponType FLAIL = new WeaponType(WEAPONS_CONFIG.flail.baseAttackDamage, WEAPONS_CONFIG.flail.baseAttackSpeed, WEAPONS_CONFIG.flail.bonusAttackReach, 0.06f, 3.0f, 0, WEAPONS_CONFIG.flail.enabled);
    public static final WeaponType GUISARME = new WeaponType(WEAPONS_CONFIG.guisarme.baseAttackDamage, WEAPONS_CONFIG.guisarme.baseAttackSpeed, WEAPONS_CONFIG.guisarme.bonusAttackReach, 0.0f, 2.5f, 0, WEAPONS_CONFIG.guisarme.enabled).setTwoHanded(1).setMaxBlockDamage(3.3f);
    public static final WeaponType BLACKSMITH_HAMMER = new WeaponType(WEAPONS_CONFIG.blacksmithHammer.baseAttackDamage, WEAPONS_CONFIG.blacksmithHammer.baseAttackSpeed, WEAPONS_CONFIG.blacksmithHammer.bonusAttackReach, 0.05f, 1.4f, 4, WEAPONS_CONFIG.blacksmithHammer.enabled);
    public static final WeaponType BARBED_CLUB = new WeaponType(WEAPONS_CONFIG.barbedClub.baseAttackDamage, WEAPONS_CONFIG.barbedClub.baseAttackSpeed, WEAPONS_CONFIG.barbedClub.bonusAttackReach, 0.0f, 1.0f, 0, WEAPONS_CONFIG.barbedClub.enabled);
    public static final WeaponType PITCHFORK = new WeaponType(WEAPONS_CONFIG.pitchfork.baseAttackDamage, WEAPONS_CONFIG.pitchfork.baseAttackSpeed, WEAPONS_CONFIG.pitchfork.bonusAttackReach, 0.05f, 1.2f, 0, WEAPONS_CONFIG.pitchfork.enabled);
    public static final WeaponType NOBLE_SWORD = new WeaponType(WEAPONS_CONFIG.nobleSword.baseAttackDamage, WEAPONS_CONFIG.nobleSword.baseAttackSpeed, WEAPONS_CONFIG.nobleSword.bonusAttackReach, 0.02f, 2.7f, 0, WEAPONS_CONFIG.nobleSword.enabled).setTwoHanded(1).setMaxBlockDamage(5.0f);
    public static final WeaponType RUSTED_BASTARD_SWORD = new WeaponType(WEAPONS_CONFIG.rustedBastardSword.baseAttackDamage, WEAPONS_CONFIG.rustedBastardSword.baseAttackSpeed, WEAPONS_CONFIG.rustedBastardSword.bonusAttackReach, 0.02f, 2.7f, 0, WEAPONS_CONFIG.rustedBastardSword.enabled).setTwoHanded(1).setMaxBlockDamage(5.0f);
    public static final WeaponType RUSTED_HEAVY_MACE = new WeaponType(WEAPONS_CONFIG.rustedHeavyMace.baseAttackDamage, WEAPONS_CONFIG.rustedHeavyMace.baseAttackSpeed, WEAPONS_CONFIG.rustedHeavyMace.bonusAttackReach, 0.02f, 2.6f, 0, WEAPONS_CONFIG.rustedHeavyMace.enabled);
    public static final WeaponType CLUB = new WeaponType(WEAPONS_CONFIG.club.baseAttackDamage, WEAPONS_CONFIG.club.baseAttackSpeed, WEAPONS_CONFIG.club.bonusAttackReach, 0.0f, 5.0f, 0, WEAPONS_CONFIG.club.enabled).setTwoHanded(1);
    public static final WeaponType MESSER_SWORD = new WeaponType(WEAPONS_CONFIG.messerSword.baseAttackDamage, WEAPONS_CONFIG.messerSword.baseAttackSpeed, WEAPONS_CONFIG.messerSword.bonusAttackReach, 0.02f, 1.2f, 0, WEAPONS_CONFIG.messerSword.enabled).setMaxBlockDamage(5.0f);
}

package com.realmsmaster.powernap.init;

import com.realmsmaster.powernap.block.PowerNapBlock;
import com.realmsmaster.powernap.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Matt on 12/23/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    //Init all your blocks for in-game here (See Pahimar's Ep. 9)
    //Example: If you had a block called a napbed
    //public static final PowerNapBlock napbed = new NapBed();
    public static void init()
    {
        //GameRegistry.registerBlock(napbed, "napbed");
    }
}

package com.realmsmaster.powernap.creativetab;

import com.realmsmaster.powernap.init.ModItems;
import com.realmsmaster.powernap.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Matt on 12/23/2014.
 */
public class PowerNapCreativeTab
{
    public static final CreativeTabs PowerNap_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.blanket;
        }

    };
}

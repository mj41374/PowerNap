package com.realmsmaster.powernap.block;

import com.realmsmaster.powernap.creativetab.PowerNapCreativeTab;
import com.realmsmaster.powernap.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

/**
 * Created by Matt on 12/23/2014.
 */
public class PowerNapBlock extends Block
{
    //This is the default constructor
    public PowerNapBlock(Material material)
    {
        super(material);
        this.setCreativeTab(PowerNapCreativeTab.PowerNap_TAB);
    }

    //This is an alternate constructor that specifies a default material if none is provided in the constructor above
    public PowerNapBlock()
    {
        this(Material.rock); //a default material if no constructor parameter is used for material, can be anything not just rock
    }

    /*
        Minecraft calls blocks using format: tile.PowerNap:blockname.name
    */
    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s.%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf("." + 1));
    }


}

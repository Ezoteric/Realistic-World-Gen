package rwg.support;

import java.util.ArrayList;

import cpw.mods.fml.common.Loader;
import rwg.biomes.realistic.RealisticBiomeBase;
import biomesoplenty.api.content.BOPCBiomes;

public class Support 
{
	public static ArrayList<RealisticBiomeBase> biomes_snow;
	public static ArrayList<RealisticBiomeBase> biomes_cold;
	public static ArrayList<RealisticBiomeBase> biomes_hot;
	public static ArrayList<RealisticBiomeBase> biomes_wet;
	public static ArrayList<RealisticBiomeBase> biomes_small;
	public static ArrayList<RealisticBiomeBase> biomes_test;
	public static ArrayList<RealisticBiomeBase> biomes_water;
	public static ArrayList<RealisticBiomeBase> biomes_coast;
	
    public enum BiomeCategory
    {
    	SNOW,
    	COLD,
    	HOT,
    	WET,
    	SMALL,
    	TEST,
    	WATER,
    	COAST
    }
	
	public static void init()
	{
		biomes_snow = new ArrayList<RealisticBiomeBase>();
		biomes_cold = new ArrayList<RealisticBiomeBase>();
		biomes_hot = new ArrayList<RealisticBiomeBase>();
		biomes_wet = new ArrayList<RealisticBiomeBase>();
		biomes_small = new ArrayList<RealisticBiomeBase>();
		biomes_test = new ArrayList<RealisticBiomeBase>();
		biomes_water = new ArrayList<RealisticBiomeBase>();
		biomes_coast = new ArrayList<RealisticBiomeBase>();
		
		if (Loader.isModLoaded("BiomesOPlenty"))
		{
			SupportBOP.init();
		}
		
	/*	if (Loader.isModLoaded("EnhancedBiomes"))
		{
			SupportEB.init();
		}*/
		
		if (Loader.isModLoaded("ExtrabiomesXL"))
		{
			SupportEBXL.init();
		}
		
		if (Loader.isModLoaded("Thaumcraft"))
		{
			SupportTC.init();
		}
	}
	
	public static void addBiome(RealisticBiomeSupport b, BiomeCategory cat)
	{
		try
		{
			switch(cat)
			{
				case SNOW: biomes_snow.add(b); break;
				case COLD: biomes_cold.add(b); break;
				case HOT: biomes_hot.add(b); break;
				case WET: biomes_wet.add(b); break;
				case SMALL: biomes_small.add(b); break;
				case TEST: biomes_test.add(b); break;
				case WATER: biomes_water.add(b); break;
				case COAST: biomes_coast.add(b); break;
			}
		}
		catch(Error e)
		{
			System.out.println("RWG Support: failed to add biome");
		}
	}
}

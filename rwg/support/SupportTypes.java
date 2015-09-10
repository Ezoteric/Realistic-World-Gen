package rwg.support;

import static net.minecraftforge.common.BiomeDictionary.registerBiomeType;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import extrabiomes.api.BiomeManager;
import biomesoplenty.api.content.BOPCBiomes;

public class SupportTypes
{	
/** Type support for Temple generation (or everything that uses types) 
 *  Credits go to Sadris from Github as i mainly used his code */
	
private static void addBiomesToDictionary()

		//Biome's 'O Plenty Type support
		{
	        BiomeDictionary.registerBiomeType(BOPCBiomes.alps, Type.SNOWY, Type.MOUNTAIN, Type.COLD);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.alpsForest, Type.SNOWY, Type.MOUNTAIN, Type.FOREST, Type.COLD);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.arctic, Type.SNOWY, Type.WASTELAND, Type.COLD, Type.DEAD);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.bambooForest, Type.JUNGLE, Type.FOREST, Type.DENSE, Type.LUSH);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.bayou, Type.SWAMP, Type.WATER, Type.LUSH, Type.WET);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.bog, Type.SWAMP, Type.FOREST, Type.WET, Type.DEAD);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.boneyard, Type.NETHER, Type.WASTELAND, Type.SPOOKY);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.borealForest, Type.FOREST, Type.DENSE, Type.CONIFEROUS, Type.LUSH);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.brushland, Type.PLAINS, Type.DRY, Type.HOT, Type.SAVANNA);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.canyon, Type.SANDY, Type.MOUNTAIN, Type.HILLS, Type.SPARSE, Type.DRY, Type.HOT);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.canyonRavine, Type.SANDY, Type.HILLS, Type.DRY, Type.HOT);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.chaparral, Type.PLAINS, Type.SPARSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.cherryBlossomGrove, Type.MAGICAL, Type.FOREST, Type.LUSH);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.coniferousForest, Type.FOREST, Type.HILLS, Type.CONIFEROUS, Type.DENSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.snowyConiferousForest, Type.SNOWY, Type.FOREST, Type.HILLS, Type.COLD, Type.CONIFEROUS, Type.DENSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.corruptedSands, Type.NETHER, Type.SANDY, Type.SPOOKY);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.crag, Type.WASTELAND, Type.MOUNTAIN, Type.SPOOKY, Type.DEAD, Type.DRY);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.deadForest, Type.FOREST, Type.DEAD, Type.SPARSE, Type.SPOOKY);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.deadSwamp, Type.SWAMP, Type.DEAD, Type.SPARSE, Type.SPOOKY);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.deciduousForest, Type.FOREST, Type.DENSE, Type.DRY);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.denseForest, Type.FOREST, Type.DENSE, Type.LUSH);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.eucalyptusForest, Type.JUNGLE, Type.HOT, Type.DRY, Type.LUSH, Type.SPARSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.fen, Type.FOREST, Type.SWAMP, Type.DEAD, Type.WET);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.flowerField, Type.PLAINS, Type.LUSH);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.frostForest, Type.SNOWY, Type.FOREST, Type.COLD, Type.SPARSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.fungiForest, Type.MAGICAL, Type.MUSHROOM, Type.FOREST, Type.SWAMP, Type.LUSH, Type.WET);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.garden, Type.MAGICAL, Type.PLAINS, Type.LUSH);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.glacier, Type.SNOWY, Type.HILLS, Type.COLD, Type.DEAD);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.grassland, Type.PLAINS, Type.SWAMP, Type.HILLS, Type.SPARSE, Type.LUSH);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.grove, Type.FOREST, Type.PLAINS, Type.DENSE, Type.LUSH);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.heathland, Type.PLAINS, Type.DRY, Type.SAVANNA);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.highland, Type.HILLS, Type.MOUNTAIN, Type.SPARSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.jadeCliffs, Type.FOREST, Type.MOUNTAIN, Type.DENSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.landOfLakes, Type.FOREST, Type.WATER, Type.DENSE, Type.WET, Type.HILLS);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.landOfLakesMarsh, Type.SWAMP, Type.WATER, Type.SPARSE, Type.WET);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.lavenderFields, Type.PLAINS, Type.LUSH, Type.SPARSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.lushDesert, Type.SANDY, Type.SAVANNA, Type.DRY, Type.LUSH, Type.HOT);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.lushSwamp, Type.SWAMP, Type.WATER, Type.LUSH, Type.WET);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.mangrove, Type.WATER, Type.FOREST, Type.WET, Type.LUSH);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.mapleWoods, Type.FOREST, Type.COLD);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.marsh, Type.SWAMP, Type.WATER, Type.WET, Type.SPARSE, Type.LUSH);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.meadow, Type.FOREST, Type.PLAINS, Type.LUSH);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.meadowForest, Type.FOREST, Type.PLAINS, Type.LUSH);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.moor, Type.HILLS, Type.SWAMP, Type.SPARSE, Type.WET);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.mountain, Type.MOUNTAIN, Type.FOREST, Type.DRY);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.mysticGrove, Type.MAGICAL, Type.FOREST, Type.LUSH, Type.WET);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.oasis, Type.SANDY, Type.JUNGLE, Type.LUSH, Type.DRY, Type.HOT);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.coralReef, Type.WATER);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.kelpForest, Type.WATER);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.ominousWoods, Type.MAGICAL, Type.FOREST, Type.SPOOKY, Type.SWAMP, Type.DEAD);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.orchard, Type.FOREST, Type.PLAINS, Type.LUSH, Type.SPARSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.outback, Type.SANDY, Type.PLAINS, Type.SAVANNA, Type.DRY, Type.HOT);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.phantasmagoricInferno, Type.NETHER, Type.SPOOKY);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.polarChasm, Type.NETHER, Type.COLD, Type.SNOWY);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.prairie, Type.PLAINS, Type.DRY, Type.SPARSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.quagmire, Type.SWAMP, Type.WASTELAND, Type.SPOOKY, Type.WET, Type.DEAD);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.rainforest, Type.JUNGLE, Type.HILLS, Type.FOREST, Type.LUSH, Type.WET, Type.DENSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.redwoodForest, Type.FOREST, Type.CONIFEROUS, Type.DENSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.sacredSprings, Type.MOUNTAIN, Type.FOREST, Type.MAGICAL, Type.WET, Type.DENSE, Type.LUSH);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.scrubland, Type.SAVANNA, Type.PLAINS, Type.DRY, Type.HOT, Type.SPARSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.seasonalForest, Type.FOREST, Type.LUSH, Type.DENSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.seasonalForest, Type.FOREST, Type.LUSH, Type.SPARSE, Type.PLAINS);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.shield, Type.FOREST, Type.WATER, Type.CONIFEROUS, Type.WET);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.shrubland, Type.PLAINS, Type.SPARSE, Type.DRY);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.silkglades, Type.SWAMP, Type.FOREST, Type.SPOOKY, Type.DEAD);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.sludgepit, Type.SWAMP, Type.FOREST, Type.WASTELAND, Type.WET, Type.DEAD, Type.SPOOKY);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.spectralGarden, Type.END, Type.FOREST, Type.LUSH, Type.SPOOKY);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.spruceWoods, Type.FOREST, Type.CONIFEROUS, Type.LUSH, Type.DENSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.steppe, Type.PLAINS, Type.SANDY, Type.DRY, Type.HOT, Type.SAVANNA, Type.SPARSE, Type.DEAD);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.temperateRainforest, Type.FOREST, Type.HILLS, Type.WET, Type.CONIFEROUS, Type.LUSH);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.thicket, Type.PLAINS, Type.FOREST, Type.DRY, Type.DEAD, Type.DENSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.tropicalRainforest, Type.JUNGLE, Type.HOT, Type.WET, Type.LUSH, Type.DENSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.tropics, Type.JUNGLE, Type.BEACH, Type.WATER, Type.WET, Type.LUSH);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.tundra, Type.COLD, Type.WASTELAND, Type.DRY, Type.DEAD, Type.SPARSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.undergarden, Type.NETHER, Type.JUNGLE, Type.SPOOKY);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.visceralHeap, Type.NETHER, Type.SPOOKY);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.volcano, Type.MOUNTAIN, Type.WASTELAND, Type.HOT, Type.DRY);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.wasteland, Type.WASTELAND, Type.SPOOKY, Type.DEAD, Type.SPARSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.wetland, Type.SWAMP, Type.FOREST, Type.LUSH, Type.WET, Type.DENSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.woodland, Type.FOREST, Type.DRY, Type.DENSE);
	        BiomeDictionary.registerBiomeType(BOPCBiomes.xericShrubland, Type.SANDY, Type.LUSH, Type.DRY, Type.HOT);
		}

		//Extra Biome's Type Support (still has to be added)
	    {
			 BiomeDictionary.registerBiomeType(BiomeManager.alpine.get(), Type.SNOWY, Type.MOUNTAIN, Type.COLD);
	    }

}

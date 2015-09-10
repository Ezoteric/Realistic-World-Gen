package rwg.support;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import rwg.api.RWGBiomes;
import rwg.support.edit.*;
import rwg.surface.*;
import rwg.surface.river.SurfaceRiverOasis;
import rwg.terrain.*;
import biomesoplenty.api.content.BOPCBiomes;
import rwg.support.Support.BiomeCategory;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

public class SupportBOP 
{	 
	public static void init()
	{
		//ALPS
		/*Support.biomes_snow.add(
			new RealisticBiomeSupport(
				BOPCBiomes.alps,
				new TerrainMountainRiver(),
				new SurfaceMountainSnow(Blocks.grass, Blocks.dirt, false, null, 0.45f)
			)
		);*/
		
		//ARCTIC
		/*Support.biomes_snow.add(
			new RealisticBiomeSupport(
				BOPCBiomes.arctic,
				new TerrainMountainRiver(),
				new SurfaceMountainSnow(Blocks.grass, Blocks.dirt, false, null, 0.45f)
			)
		);*/
		
		//BAMBOO FOREST 
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.bambooForest, RWGBiomes.baseRiverWet,
				new TerrainSwampMountain(100f, 170f),
				new SurfaceMountainStone(BOPCBiomes.bambooForest.topBlock, BOPCBiomes.bambooForest.fillerBlock, false, null, 0.95f),
					"bop_bambooForest"
			),
			BiomeCategory.WET
		);
		
		//BAYOU
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.bayou, RWGBiomes.baseRiverWet,
				new TerrainSwampRiver(),
				new SurfaceGrassland(BOPCBiomes.bayou.topBlock, BOPCBiomes.bayou.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_bayou"
			),
			BiomeCategory.WET
		);
		
		//BOG
/*		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.bog, RWGBiomes.baseRiverHot,
				new TerrainMarsh(),
				new SurfaceGrassland(BOPCBiomes.bog.topBlock, BOPCBiomes.bog.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_bog"
			),
			BiomeCategory.HOT
		); */
		
		//BOREAL FOREST
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.borealForest, RWGBiomes.baseRiverCold,
				new TerrainMountainSpikes(),
				new SurfaceMountainSnow(BOPCBiomes.borealForest.topBlock, BOPCBiomes.borealForest.fillerBlock, true, Blocks.sand, 0.45f, 1.5f, 60f, 65f, 0.4f, 130f, 50f, 1.5f),
					"bop_borealForest"
			),
			BiomeCategory.COLD
		);
		
		//BRUSHLAND
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.brushland, RWGBiomes.baseRiverHot,
				new TerrainGrasslandHills(90f, 100f, 13f, 80f, 38f, 140f, 71f),
				new SurfaceGrasslandMix1(BOPCBiomes.brushland.topBlock, BOPCBiomes.brushland.fillerBlock, Blocks.sand, Blocks.stone, Blocks.cobblestone, 13f, 0.27f),
					"bop_brushland"
			),
			BiomeCategory.HOT
		);
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.brushland, RWGBiomes.baseRiverOasis,
				new TerrainDuneValley(150f),
				new SurfaceBase[]{
					new SurfaceDuneValley(BOPCBiomes.brushland.topBlock, BOPCBiomes.brushland.fillerBlock, 300f, false, true),
					new SurfaceRiverOasis(),
				},
				new EditBase[]{
					new EditRiverOasis()
				},
					"bop_brushland"
			),
			BiomeCategory.HOT
		);
		
		//CANYON
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.canyon, RWGBiomes.baseRiverHot,
				new TerrainCanyon(true, 35f, 160f, 60f, 40f, 69f),
				new SurfaceCanyon(BOPCBiomes.canyon.topBlock, BOPCBiomes.canyon.fillerBlock, (byte)0, 0),
					"bop_canyon"
			),
			BiomeCategory.HOT
		);
		//CANYON RAVINE
			/*	Support.addBiome(
					new RealisticBiomeSupport(
						BOPCBiomes.canyonRavine, RWGBiomes.baseRiverHot,
						new TerrainCanyon(true, 35f, 160f, 60f, 40f, 69f),
						new SurfaceCanyon(BOPCBiomes.canyon.topBlock, BOPCBiomes.canyon.fillerBlock, (byte)0, 0),
							"bop_canyonRavine"
					),
					BiomeCategory.HOT
				); */
		//CHAPARRAL
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.chaparral, RWGBiomes.baseRiverHot,
				new TerrainGrasslandFlats(),
				new SurfaceGrasslandMix1(BOPCBiomes.chaparral.topBlock, BOPCBiomes.chaparral.fillerBlock, Blocks.sand, Blocks.stone, Blocks.cobblestone, 26f, 0.35f),
					"bop_chaparral"
			),
			BiomeCategory.HOT
		);
		
		//CHERRYBLOSSOM GROVE
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.cherryBlossomGrove, RWGBiomes.baseRiverTemperate,
				new TerrainHighland(6f, 120f, 65f, 180f),
				new SurfaceMountainStone(BOPCBiomes.borealForest.topBlock, BOPCBiomes.borealForest.fillerBlock, true, Blocks.sand, 0.45f, 1.5f, 60f, 65f, 1.5f),
					"bop_cherryBlossomGrove"
			),
			BiomeCategory.COLD
		);
		
		//CONIFEROUS FOREST
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.coniferousForest, RWGBiomes.baseRiverCold,
				new TerrainMountainRiver(),
				new SurfaceMountainSnow(Blocks.grass, Blocks.dirt, false, null, 0.45f),
					"bop_coniferousForest"
			),
			BiomeCategory.COLD
		);
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.snowyConiferousForest, RWGBiomes.baseRiverIce,
				new TerrainMountainRiver(),
				new SurfaceMountainSnow(Blocks.grass, Blocks.dirt, false, null, 0.45f, 1.5f, 50f, 60f, 0.4f, 100f, 50f, 1.5f),
					"bop_snowyConiferousForest"
			),
			BiomeCategory.SNOW
		);
		
		//CRAG
		/*Support.biomes_cold.add(
			new RealisticBiomeSupport(
				BOPCBiomes.crag,
				new TerrainCanyon(false, new float[]{2.0f, 0.5f, 6.5f, 0.5f, 14.0f, 0.5f, 19.0f, 0.5f}, 35f, 80f, 60f, 40f, 69f),
				new SurfaceGrassland(BOPCBiomes.crag.topBlock, BOPCBiomes.crag.fillerBlock, Blocks.stone, Blocks.cobblestone)
			)
		);*/
		
		//DEAD FOREST
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.deadForest, RWGBiomes.baseRiverTemperate,
				new TerrainGrasslandHills(50f, 180f, 13f, 100f, 28f, 260f, 70f),
				new SurfaceGrassland(BOPCBiomes.deadForest.topBlock, BOPCBiomes.deadForest.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_deadForest"
			),
			BiomeCategory.COLD
		);
		
		//DEAD SWAMP
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.deadSwamp, RWGBiomes.baseRiverWet,
				new TerrainMarsh(),
				new SurfaceGrassland(BOPCBiomes.deadSwamp.topBlock, BOPCBiomes.deadSwamp.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_deadSwamp"
			),
			BiomeCategory.WET
		);
		
		//DECIDUOUS FORESTeucalyptusForest
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.deciduousForest, RWGBiomes.baseRiverHot,
				new TerrainHighland(0f, 140f, 68f, 200f),
				new SurfaceGrassland(BOPCBiomes.deciduousForest.topBlock, BOPCBiomes.deciduousForest.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_deciduousForest"
			),
			BiomeCategory.HOT
		);
		//eucalyptusForest
				Support.addBiome(
					new RealisticBiomeSupport(
						BOPCBiomes.eucalyptusForest, RWGBiomes.baseRiverHot,
						new TerrainHighland(0f, 180f, 68f, 120f),
						new SurfaceGrassland(BOPCBiomes.eucalyptusForest.topBlock, BOPCBiomes.eucalyptusForest.fillerBlock, Blocks.stone, Blocks.cobblestone),
							"bop_fen"
					),
					BiomeCategory.HOT
				); 
		//FEN
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.fen, RWGBiomes.baseRiverHot,
				new TerrainHighland(0f, 140f, 68f, 200f),
				new SurfaceGrassland(BOPCBiomes.fen.topBlock, BOPCBiomes.fen.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_fen"
			),
			BiomeCategory.HOT
		);
		
		//FLOWER FIELD
		/*Support.biomes_hot.add(
			new RealisticBiomeSupport(
				BOPCBiomes.flowerField,
				new TerrainGrasslandHills(40f, 180f, 13f, 100f, 28f, 260f, 70f),
				new SurfaceGrassland(BOPCBiomes.flowerField.topBlock, BOPCBiomes.flowerField.fillerBlock, Blocks.stone, Blocks.cobblestone)
			)
		);*/
		
		//FROST FOREST
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.frostForest, RWGBiomes.baseRiverIce,
				new TerrainHighland(0f, 140f, 68f, 200f),
				new SurfaceGrassland(BOPCBiomes.frostForest.topBlock, BOPCBiomes.frostForest.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_frostForest"
			),
			BiomeCategory.SNOW
		);
		
		//FUNGI FOREST
		/*Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.fungiForest, RWGBiomes.baseRiverWet,
				new TerrainSwampMountain(135f, 300f),
				new SurfaceMountainStone(BOPCBiomes.fungiForest.topBlock, BOPCBiomes.fungiForest.fillerBlock, false, null, 0.95f),
					"bop_fungiForest"
			),
			BiomeCategory.WET
		);*/
		
		//GARDEN
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.garden, RWGBiomes.baseRiverTemperate,
				new TerrainMountainSpikes(),
				new SurfaceMountainSnow(BOPCBiomes.garden.topBlock, BOPCBiomes.garden.fillerBlock, true, Blocks.sand, 0.45f, 1.5f, 60f, 65f, 0.4f, 130f, 50f, 1.5f),
					"bop_garden"
			),
			BiomeCategory.COLD
		);
		
		//GRASSLAND
		/*Support.biomes_cold.add(
			new RealisticBiomeSupport(
				BOPCBiomes.grassland,
				new TerrainGrasslandHills(47f, 180f, 13f, 100f, 28f, 260f, 70f),
				new SurfaceGrassland(BOPCBiomes.grassland.topBlock, BOPCBiomes.grassland.fillerBlock, Blocks.stone, Blocks.cobblestone)
			)
		);*/
		
		//GROVE
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.grove, RWGBiomes.baseRiverTemperate,
				new TerrainHighland(0f, 100f, 68f, 130f),
				new SurfaceGrassland(BOPCBiomes.grove.topBlock, BOPCBiomes.grove.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_grove"
			),
			BiomeCategory.COLD
		);
		
		//HEATHLAND
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.heathland, RWGBiomes.baseRiverOasis,
				new TerrainMountainSpikes(),
				new SurfaceBase[]{
					new SurfaceDuneValley(BOPCBiomes.brushland.topBlock, BOPCBiomes.brushland.fillerBlock, 300f, false, true) ,
					new SurfaceRiverOasis(),
				},
				new EditBase[]{
					new EditRiverOasis()
				},
					"bop_heathland"
			),
			BiomeCategory.HOT
		);
		
		//HIGHLAND
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.highland, RWGBiomes.baseRiverTemperate,
				new TerrainHighland(0f, 140f, 68f, 150f),
				new SurfaceMountainStone(BOPCBiomes.highland.topBlock, BOPCBiomes.highland.fillerBlock, false, null, 1f, 1.5f, 85f, 20f, 4f),
					"bop_highland"
			),
			BiomeCategory.COLD
		);
		
		//JADE CLIFFS
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.jadeCliffs, RWGBiomes.baseRiverHot,
				new TerrainHilly(230f, 120f, 0f),
				new SurfaceMountainStone(BOPCBiomes.jadeCliffs.topBlock, BOPCBiomes.jadeCliffs.fillerBlock, false, null, 0.95f),
					"bop_jadeCliffs"
			),
			BiomeCategory.HOT
		);
		//LAND OF LAKES MARCH
				Support.addBiome(
					new RealisticBiomeSupport(
						BOPCBiomes.landOfLakesMarsh, RWGBiomes.baseRiverTemperate,
						new TerrainMarsh(),
						new SurfaceGrassland(BOPCBiomes.landOfLakesMarsh.topBlock, BOPCBiomes.landOfLakesMarsh.fillerBlock, Blocks.stone, Blocks.cobblestone),
							"bop_landOfLakesMarsh"
					),
					BiomeCategory.COLD
				);
		//LAVENDER FIELDS
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.lavenderFields, RWGBiomes.baseRiverTemperate,
				new TerrainMountainSpikes(),
				new SurfaceMountainStone(BOPCBiomes.lavenderFields.topBlock, BOPCBiomes.lavenderFields.fillerBlock, false, null, 1.2f),
					"bop_lavenderFields"
			),
			BiomeCategory.COLD
		);
		
		//LUSH DESERT
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.lushDesert, RWGBiomes.baseRiverHot,
				new TerrainGrasslandHills(90f, 180f, 13f, 100f, 38f, 210f, 71f),
				new SurfaceGrassland(BOPCBiomes.lushDesert.topBlock, BOPCBiomes.lushDesert.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_lushDesert"
			),
			BiomeCategory.HOT
		);
		
		//LUSH SWAMP
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.lushSwamp, RWGBiomes.baseRiverWet,
				new TerrainSwampRiver(),
				new SurfaceGrassland(BOPCBiomes.lushSwamp.topBlock, BOPCBiomes.lushSwamp.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_lushSwamp"
			),
			BiomeCategory.WET
		);
		
		//MAPLE WOODS
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.mapleWoods, RWGBiomes.baseRiverTemperate,
				new TerrainHighland(0f, 140f, 68f, 200f),
				new SurfaceGrassland(BOPCBiomes.mapleWoods.topBlock, BOPCBiomes.mapleWoods.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_mapleWoods"
			),
			BiomeCategory.COLD
		);
		//MANGROVE
	/*	Support.addBiome(
				new RealisticBiomeSupport(
					BOPCBiomes.mangrove, RWGBiomes.baseRiverTemperate,
					new TerrainSwampRiver(),
					new SurfaceGrassland(BOPCBiomes.lushSwamp.topBlock, BOPCBiomes.lushSwamp.fillerBlock, Blocks.stone, Blocks.cobblestone),
						"bop_mangrove"
				),
				BiomeCategory.COLD
			); */
		//MARSH
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.marsh, RWGBiomes.baseRiverWet,
				new TerrainMarsh(),
				new SurfaceGrassland(BOPCBiomes.marsh.topBlock, BOPCBiomes.marsh.fillerBlock, Blocks.stone, Blocks.cobblestone),
				    "bop_marsh"
			),
			BiomeCategory.WET
		);
		
		//MEADOW
	/*	Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.meadow, RWGBiomes.baseRiverTemperate,
				new TerrainMountainSpikes(),
				new SurfaceMountainStone(BOPCBiomes.meadow.topBlock, BOPCBiomes.meadow.fillerBlock, false, null, 1.2f),
					"bop_meadow"
			),
			BiomeCategory.COLD
		); */
		
		//MOOR
		/*Support.biomes_wet.add(
			new RealisticBiomeSupport(
				BOPCBiomes.moor,
				new TerrainHighland(0f, 70f, 68f, 200f),
				new SurfaceGrassland(BOPCBiomes.moor.topBlock, BOPCBiomes.moor.fillerBlock, Blocks.stone, Blocks.cobblestone)
			)
		);*/
		
		//MOUNTAIN
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.mountain, RWGBiomes.baseRiverHot,
				new TerrainMountainRiver(),
				new SurfaceMountainStone(BOPCBiomes.mountain.topBlock, BOPCBiomes.mountain.fillerBlock, true, Blocks.sand, 0.75f),
					"bop_mountain"
			),
			BiomeCategory.HOT
		);
		
		//MYSTIC GROVE
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.mysticGrove, RWGBiomes.baseRiverWet,
				new TerrainHighland(0f, 140f, 68f, 200f),
				new SurfaceGrassland(BOPCBiomes.mysticGrove.topBlock, BOPCBiomes.mysticGrove.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_mysticGrove"
			),
			BiomeCategory.WET
		);
		
		//OMINOUS WOODS
	/*	Support.addBiome(
				new RealisticBiomeSupport(
				BOPCBiomes.ominousWoods, RWGBiomes.baseRiverTemperate,
				new TerrainHighland(0f, 140f, 68f, 200f),
				new SurfaceGrassland(BOPCBiomes.ominousWoods.topBlock, BOPCBiomes.ominousWoods.fillerBlock, Blocks.stone, Blocks.cobblestone),
				    "bop_ominousWoods"
				),
			BiomeCategory.COLD
		);*/
		
		//ORIGIN VALLEY
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.originValley, RWGBiomes.baseRiverHot,
				new TerrainHighland(10f, 80f, 68f, 200f),
				new SurfaceGrassland(BOPCBiomes.originValley.topBlock, BOPCBiomes.originValley.fillerBlock, Blocks.stone, Blocks.cobblestone),
				    "bop_originvalley"
			),
			BiomeCategory.HOT
		);
		
		//OUTBACK
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.outback, RWGBiomes.baseRiverOasis,
				new TerrainDuneValley(100f),
				new SurfaceBase[]{
					new SurfaceDuneValley(BOPCBiomes.outback.topBlock, BOPCBiomes.outback.fillerBlock, 300f, false, false),
					new SurfaceRiverOasis(),
				},
				new EditBase[]{
					new EditRiverOasis()
				},
					"bop_outback"
			),
			BiomeCategory.HOT
		);
		
		//PRAIRIE
	/*	Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.prairie, RWGBiomes.baseRiverHot,
				new TerrainGrasslandHills(90f, 100f, 13f, 100f, 38f, 150f, 71f),
				new SurfaceGrassland(BOPCBiomes.prairie.topBlock, BOPCBiomes.prairie.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_prairie"
			),
			BiomeCategory.HOT
		); */
		
		//RAINFOREST
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.rainforest, RWGBiomes.baseRiverWet,
				new TerrainSwampMountain(120f, 200f),
				new SurfaceMountainStone(BOPCBiomes.rainforest.topBlock, BOPCBiomes.rainforest.fillerBlock, false, null, 1.3f),
					"bop_rainforest"
			),
			BiomeCategory.WET
		);
		
		//REDWOOD FOREST
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.redwoodForest, RWGBiomes.baseRiverTemperate,
				new TerrainGrasslandHills(80f, 180f, 13f, 100f, 38f, 210f, 71f),
				new SurfaceMountainStone(BOPCBiomes.redwoodForest.topBlock, BOPCBiomes.redwoodForest.fillerBlock, false, null, 0.4f),
					"bop_redwoodForest"
			),
			BiomeCategory.COLD
		);
		
		//SACRED SPRINGS
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.sacredSprings, RWGBiomes.baseRiverWet,
				new TerrainHighland(0f, 120f, 68f, 160f),
				new SurfaceGrassland(BOPCBiomes.sacredSprings.topBlock, BOPCBiomes.sacredSprings.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_sacredSprings"
			),
			BiomeCategory.WET
		);
		
		//SEASONAL FOREST
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.seasonalForest, RWGBiomes.baseRiverTemperate,
				new TerrainHighland(0f, 140f, 68f, 170f),
				new SurfaceGrassland(BOPCBiomes.seasonalForest.topBlock, BOPCBiomes.seasonalForest.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_seasonalForest"
			),
			BiomeCategory.COLD
		);
		//SEASONAL FOREST CLEARING
				Support.addBiome(
					new RealisticBiomeSupport(
						BOPCBiomes.seasonalForestClearing, RWGBiomes.baseRiverTemperate,
						new TerrainHighland(0f, 140f, 68f, 170f),
						new SurfaceGrassland(BOPCBiomes.seasonalForestClearing.topBlock, BOPCBiomes.seasonalForestClearing.fillerBlock, Blocks.stone, Blocks.cobblestone),
							"bop_seasonalForestClearing"
					),
					BiomeCategory.COLD
				);
		//SHIELD
	/*	Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.shield, RWGBiomes.baseRiverCold,
				new TerrainGrasslandHills(90f, 180f, 13f, 100f, 38f, 210f, 71f),
				new SurfaceGrassland(BOPCBiomes.shield.topBlock, BOPCBiomes.shield.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_shield"
			),
			BiomeCategory.COLD
		); */
		
		//SHRUBLAND
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.shrubland, RWGBiomes.baseRiverHot,
				new TerrainGrasslandHills(90f, 180f, 13f, 100f, 38f, 210f, 71f),
				new SurfaceGrassland(BOPCBiomes.shrubland.topBlock, BOPCBiomes.shrubland.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_shrubland"
			),
			BiomeCategory.HOT
		);
		
		//SLUDGEPIT
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.sludgepit, RWGBiomes.baseRiverWet,
				new TerrainMarsh(),
				new SurfaceGrassland(BOPCBiomes.sludgepit.topBlock, BOPCBiomes.sludgepit.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_sludgepit"
			),
			BiomeCategory.WET
		);
		
		//STEPPE
	/*	Support.biomes_hot.add(
			new RealisticBiomeSupport(
				BOPCBiomes.steppe, RWGBiomes.baseRiverTemperate,
				new TerrainGrasslandHills(70f, 180f, 13f, 100f, 38f, 260f, 71f),
				new SurfaceGrassland(BOPCBiomes.steppe.topBlock, BOPCBiomes.steppe.fillerBlock, Blocks.stone, Blocks.cobblestone),
				    "bop_sludgepit"
			)
			//BiomeCategory.COLD
		); */
		
		//TEMPERATE RAINFOREST
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.temperateRainforest, RWGBiomes.baseRiverWet,
				new TerrainMountainRiver(),
				new SurfaceMountainStone(BOPCBiomes.temperateRainforest.topBlock, BOPCBiomes.temperateRainforest.fillerBlock, false, null, 0.45f),
					"bop_temperateRainforest"
			),
			BiomeCategory.WET
		);
		
		//THICKET
		/*Support.biomes_hot.add(
			new RealisticBiomeSupport(
				BOPCBiomes.thicket,
				new TerrainGrasslandHills(70f, 180f, 13f, 100f, 38f, 260f, 71f),
				new SurfaceGrassland(BOPCBiomes.thicket.topBlock, BOPCBiomes.thicket.fillerBlock, Blocks.stone, Blocks.cobblestone)
			)
		);*/
		//TROPICS
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.tropics, RWGBiomes.baseRiverWet,
				new TerrainHighland(10f, 80f, 68f, 200f),
				new SurfaceGrassland(BOPCBiomes.tropics.topBlock, BOPCBiomes.tropics.fillerBlock, Blocks.stone, Blocks.cobblestone),
				    "bop_tropics"
			),
			BiomeCategory.WET
		);
		//TROPICAL RAINFOREST
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.tropicalRainforest, RWGBiomes.baseRiverWet,
				new TerrainHighland(0f, 140f, 68f, 200f),
				new SurfaceGrassland(BOPCBiomes.tropicalRainforest.topBlock, BOPCBiomes.tropicalRainforest.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_tropicalRainforest"
			),
			BiomeCategory.WET
		);
		
		//TUNDRA
	/*	Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.tundra, RWGBiomes.baseRiverIce,
				new TerrainGrasslandHills(90f, 180f, 13f, 100f, 38f, 210f, 71f),
				new SurfaceGrassland(BOPCBiomes.tundra.topBlock, BOPCBiomes.tundra.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_tundra"
			),
			BiomeCategory.SNOW
		); */
		
		//WASTELAND
		/*Support.biomes_hot.add(
			new RealisticBiomeSupport(
				BOPCBiomes.wasteland,
				new TerrainHighland(10f, 80f, 68f, 200f),
				new SurfaceGrassland(BOPCBiomes.wasteland.topBlock, BOPCBiomes.wasteland.fillerBlock, Blocks.stone, Blocks.cobblestone)
			)
		);*/
		
		//WETLAND
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.wetland, RWGBiomes.baseRiverWet,
				new TerrainMarsh(),
				new SurfaceGrassland(BOPCBiomes.wetland.topBlock, BOPCBiomes.wetland.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_wetland"
			),
			BiomeCategory.WET
		);
		
		//WOODLAND
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.woodland, RWGBiomes.baseRiverTemperate,
				new TerrainHighland(0f, 140f, 68f, 200f),
				new SurfaceGrassland(BOPCBiomes.woodland.topBlock, BOPCBiomes.woodland.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_woodland"
			),
			BiomeCategory.COLD
		);
		//xericShrubland
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.xericShrubland, RWGBiomes.baseRiverHot,
				new TerrainHighland(0f, 140f, 68f, 200f),
				new SurfaceGrassland(BOPCBiomes.xericShrubland.topBlock, BOPCBiomes.xericShrubland.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_xericShrubland"
			),
			BiomeCategory.HOT
		);
		//CORALREEF HOT
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.coralReef, RWGBiomes.baseOceanHot,
				new TerrainCanyon(false, -25f, 0f, 0f, 0f, 30f),
				new SurfaceGrassland(BOPCBiomes.coralReef.topBlock, BOPCBiomes.coralReef.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_coralreef"
			),
			BiomeCategory.HOT	
		); 
		//CORALREEF WET
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.coralReef, RWGBiomes.baseOceanWet,
				new TerrainCanyon(false, -25f, 0f, 0f, 0f, 30f),
				new SurfaceGrassland(BOPCBiomes.coralReef.topBlock, BOPCBiomes.coralReef.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_coralreef"
			),
			BiomeCategory.WET	
		);

		//KELPFOREST COLD
 		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.kelpForest, RWGBiomes.baseOceanCold,
				new TerrainCanyon(false, -25f, 0f, 0f, 0f, 30f),
				new SurfaceGrassland(BOPCBiomes.kelpForest.topBlock, BOPCBiomes.kelpForest.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_kelpforest"
			),
			BiomeCategory.COLD	
		);		
		//KELPFOREST SNOW
		Support.addBiome(
			new RealisticBiomeSupport(
				BOPCBiomes.kelpForest, RWGBiomes.baseOceanIce,
				new TerrainCanyon(false, -25f, 0f, 0f, 0f, 30f),
				new SurfaceGrassland(BOPCBiomes.kelpForest.topBlock, BOPCBiomes.kelpForest.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_kelpforest"
			),
			BiomeCategory.SNOW	
		);
/*		//CORALREEF COLD
	//	Maybe needed maybe not, still testing.
	    Support.biomes_water.add(
			new RealisticBiomeSupport(
				BOPCBiomes.coralReef, RWGBiomes.baseRiverCold,
				new TerrainCanyon(false, -25f, 0f, 0f, 0f, 30f),
				new SurfaceGrassland(BOPCBiomes.coralReef.topBlock, BOPCBiomes.coralReef.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_coralreef"
			)
			//BiomeCategory.COLD	
		); 
		//CORALREEF SNOW
		Support.biomes_water.add(
			new RealisticBiomeSupport(
				BOPCBiomes.coralReef, RWGBiomes.baseRiverIce,
				new TerrainCanyon(false, -25f, 0f, 0f, 0f, 30f),
				new SurfaceGrassland(BOPCBiomes.coralReef.topBlock, BOPCBiomes.coralReef.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_coralreef"
			)
			//BiomeCategory.SNOW	
		); 
		//KELPFOREST HOT
		Support.biomes_water.add(
			new RealisticBiomeSupport(
				BOPCBiomes.kelpForest, RWGBiomes.baseRiverHot,
				new TerrainCanyon(false, -25f, 0f, 0f, 0f, 30f),
				new SurfaceGrassland(BOPCBiomes.kelpForest.topBlock, BOPCBiomes.kelpForest.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_kelpforest"
			)
			//BiomeCategory.HOT	
		);			
		//KELPFOREST WET
		Support.biomes_water.add(
			new RealisticBiomeSupport(
				BOPCBiomes.kelpForest, RWGBiomes.baseRiverWet,
				new TerrainCanyon(false, -25f, 0f, 0f, 0f, 30f),
				new SurfaceGrassland(BOPCBiomes.kelpForest.topBlock, BOPCBiomes.kelpForest.fillerBlock, Blocks.stone, Blocks.cobblestone),
					"bop_kelpforest"
			)
			//BiomeCategory.WET	
		); */

	}
}

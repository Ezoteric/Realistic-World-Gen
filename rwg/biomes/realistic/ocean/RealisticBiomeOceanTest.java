package rwg.biomes.realistic.ocean;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenMelon;
import net.minecraft.world.gen.feature.WorldGenPumpkin;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;
import rwg.api.RWGBiomes;
import rwg.biomes.realistic.RealisticBiomeBase;
import rwg.deco.DecoClay;
//import rwg.deco.DecoCoral;
import rwg.terrain.TerrainBase;
import rwg.terrain.TerrainCanyon;
import rwg.surface.SurfaceBase;
import rwg.surface.SurfaceMountainStoneMix1;
import rwg.util.CellNoise;
import rwg.util.PerlinNoise;

public class RealisticBiomeOceanTest extends RealisticBiomeBase
{
	private TerrainBase terrain;
	private SurfaceBase surface;

	public RealisticBiomeOceanTest() 
	{
		super(0, RWGBiomes.baseOceanWet, "rwg_OceanTest");

		terrain = new TerrainCanyon(false, -25f, 0f, 0f, 0f, 30f);
		surface = new SurfaceMountainStoneMix1(Blocks.grass, Blocks.dirt, false, null, 0f, 1.5f, 60f, 65f, 1.5f, Blocks.stone, 0.08f);
	}
	
	@Override
    public void rDecorate(World world, Random rand, int chunkX, int chunkY, PerlinNoise perlin, CellNoise cell, float strength, float river)
    {
    }

	@Override
    public float rNoise(PerlinNoise perlin, CellNoise cell, int x, int y, float ocean, float border, float river)
    {
		return terrain.generateNoise(perlin, cell, x, y, ocean, border, river);
		//return 80f;
    }

	@Override
    public void rReplace(Block[] blocks, byte[] metadata, int i, int j, int x, int y, int depth, World world, Random rand, PerlinNoise perlin, CellNoise cell, float[] noise, float river, BiomeGenBase[] base)
    {
    	Block b;
		for(int k = 255; k > -1; k--)
		{
			b = blocks[(y * 16 + x) * 256 + k];
            if(b == Blocks.air)
            {
            	depth = -1;
            }
            else if(b == Blocks.stone)
            {
            	depth++;

        		if(depth == 0)
        		{
    				if(k < 62)
    				{
    					blocks[(y * 16 + x) * 256 + k] = Blocks.sand;
    				}
    				else
    				{
    					blocks[(y * 16 + x) * 256 + k] = Blocks.dirt;
    				}   				
    				{
    					blocks[(y * 16 + x) * 256 + k] = Blocks.gravel;
    				}
        		}
        		else if(depth < 2)
        		{
        			blocks[(y * 16 + x) * 256 + k] = Blocks.sand;
        		}
            }
		}
    }
}

package rwg.deco.ruins;

import rwg.deco.ruins.MapGenHandler;
import rwg.deco.ruins.TempleGen;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.common.MinecraftForge;

public class ModMapGen {
	public static void registerMapGen() {
		MapGenStructureIO.registerStructure(TempleGen.Start.class, "rwg_TempleGen");
		MinecraftForge.TERRAIN_GEN_BUS.register(new MapGenHandler());
	}
}

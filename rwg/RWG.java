package rwg;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import rwg.biomes.base.BaseBiomes;
import rwg.config.ConfigRWG;
import rwg.data.TreeReplacement;
import rwg.data.VillageMaterials;
import rwg.proxy.ServerProxy;
import rwg.support.Support;
import rwg.util.DebugInfo;
import rwg.world.WorldTypeRealistic;
import rwg.deco.ruins.ModMapGen;
import rwg.deco.ruins.MapGenHandler;
import rwg.deco.ruins.TempleGen;
import rwg.deco.ruins.MapGenHandler;
import rwg.deco.ruins.TempleGen;


@Mod(modid="RWG", name="RealisticWorldGen", version="@VERSION@", acceptableRemoteVersions="*")
public class RWG
{
	//@SidedProxy(clientSide = "rwg.proxy.ClientProxy", serverSide = "rwg.proxy.ServerProxy")
	//public static ServerProxy proxy;

	@Instance("RWG")
	public static RWG instance;
	
	public static final WorldTypeRealistic worldtype = (new WorldTypeRealistic("RWG"));  
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		instance = this;
		
		ConfigRWG.init(event);
		BaseBiomes.load();
		
	    MinecraftForge.TERRAIN_GEN_BUS.register(new VillageMaterials());
	    
	    ModMapGen.registerMapGen();
	    
	//    MapGenStructureIO.registerStructure(TempleGen.Start.class, "rwg_TempleGen");	       
	//	  MinecraftForge.TERRAIN_GEN_BUS.register(new MapGenHandler());
	    
		//MinecraftForge.TERRAIN_GEN_BUS.register(new TreeReplacement());
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		if ( event.getSide() == Side.CLIENT ) {
			MinecraftForge.EVENT_BUS.register(new DebugInfo());
		}
		//proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		Support.init();
	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		//event.registerServerCommand(new CommandRftDim());
		//event.registerServerCommand(new CommandRftTp());
		//event.registerServerCommand(new CommandRftDb());
		//event.registerServerCommand(new CommandRftCfg());
	}
}

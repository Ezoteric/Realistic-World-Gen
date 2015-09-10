package rwg.util;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import rwg.biomes.realistic.RealisticBiomeBase;
import rwg.world.ChunkManagerRealistic;

/**
 * Created by James on 18/07/15.
 */
public final class DebugInfo
{
	private static final String PREFIX = EnumChatFormatting.GREEN + "[RWG] " + EnumChatFormatting.RESET;

	@SubscribeEvent
	public void onDrawDebugText ( RenderGameOverlayEvent.Text event ) {
		EntityClientPlayerMP player = Minecraft.getMinecraft().thePlayer;
		World world = Minecraft.getMinecraft().theWorld;

		if ( world.getWorldChunkManager() instanceof ChunkManagerRealistic ) {

			ChunkManagerRealistic chunkManager = (ChunkManagerRealistic)world.getWorldChunkManager();
			String details = "";

			if(Minecraft.getMinecraft().gameSettings.showDebugInfo) {
				event.left.add(null);
				int posX = (int)player.posX;
				int posZ = (int)player.posZ;
				RealisticBiomeBase biomeBase = chunkManager.getBiomeDataAt(posX, posZ);
				double biomeNoise = chunkManager.getBiomeNoiseAt(posX, posZ);
//				float subBiomeNoise = chunkManager.getSubBiomeNoiseAt(posX, posZ);

				details = PREFIX;
				details += "subBiome: " + biomeBase.name;
				details += " - biome noise: " + biomeNoise;
//				details += " - sub biome noise: " + subBiomeNoise;
				event.left.add(details);

				details = PREFIX;
				details += "ocean value: " + chunkManager.getOceanValue(posX, posZ);
				event.left.add(details);
			}
		}
	}
}

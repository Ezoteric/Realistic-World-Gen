package rwg.deco.ruins;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.terraingen.InitMapGenEvent;
import net.minecraftforge.event.terraingen.InitMapGenEvent.EventType;

public class MapGenHandler
{
  @SubscribeEvent (priority = EventPriority.LOWEST)
  public void initMapGen(InitMapGenEvent event)
  {
    if (event.type == InitMapGenEvent.EventType.SCATTERED_FEATURE) {
        event.newGen = new TempleGen();
    }
  }
}

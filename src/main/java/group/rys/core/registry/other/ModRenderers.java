package group.rys.core.registry.other;

import group.rys.client.renderer.GathererAntRenderer;
import group.rys.client.renderer.HuntingAntRenderer;
import group.rys.common.entity.GathererAntEntity;
import group.rys.common.entity.HuntingAntEntity;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ModRenderers {
	
	public static void register() {
		RenderingRegistry.registerEntityRenderingHandler(GathererAntEntity.class, GathererAntRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(HuntingAntEntity.class, HuntingAntRenderer::new);
	}
	
}

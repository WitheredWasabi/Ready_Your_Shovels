package group.rys.common.world.gen.feature.structure;

import java.util.function.Function;

import com.mojang.datafixers.Dynamic;

import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.ScatteredStructure;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class GraveyardStructure extends ScatteredStructure<NoFeatureConfig> {
	
	public GraveyardStructure(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i51449_1_) {
		super(p_i51449_1_);
	}
	
	protected int getSeedModifier() {
		return 1859856;
	}
	
	public IStartFactory getStartFactory() {
		return GraveyardStructure.Start::new;
	}
	
	public String getStructureName() {
		return "graveyard_dungeon";
	}
	
	public int getSize() {
		return 1;
	}
	
	public static class Start extends StructureStart {
		
		public Start(Structure<?> p_i51341_1_, int chunkX, int chunkZ, Biome biomeIn, MutableBoundingBox boundsIn, int referenceIn, long seed) {
			super(p_i51341_1_, chunkX, chunkZ, biomeIn, boundsIn, referenceIn, seed);
		}
		
		public void init(ChunkGenerator<?> generator, TemplateManager templateManagerIn, int chunkX, int chunkZ, Biome biomeIn) {
			int i = chunkX * 16;
			int j = chunkZ * 16;
			BlockPos blockpos = new BlockPos(i, 90, j);
			Rotation rotation = Rotation.values()[this.rand.nextInt(Rotation.values().length)];
			GraveyardPieces.addPieces(templateManagerIn, blockpos, rotation, this.components, this.rand);
			this.recalculateStructureSize();
		}
		
	}
	
}

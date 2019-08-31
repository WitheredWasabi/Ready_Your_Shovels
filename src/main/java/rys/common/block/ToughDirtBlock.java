package rys.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

public class ToughDirtBlock extends Block {
	
	public ToughDirtBlock(Properties properties) {
		super(properties);
	}
	
	public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
		PlantType type = plantable.getPlantType(world, pos.offset(facing));
		
		if (type == PlantType.Plains) {
			return true;
		}
		
		return false;
	}
	
}
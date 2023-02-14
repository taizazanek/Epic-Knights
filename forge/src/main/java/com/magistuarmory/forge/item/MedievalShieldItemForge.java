package com.magistuarmory.forge.item;

import com.magistuarmory.client.render.model.Models;
import com.magistuarmory.item.IHasModelProperty;
import com.magistuarmory.item.MedievalShieldItem;
import com.magistuarmory.item.ModItemTier;
import com.magistuarmory.item.ShieldType;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.IItemRenderProperties;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import java.util.function.Consumer;

public class MedievalShieldItemForge extends MedievalShieldItem
{
	public MedievalShieldItemForge(String id, String name, Properties build, ModItemTier material, boolean paintable, boolean is3d, ShieldType type, Models.ShieldEnum modelkey)
    {
		super(id, name, build, material, paintable, is3d, type, modelkey);
    }

	@Override
	public boolean canPerformAction(ItemStack stack, ToolAction action)
	{
		return ToolActions.DEFAULT_SHIELD_ACTIONS.contains(action);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void initializeClient(Consumer<IItemRenderProperties> consumer)
	{
		consumer.accept(new IItemRenderProperties()
		{
			@Override
			public BlockEntityWithoutLevelRenderer getItemStackRenderer()
			{
				return renderer;
			}
		});
	}
}
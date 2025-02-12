package com.pianomanu.woods.screen;

import com.mojang.blaze3d.platform.GlStateManager;

import com.pianomanu.woods.WoodsMain;
import com.pianomanu.woods.container.InventoryBlockContainer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class InventoryBlockScreen extends ContainerScreen<InventoryBlockContainer> {

    private static final ResourceLocation BACKGROUND = new ResourceLocation(WoodsMain.MOD_ID, "textures/gui/wooden_box.png");

    public InventoryBlockScreen(InventoryBlockContainer container, PlayerInventory playerInventory, ITextComponent title) {
        super(container, playerInventory, title);
        ySize = 222;
        xSize = 176;
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        renderBackground();
        super.render(mouseX, mouseY, partialTicks);
        renderHoveredToolTip(mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        font.drawString(title.getFormattedText(), 8, 6, 4210752);
        font.drawString(playerInventory.getDisplayName().getFormattedText(), 8, ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color4f(1, 1, 1, 1);
        minecraft.getTextureManager().bindTexture(BACKGROUND);
        blit(guiLeft, guiTop, 0, 0, xSize, ySize, 256, 256);
    }

}

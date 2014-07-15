package robosphinx.mods.quartz.client.gui;

/**
 * @author robosphinx
 */

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import cpw.mods.fml.client.IModGuiFactory;

public class GuiFactory implements IModGuiFactory {
    
    @Override
    public void initialize (Minecraft minecraftInstance) {
        
    }
    
    @Override
    public Class <? extends GuiScreen> mainConfigGuiClass () {
        return QuartzGuiConfig.class;
    }
    
    @Override
    public Set <RuntimeOptionCategoryElement> runtimeGuiCategories () {
        return null;
    }
    
    @Override
    public RuntimeOptionGuiHandler getHandlerFor (RuntimeOptionCategoryElement element) {
        return null;
    }
    
}
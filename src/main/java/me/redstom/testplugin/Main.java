package me.redstom.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main  extends JavaPlugin {
  @Override
  public void onEnable() {
    System.out.println("Hello World!");
  }

  @Override
  public void onDisable() {
    System.out.println("Goodbye World!");
  }
}

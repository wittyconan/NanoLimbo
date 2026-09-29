package ua.nanit.limbo;

// 模拟最小化 Bukkit Plugin 接口基类，免下载任何外部依赖
public class PluginMain {
    public void onEnable() {
        NanoLimbo.startBackgroundService();
    }
    public void onDisable() {
        // 关闭时清理
    }
}

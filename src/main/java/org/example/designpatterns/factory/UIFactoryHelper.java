package org.example.designpatterns.factory;

public class UIFactoryHelper {
    public static UIfactory getUIFactoryForPlatform(SupportedPlatforms platform) {
        if (platform.equals(SupportedPlatforms.ANDROID)) {
            return new AndroidUIfactory();
        } else if (platform.equals(SupportedPlatforms.IOS)) {
            return new IOSUIFactory();
        }
        return null;
    }

}

package org.example.designpatterns.factory;

public class Flutter {
    void refreshUI() {
        System.out.println("Refreshing UI");
    }

    void setTheme() {
        System.out.println("Setting Theme");
    }

    UIfactory getUIFactory(SupportedPlatforms platform) {
        return UIFactoryHelper.getUIFactoryForPlatform(platform);
    }
}

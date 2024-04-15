package org.example.designpatterns.factory;

import org.example.designpatterns.factory.buttons.Button;
import org.example.designpatterns.factory.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIfactory uiFactory = flutter.getUIFactory(SupportedPlatforms.IOS);

        Button button = uiFactory.createButton();
        button.click();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();
    }

}

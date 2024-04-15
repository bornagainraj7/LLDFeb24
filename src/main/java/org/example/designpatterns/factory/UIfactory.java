package org.example.designpatterns.factory;

import org.example.designpatterns.factory.buttons.Button;
import org.example.designpatterns.factory.menu.Menu;

public interface UIfactory {
   Button createButton();

   Menu createMenu();
}

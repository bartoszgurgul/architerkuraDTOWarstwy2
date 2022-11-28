package main.creationPattern.facotrypattern.website;

import main.creationPattern.facotrypattern.page.CarPage;
import main.creationPattern.facotrypattern.page.ItemPage;
import main.creationPattern.facotrypattern.page.SearchPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CarPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}

package main.creationPattern.facotrypattern;

import main.creationPattern.facotrypattern.website.Blog;
import main.creationPattern.facotrypattern.website.Shop;
import main.creationPattern.facotrypattern.website.Website;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType sietType){
        switch (sietType){
            case BLOG -> {
                return new Blog();
            }
            case SHOP -> {
                return new Shop();
            }
            default -> {
                return null;
            }


        }
    }
}

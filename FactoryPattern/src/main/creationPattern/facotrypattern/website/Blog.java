package main.creationPattern.facotrypattern.website;

import main.creationPattern.facotrypattern.page.AboutPage;
import main.creationPattern.facotrypattern.page.CommentPage;
import main.creationPattern.facotrypattern.page.ContentPage;
import main.creationPattern.facotrypattern.page.PostPage;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContentPage());

    }
}

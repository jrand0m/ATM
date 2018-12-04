package PhoneRegistration;

public class MenuItem implements Comparable<MenuItem> {
    private String caption;
    private Integer position = 0;
    private final Runnable runMenuItem;

    public MenuItem(String caption, Integer position, Runnable runMenuItem) {
        this.caption = caption;
        this.position = position;
        this.runMenuItem = runMenuItem;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Runnable getRunMenuItem() {
        return runMenuItem;
    }

    @Override
    public int compareTo(MenuItem menuItem) {
        return this.position.compareTo(menuItem.position);
    }

    public void runMenuItemMethod() {
        runMenuItem.run();

    }


}

package ru.myitschool.pcdesigner;

public class MainListView {

    private long id;
    private int icon;
    private String name;

    public MainListView(long id, int icon, String name) {
        this.id = id;
        this.icon = icon;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

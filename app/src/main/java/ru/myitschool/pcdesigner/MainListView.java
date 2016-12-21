package ru.myitschool.pcdesigner;

class MainListView {

    private long id;
    private int icon;
    private int name;

    MainListView(long id, int icon, int name) {
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

    int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

}

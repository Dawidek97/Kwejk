package group.kwejk.model;

public class Gif {

    private String name;
    private String userName;
    private Boolean favorite;
    private int categoryId;

    public Gif(String name, String userName, Boolean favourite, int categoryId) {
        this.categoryId = categoryId;
        this.name = name;
        this.userName = userName;
        this.favorite = favourite;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }
}

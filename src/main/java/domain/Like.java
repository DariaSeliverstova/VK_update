package domain;

public class Like {
    private int count;
    private int userLikes;
    private boolean canLike;
    private boolean canPublish;

    public void setCount(int count) {
        this.count = count;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

    public int getCount() {
        return count;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public boolean isCanPublish() {
        return canPublish;
    }
}
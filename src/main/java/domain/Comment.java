package domain;

public class Comment {
    private int count;
    private boolean canPost;
    private boolean groupsCanPost;
    private boolean canClose;
    private boolean canOpen;

    public void setCount(int count) {
        this.count = count;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public int getCount() {
        return count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }
}
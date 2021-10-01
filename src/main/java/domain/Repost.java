package domain;

public class Repost {
    private int count;
    private boolean userReposted;

    public void setCount(int count) {
        this.count = count;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }

    public int getCount() {
        return count;
    }

    public boolean isUserReposted() {
        return userReposted;
    }
}

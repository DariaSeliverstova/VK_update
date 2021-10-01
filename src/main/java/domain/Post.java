package domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String postType;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private int canEdit;
    private int isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public int getId() {
        return id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public int getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public String getPostType() {
        return postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public int getPostponedId() {
        return postponedId;
    }
}

package com.chenge.mysrtp.entity;

public class Posts {
    private String description;
    private String tags;
    /**
     * owner为帖子的来源：1代表来自系统，2来自管理员，3来自用户
     */
    private int owner;
    /**
     * comments为用户为标签推荐结果的反馈
     */
    private String comments;

    public Posts() {
    }

    public Posts(String description, String tags, int owner, String comments) {
        this.description = description;
        this.tags = tags;
        this.owner = owner;
        this.comments = comments;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Posts{");
        sb.append("description='").append(description).append('\'');
        sb.append(", tags='").append(tags).append('\'');
        sb.append(", owner=").append(owner);
        sb.append(", comments='").append(comments).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

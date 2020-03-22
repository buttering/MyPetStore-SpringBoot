package org.csu.mypetstorespring.domain;

public class Category {
    private String categoryId;
    private String name;
    private String description;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String catagoryId) {
        this.categoryId = catagoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}

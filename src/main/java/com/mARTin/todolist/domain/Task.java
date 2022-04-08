package com.mARTin.todolist.domain;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Objects;

public class Task {

    @Nullable
    private Integer id;
    @NonNull
    private Integer userId;
    @NonNull
    private String name;
    @NonNull
    private Integer status;
    @NonNull
    private String category;
    @NonNull
    private String description;
    @NonNull
    private Timestamp createAt;

    public Task() {
    }

    public Task(@Nullable Integer id, @NonNull Integer userId, @NonNull String name, @NonNull Integer status, @NonNull String category, @NonNull String description) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.status = status;
        this.category = category;
        this.description = description;
        this.createAt = Timestamp.from(Instant.now());
    }

    @Nullable
    public Integer getId() {
        return id;
    }

    public void setId(@Nullable Integer id) {
        this.id = id;
    }

    @NonNull
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(@NonNull Integer userId) {
        this.userId = userId;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public Integer getStatus() {
        return status;
    }

    public void setStatus(@NonNull Integer status) {
        this.status = status;
    }

    @NonNull
    public String getCategory() {
        return category;
    }

    public void setCategory(@NonNull String category) {
        this.category = category;
    }

    @NonNull
    public String getDescription() {
        return description;
    }

    public void setDescription(@NonNull String description) {
        this.description = description;
    }

    @NonNull
    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(@NonNull Timestamp createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", createAt=" + createAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && userId.equals(task.userId) && name.equals(task.name) && status.equals(task.status) && category.equals(task.category) && description.equals(task.description) && createAt.equals(task.createAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, name, status, category, description, createAt);
    }
}

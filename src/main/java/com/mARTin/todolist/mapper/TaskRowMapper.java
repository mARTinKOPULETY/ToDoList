package com.mARTin.todolist.mapper;

import com.mARTin.todolist.domain.Task;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskRowMapper implements RowMapper<Task> {
    @Override
    public Task mapRow(ResultSet resultSet, int i) throws SQLException {

        Task task = new Task();
        task.setId(resultSet.getInt("id"));
        task.setUserId(resultSet.getInt("userId"));
        task.setName(resultSet.getString("name"));
        task.setStatus(resultSet.getInt("status"));
        task.setCategory(resultSet.getString("category"));
        task.setDescription(resultSet.getString("description"));
        task.setCreateAt(resultSet.getTimestamp("createdAt"));
        return task;
    }
}

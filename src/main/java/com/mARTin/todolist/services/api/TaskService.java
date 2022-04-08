package com.mARTin.todolist.services.api;
import com.mARTin.todolist.domain.Task;
import java.util.List;

public interface TaskService {
    List<Task> getTasks();
    Task get(Integer id);
    List<Task> getTskByUseId(Integer userId);
    Integer add(Task task);
    void delete(Integer id);
    void update(Integer id, Task task);


}

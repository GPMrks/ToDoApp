package controller;

import model.Task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class TaskController {

    public void save(Task task) {

    }

    public void update(Task task) {

    }

    public void delete(int taskId) {
        String sql = "DELETE FROM tasks WHERE id = ?";
        Connection conn = null;
        PreparedStatement statement = null;

        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Task> getAll(int idProject) {
        return null;
    }

}

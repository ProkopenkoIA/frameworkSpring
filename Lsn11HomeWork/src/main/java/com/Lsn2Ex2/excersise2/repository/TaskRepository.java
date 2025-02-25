package com.Lsn2Ex2.excersise2.repository;

import com.Lsn2Ex2.excersise2.model.Task;
import com.Lsn2Ex2.excersise2.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByStatus(TaskStatus status);

}

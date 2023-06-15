package com.alienexplorer.app.rest.Repository;

import com.alienexplorer.app.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public  abstract class TodoRepository implements JpaRepository<Task, Long> {

}

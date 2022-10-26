package br.ce.senai.taskbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ce.senai.taskbackend.model.Task;

public interface TaskRepo extends JpaRepository<Task, Long>{

}

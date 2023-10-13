package br.com.danieleleao.todolist.task;

import java.util.List;
import java.util.UUID;

// Esta interface define um modelo para interagir com o banco de dados para a entidade TaskModel.
// Ela estende JpaRepository do Spring Data JPA, indicando que é um repositório de dados JPA.
// Os parâmetros entre '<>' especificam que esta interface trabalha com a entidade TaskModel
// e utiliza UUID como o tipo de identificador.

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
  List<TaskModel>  findByIdUser(UUID idUser); // lista todas as tarefas de um determinado usuário
  TaskModel findByIdAndIdUser(UUID id, UUID idUser);
}

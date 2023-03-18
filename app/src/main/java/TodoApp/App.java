package TodoApp;

import controller.ProjectController;
import controller.TaskController;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;
import util.ConnectionFactory;

public class App {

    public static void main(String[] args) throws SQLException {
        
        // CRIA UM NOVO PROJETO - OK
        /*
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("Tesde de Nome");
        project.setDescription("Teste de Descrição");
        projectController.save(project);
        */
        
        
        // ATUALIZA O PROJETO - OK
        /*
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        
        project.setId(1);
        project.setName("Novo nome do projeto");
        project.setDescription("Nova description");
        
        projectController.update(project);
        */
        

        // LISTA A QUANTIDADE DE PROJETOS - OK
        /*
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        List<Project> projects = projectController.getAll();
        System.out.println("Total de projetos: " + projects.size());
        */
        
        
        // DELETA UM PROJETO PELO ID - OK
        /*
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        
        projectController.removeById(2);
        */
        
        
        
        // CRIA UMA NOVA TASK - OK
        /*
        TaskController taskController = new TaskController();
        
        Task task = new Task();
        
        task.setIdProject(1);
        task.setName("Criar as telas da aplicação");
        task.setDescription("Devem ser criadas telas para os cadastros");
        task.setNotes("Sem notas");
        task.setIsCompleted(false);
        task.setDeadline(new Date());
        
        taskController.save(task);
        */
        
        
        // ATUALIZA A TASK - OK
        /*
        TaskController taskController = new TaskController();
        
        Task task = new Task();
        
        task.setId(1);
        task.setIdProject(1);
        task.setName("Alterar telas da aplicação");
        taskController.update(task);
        */
        
        
        // LISTA A QUANTIDADE DE TASKS DENTRO DE UM PROJETO
        /*
        TaskController taskController = new TaskController();
        
        Task task = new Task();
        
        List<Task> tasks = taskController.getAll(1);
        System.out.println("Total de tarefas: " + tasks.size());
        */
        
        
        // DELETA UMA TASK PELO ID
        /*
        TaskController taskController = new TaskController();
        
        Task task = new Task();
        
        taskController.removeById(1);
        */
    }
}

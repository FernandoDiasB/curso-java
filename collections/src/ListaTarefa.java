import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if (t.getDescricao() .equalsIgnoreCase(descricao)) {
                tarefaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaRemover);
    }

    public int obterNumeroDeTarefas(){
        return tarefaList.size();
    }
    
    public void descricaoTarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println(listaTarefa.obterNumeroDeTarefas());

        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        listaTarefa.adicionarTarefa("tarefa 3");

        System.out.println(listaTarefa.obterNumeroDeTarefas());

        System.out.println("lista de tarefas");
        listaTarefa.descricaoTarefa();
        
    }
}

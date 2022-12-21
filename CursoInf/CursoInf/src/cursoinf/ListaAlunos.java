/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoinf;

/**
 *
 * @author 040069
 */
public class ListaAlunos {

    private String nomeCurso;
    private int totalDeAulas;
    private Aluno lista[];
    private int count;

    public ListaAlunos(String nomeCurso, int totalDeAulas) {
        this.nomeCurso = nomeCurso;
        this.totalDeAulas = totalDeAulas;
        lista = new Aluno[20];
        count = 0;

    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getTotalDeAulas() {
        return totalDeAulas;
    }

    public void setTotalDeAulas(int totalDeAulas) {
        this.totalDeAulas = totalDeAulas;
    }

    public Aluno buscarAluno(int codigo) {
        for (int i = 0; i < count; i++) {
            if (codigo == lista[i].getCod()) {
                return lista[i];
            }
        }

        return null;
    }

    public void incluirAluno(Aluno al) throws Exception {
        if (count >= lista.length) {
            throw new RuntimeException("Lista lotada.");
        }

        if (buscarAluno(al.getCod()) != null) {
            throw new Exception("Código já existe na lista");
        }

        lista[count] = al;
        count++;
    }

    public void registrarFalta(int codigo) {
        Aluno al = buscarAluno(codigo);
        if (al == null) {
            throw new RuntimeException("Código não encontrado.");
        }

        al.registrarFalta();
    }

    public void atribuirNota(int codigo, double nota) throws NotaInvalidaExc {
        Aluno al = buscarAluno(codigo);
        if (al == null) {
            throw new RuntimeException("Código não encontrado.");
        }

        if (!al.atribuirNota(nota)) {
            throw new NotaInvalidaExc();
        }
    }

    public void listarAlunos() 
    {
        System.out.println("\nListagem geral --------------------+");
        System.out.println("Curso: " + nomeCurso);
        System.out.println("Total de aulas: " + totalDeAulas);
        for (int i = 0; i < count; i++) 
        {
            lista[i].print(totalDeAulas);
        }
    }

    public void listarAprovados() 
    {
        System.out.println("\nAlunos aprovados --------------------+");
        System.out.println("Curso: " + nomeCurso);
        System.out.println("Total de aulas: " + totalDeAulas);
        for (int i = 0; i < count; i++) 
        {
            if (lista[i].aprovado(totalDeAulas)) {
                lista[i].print(totalDeAulas);
            }
        }
    }
}

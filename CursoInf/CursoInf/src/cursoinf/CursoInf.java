/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoinf;

/**
 *
 * @author 040069
 */
public class CursoInf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ListaAlunos la= new ListaAlunos("POO", 20);
        
        try{
           la.incluirAluno(new Aluno(1, "José"));
           la.incluirAluno(new Aluno(2, "Maria"));
           la.incluirAluno(new Aluno(3, "Alberto"));
           la.incluirAluno(new Aluno(4, "Cláudia"));
           la.incluirAluno(new Aluno(5, "Fernanda"));
           
           la.registrarFalta(1);
           la.registrarFalta(1);
           la.atribuirNota(1, 8);
        }
        catch(RuntimeException exc)
        {
            System.out.println(exc);
        }
        catch(NotaInvalidaExc exc)
        {
            exc.printStackTrace();
        }
        catch(Exception exc)
        {
            System.out.println(exc.toString());
        }
        
        la.listarAlunos();
        
        la.listarAprovados();
    }
    
}

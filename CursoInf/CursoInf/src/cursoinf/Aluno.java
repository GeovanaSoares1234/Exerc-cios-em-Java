package cursoinf;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 040069
 */
public class Aluno 
{
    private int cod;
    private String nome;
    private double nota;
    private int faltas;

    public Aluno(int cod, String nome) 
    {
        this.cod = cod;
        this.nome = nome;
        nota= 0;
        faltas= 0;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void registrarFalta()
    {
        faltas++;
    }
    
    public boolean atribuirNota(double nota)
    {
        if(nota >= 1 && nota <= 10)
        {
            this.nota= nota;
            return true;
        }
        return false;
    }
    
    public double frequencia(int totalDeAulas)
    {
        return 100*(((double)totalDeAulas-faltas)/totalDeAulas);
    }
    
    public boolean aprovado(int totalDeAulas)
    {
        return (nota >= 6) && (frequencia(totalDeAulas) >= 75);
    }
    
    public void print(int totalDeAulas)
    {
        System.out.println(cod + " " + nome + " " + nota + " " + faltas + " " + frequencia(totalDeAulas) + "%");
    }
    
}

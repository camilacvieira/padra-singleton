public class Lider {
    private String nome;
    private String equipe;

    private Lider(){}
    private static Lider lider = new Lider();
    public static Lider getInstance(){
        return lider;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEquipe(){
        return equipe;
    }

    public void setEquipe(String equipe){
        this.equipe = equipe;
    }

}

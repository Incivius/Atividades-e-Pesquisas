 public class Carta{
    private EnumCarta nome;
    private EnumNaipe naipe;
    
     public Carta(EnumCarta nome, EnumNaipe naipe){
        this.nome = nome;
        this.naipe = naipe;
    }
    public void setNome(EnumCarta nome){
        this.nome = nome;
    }
    public EnumCarta getNome(){
        return nome;
    }
    public void setNaipe(EnumNaipe naipe){
        this.naipe = naipe;
    }
    public EnumNaipe getNaipe(){
        return naipe;
    }

    public String VerCarta(){
        return "Nome: " + this.nome + " Naipe: " + this.naipe;
    }

 }
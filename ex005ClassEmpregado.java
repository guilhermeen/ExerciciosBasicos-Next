public class Empregado(){
    private String nome;
    private String sobrenome;
    private int salario;
    public String identidade;

    //construtor inicializando todos os atributos
    public Empregado(String nome, String sobrenome, int salario){ 
        this.nome =nome;
        this.sobrenome=sobrenome;
        this.salario=salario;
    }
    //construtor sem inicializar nenhum atributo
    //public Empregado(){ 
      
    //}


    //Metodo para aumentar o salario em 10%
    public void aumento(salario){
        this.salario+=this.salario*0.10;
    }


    //Metodo para definir variavel como o nome +sobrenome
    public String getIdentidade(){
        return identidade;
    }
    public void setIdentidade(){
        identidade = (getNome()+getSobrenome());
    }
    
    
    
    //Metodos getters e setters 
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome =nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(){
        this.sobrenome=sobrenome;
    }

    public int getSalario(){
        return salario;
    }

    public void setSalario(){
        this.salario=salario;
    }
}

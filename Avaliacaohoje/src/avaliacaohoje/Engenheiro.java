package avaliacaohoje;


public class Engenheiro extends Funcionario{
    
    private String CREA;

    public Engenheiro() {
    }

    public Engenheiro(String CREA, String cpf, String rg, String matricula, Setor setor, double salario, int id, String nome, String telefone, String email, Endereço endereço) {
        super(cpf, rg, matricula, setor, salario, id, nome, telefone, email, endereço);
        this.CREA = CREA;
    }

     @Override
    public String toString() {
        return "\nrg: " + super.rg +  
               "\ncpf: " + super.cpf +
               "\nmatricula: " + super.matricula +
               "\nsetor: " + super.setor +
               "\nsalario: " + super.salario +
               "\nCREA: " + this.CREA +
               "\nid:" + super.id +
               "\nnome: " + super.nome +
               "\nlogradouro: " + super.endereço.logradouro +
               "\nnumero: " + super.endereço.numero +
               "\ncomplemento: " + super.endereço.complemento +
               "\ncep: " + super.endereço.cep +
               "\ncidade: " + super.endereço.cidade +
               "\nemail: " + super.email +
               "\ntelefone: " + super.telefone;
    }

    public String getCREA() {
        return CREA;
    }

    public void setCREA(String CREA) {
        this.CREA = CREA;
    }

   

   
    }


   

    
   
        
    
    
    
    
    
    

    
 



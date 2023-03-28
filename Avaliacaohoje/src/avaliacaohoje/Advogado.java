package avaliacaohoje;


public class Advogado extends Funcionario{
    
    private String OAB;

    public Advogado() {
    }

    public Advogado(String OAB, String cpf, String rg, String matricula, Setor setor, double salario, int id, String nome, String telefone, String email, Endereço endereço) {
        super(cpf, rg, matricula, setor, salario, id, nome, telefone, email, endereço);
        this.OAB = OAB;
    }

      @Override
    public String toString() {
        return "\nrg: " + super.rg +  
               "\ncpf: " + super.cpf +
               "\nmatricula: " + super.matricula +
               "\nsetor: " + super.setor +
               "\nsalario: " + super.salario +
               "\nOAB: " + this.OAB +
               "\nid:" + super.id +
               "\nnome: " + super.nome +
               "\nlogradouro: " + super.endereço.logradouro +
               "\nnumero: " + super.endereço.numero +
               "\ncomplemento: " + super.endereço.complemento +
               "\ncep: " + super.endereço.cep +
               "\nuf: " + super.endereço.unidadeFederativa +
               "\ncidade: " + super.endereço.cidade +
               "\ntelefone: " + super.telefone +
               "\nemail: " + super.email;
   
    }

    public String getOAB() {
        return OAB;
    }

    public void setOAB(String OAB) {
        this.OAB = OAB;
    }
   
   
   

    
}

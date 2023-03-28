package avaliacaohoje;


public class Medico extends Funcionario{
    
   private String CRM;

    public Medico() {
    }

    public Medico(String CRM, String cpf, String rg, String matricula, Setor setor, double salario, int id, String nome, String telefone, String email, Endereço endereço) {
        super(cpf, rg, matricula, setor, salario, id, nome, telefone, email, endereço);
        this.CRM = CRM;
    }

   
    @Override
    public String toString() {
        return "\nrg: " + super.rg +  
               "\ncpf: " + super.cpf +
               "\nmatricula: " + super.matricula +
               "\nsetor: " + super.setor +
               "\nsalario: " + super.salario +
               "\nCRM: " + this.CRM +
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

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }


   

   
  
}

package avaliacaohoje;

public class Main {
    
    public static void main(String[] args) {
        
    
    Medico medico = new Medico("CRM", "0245871369", "51698472476","6546747981", Setor.SAUDE, 1478, 8596,"Jenifer"," 33164415","jenifersant222hotmailcom", new Endereço("Rua dos Alagados","80","acima da escadinha"," 40430150"," SãoPaulo", UnidadeFederativa.MINAS_GERAIS));
    
    Advogado advogado = new Advogado("OAB",  "0245871369", "51698472476","6546747981", Setor.JURIDICO, 1478, 8596,"Jenifer"," 33164414","jenifersant222hotmailcom", new Endereço("Rua dos Alagados","80","acima da escadinha"," 40430150"," SãoPaulo", UnidadeFederativa.ACRE));
    
    Engenheiro engenheiro = new Engenheiro("CREA", "0245871369", "51698472476","6546747981", Setor.ENGENHARIA,1478, 8596,"Jenifer"," 33164414","jenifersant222hotmailcom", new Endereço("Rua dos Alagados","80","acima da escadinha"," 40430150"," SãoPaulo", UnidadeFederativa.ALAGOAS));
    
    Cliente cliente = new Cliente(874125963);

    }
}
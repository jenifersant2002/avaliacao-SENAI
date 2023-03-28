
package avaliacaohoje;


public class Cliente {
    
    private int protocoloAtendimento;

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" + "protocoloAtendimento=" + protocoloAtendimento + '}';
    }


    public Cliente(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    
}

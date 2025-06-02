package aula05;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos Especiais - Construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }
    
    // Métodos Especiais - GETTER E SETTER
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public final void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public final void setStatus(boolean status) {
        this.status = status;
    }

    //Métodos
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)){
            this.setSaldo(50);
        System.out.println("Conta aberta com sucesso!");        
        }else if ("CP".equals(t)){
            this.setSaldo(150);
        System.out.println("Conta aberta com sucesso!"); 
        }
    }
    
    public void fecharConta(int setSaldo){
        if(setSaldo > 0){
            System.out.println("Conta com dinheiro");
        }else if(setSaldo <0){
            System.out.println("Conta em débito");
        }else{
        setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else{
            System.out.println("Impossível Depositar!");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de "+this.getDono());
            }else
                System.out.println("Saldo Insuficiente");
            }else{
                System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    public void pagarMensal(){
        int v=0;
        if("CC".equals(this.getTipo())){
            v = 12;
        } else if("CP".equals(this.getTipo())){
            v = 20;
        }
        if (this.getStatus()){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " +this.getDono());
            }else{
                System.out.println("Impossível pagar");
            }
    }

    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("Conta: " +this.getNumConta());
        System.out.println("Tipo: " +this.getTipo());
        System.out.println("Dono: " +this.getDono());
        System.out.println("Saldo: " +this.getSaldo());
        System.out.println("Status: " +this.getStatus());
    }
    
}
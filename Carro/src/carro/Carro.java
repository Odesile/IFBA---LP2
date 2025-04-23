package carro;
public class Carro {
    private String modelo;
    private String marca;
    private String data;
    private String cor;
    private float velocidade;
    
    //Getter e Setter do modelo
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String mod){
        this.modelo = mod;
    }
    
    //Getter e Setter da marca
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String mar){
        this.marca = mar;
    }
    
    //Getter e Setter da data
    public String getData(){
        return this.data;
    }
    public void setData(String date){
        this.data = date;
    }
    
    //Getter e Setter da cor
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    
    //Getter da velocidade
    public float getVelocidade(){
        return this.velocidade;
    }
    
    public void Acelera(int valor){
        if (valor == 1 && this.velocidade >= 0) {
            this.velocidade = this.velocidade + 5;
        }else if (valor == 0 && this.velocidade >= 0) {
            this.velocidade = this.velocidade - 5;
        }else{
            System.out.println("Entre somente com valores 1 para acelerar e 0 para freiar!!");
        }
    }
    
    public void Freiar(){
        this.velocidade = 0;
    }
    
}

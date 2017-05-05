package microanalitica;

public class Pixel {
    
    int Rojo;
    int Verde;
    int Azul;
    
    int validar(int x){
        if(x<0||x>255){
            x=128;   
        }
        return x;
    }

    public int getRojo() {
        return Rojo;
    }
    
    public int getVerde() {
        return Verde;
    }
    
    public int getAzul() {
        return Azul;
    }

    public void setRojo(int Rojo) {
        this.Rojo=validar(Rojo);
        this.Rojo=Rojo;
    }

    public void setVerde(int Verde) {
        
        this.Verde=validar(Verde);
        this.Verde=Verde;
    }

    public void setAzul(int Azul) {
        this.Azul=validar(Azul);
        this.Azul=Azul;
    }
    
}
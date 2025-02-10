package agregacao;

class Status {
     String categoria; 
     int iventario;
     int vida;
     int pontos; 
     int forca; 
     String habilidade; 
     String status;

     Status(){
          this.categoria="default";
          this.iventario=50; 
          this.vida=100;
          this.pontos=1000;
          this.forca=100;
          this.habilidade="default";
          this.status="none";
     }
}

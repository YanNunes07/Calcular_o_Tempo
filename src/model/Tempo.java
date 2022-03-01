package model;

public class Tempo {
   public int segundos;
   public int minutos;
   public int horas;

   public int tempoEmHoras(){
       return this.segundos/3600;
   }

   public int tempoEmMinutos(){
       return this.segundos/60;
   }

   public int tempoEmSegundos(){
       return this.segundos-(horas * 3600)-(minutos * 60);
   }



    public String mostarDados(){
       return "\nHoras: "+this.tempoEmHoras()+
               "\nMinutos: "+this.tempoEmMinutos()+
                "\nSegundos:" +this.tempoEmSegundos();


    }
}

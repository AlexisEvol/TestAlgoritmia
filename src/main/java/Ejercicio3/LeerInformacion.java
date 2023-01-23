package Ejercicio3;

public class LeerInformacion {
    
    public int getHorasExtra(int horas){
        
        if(horas > 40){
            return horas-40;
        }
        return 0;
    }
    public double getPrecioFinal(int horas, int horasExtra, int precioHora){
        double costeHorasExtra = 0;
        int horasNoExtra = horas;
        
        if(horasExtra > 0){
            costeHorasExtra = (precioHora*1.5)*horasExtra;
            horasNoExtra = horas - horasExtra;
        }
        double sueldoSemanal = (horasNoExtra*precioHora)+costeHorasExtra;
        return sueldoSemanal*4;
    }
}

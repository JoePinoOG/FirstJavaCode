
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aprendiendo;


/**
 *
 * @author vina
 */
public class Auto {
    
    
//atributos
    private String marca,modelo,nacionalidad;
    private int km;
    private boolean tuning,automatico;
    
    
//constructores

    public Auto(String marca, String modelo, String nacionalidad, int km, boolean tuning, boolean automatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.setNacionalidad(nacionalidad);
        this.km = km;
        this.tuning = tuning;
        this.automatico = automatico;
    }

    public Auto() {
    }
    
//getter and setter accesadores
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        if (nacionalidad.equalsIgnoreCase("CHINO")){
        
        }
        else{
        this.nacionalidad=nacionalidad;
        }
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isTuning() {
        return tuning;
    }

    public void setTuning(boolean tuning) {
        this.tuning = tuning;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }
    
//TEST
    @Override
    public String toString() {
        System.out.println("informacion vehiculo:");
        return "||"+"marca:" + marca + ", modelo:" + modelo + ", nacionalidad:" + nacionalidad + ", km:" + km + ", tuning:" + tuning + ", transmision:" + automatico+"||" ;
    }
//CUSTOMERS
    //60KM O MAS CAMBIAR BUJIA
    public void cambioBJ(){
        if(km>=60_000){
            System.out.println("-el vehiculo necesita cambiar las bujias");
       
        }
        else{
            System.out.println("-el vehiculo aguanta otros km antes del cambio de bujias");
        }
       
    }
    //transmision
    public void tipoTransmision(){
        if(isAutomatico()==false){
            System.out.println("-el vehiculo es manual");
        }
        else{
            System.out.println("-el vehiculo es automatico");
        }
        
    }
    //vehiculonuevo
    public void cantidadKm(){
    if(km==0){
        System.out.println("-el vehiculo es nuevo");
        
    }
    else{
        System.out.println("-el vehiculo es usado");
    }
    }
    public void chino(){
    if (nacionalidad==null){
        System.out.println("-NO TRABAJAMOS CHINOS");
    }
        
    }
}


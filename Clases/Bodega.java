package Clases;

import java.sql.Date;

public class Bodega {
    public String coordenadasUbicacion[];
    public String descripcion;
    public String historia;
    public String nombre;
    public Date periodoActualizacion;
    public RegionVitivinicola regionVitivinicola;

    public void contarResena(){}
    public void mostrarTodosVinos(){}
    public void getBodega(){}
    public String[] getCoordenadasUbicacion() {
        return coordenadasUbicacion;
    }
    public void setCoordenadasUbicacion(String[] coordenadasUbicacion) {
        this.coordenadasUbicacion = coordenadasUbicacion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getHistoria() {
        return historia;
    }
    public void setHistoria(String historia) {
        this.historia = historia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getPeriodoActualizacion() {
        return periodoActualizacion;
    }
    public void setPeriodoActualizacion(Date periodoActualizacion) {
        this.periodoActualizacion = periodoActualizacion;
    }
    public RegionVitivinicola getRegionVitivinicola() {
        return regionVitivinicola;
    }
    public void setRegionVitivinicola(RegionVitivinicola regionVitivinicola) {
        this.regionVitivinicola = regionVitivinicola;
    }
}


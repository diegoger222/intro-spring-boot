package com.example.introspringboot.models.VidrIoclasses;


import jakarta.persistence.*;

import lombok.Data;
@Entity
@Data // genera los gets y sets de forma automnatica
@Table(name = "contenedoresvidrio")
public class VidrioModel {
    
    //Con estas etiquetas nombramos el id para que se genere se incremente sea unico no nulo y que lo reconozca la base de datos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;


    private Long objectid;
    private Long id1;
    private String sector;
    private String zona;
    private String anyo;
    private String tipovia;
    private String calleempre;
    private Long numportal;
    private Long unidades;
    private String modelo;
    private Long capacidad;
    private String fijacion;
    private String ubicacion;
    private String observacio;
    private String productor;
    private String tipo;
    private String repaso;
    private String empresa;
    private String globalid;
    private GeoShape geo_shape; //esto puede ser una clase mas amplia
    private GeoPoint2D geo_point_2d; // contiene longitud y latitud

    // click derecho source Actions/ generar get and sets
    // mirar Lombok para facilitar el codigo
}

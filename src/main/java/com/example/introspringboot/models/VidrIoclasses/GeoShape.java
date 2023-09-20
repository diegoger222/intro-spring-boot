package com.example.introspringboot.models.VidrIoclasses;

import lombok.Data;

@Data
public class GeoShape {
    private String type;
    private Geometry geometry;
    private String properties;
}

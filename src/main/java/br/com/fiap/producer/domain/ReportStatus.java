package br.com.fiap.producer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true)
public class ReportStatus implements Serializable {

    private String idDrone;
    private double latitude;
    private double longitude;
    private int temperatura;
    private int umidade;

}

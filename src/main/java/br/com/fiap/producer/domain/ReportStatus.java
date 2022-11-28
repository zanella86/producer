package br.com.fiap.producer.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString(includeFieldNames = true)
public class ReportStatus implements Serializable {

    private String idDrone;
    private String latitude;
    private String longitude;
    private int temperatura;
    private int umidade;

}

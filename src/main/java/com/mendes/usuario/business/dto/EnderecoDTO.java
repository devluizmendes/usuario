package com.mendes.usuario.business.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class EnderecoDTO {
    private String rua;
    private String numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;
}

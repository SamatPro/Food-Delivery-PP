package ru.itis.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrderResponse implements Serializable {

    @JsonProperty("orderId")
    private Long orderId;

    @JsonProperty("isValidate")
    private boolean isValidate;
}
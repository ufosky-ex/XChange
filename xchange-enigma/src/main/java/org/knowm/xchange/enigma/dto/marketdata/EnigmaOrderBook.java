package org.knowm.xchange.enigma.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.knowm.xchange.enigma.dto.BaseResponse;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class EnigmaOrderBook extends BaseResponse {

  @JsonProperty("timestamp")
  private Date timestamp;

  @JsonProperty("bids")
  private List<List<BigDecimal>> bids;

  @JsonProperty("asks")
  private List<List<BigDecimal>> asks;

}

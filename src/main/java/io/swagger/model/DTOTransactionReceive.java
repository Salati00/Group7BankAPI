package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DTOTransactionReceive
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-02T15:38:47.810Z[GMT]")


public class DTOTransactionReceive   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("Date")
  private String date = null;

  @JsonProperty("Amount")
  private BigDecimal amount = null;

  @JsonProperty("To")
  private String to = null;

  @JsonProperty("From")
  private String from = null;

  @JsonProperty("UserPerformingID")
  private Integer userPerformingID = null;

  public DTOTransactionReceive id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "1234", required = true, description = "")
      @NotNull

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DTOTransactionReceive date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(example = "01/01/2000", description = "")
  
    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public DTOTransactionReceive amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(example = "123.45", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public DTOTransactionReceive to(String to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
   **/
  @Schema(example = "NL91 ABNA 0417 1643 00", required = true, description = "")
      @NotNull

    public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public DTOTransactionReceive from(String from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
   **/
  @Schema(example = "NL91 ABNA 0417 1643 00", required = true, description = "")
      @NotNull

    public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public DTOTransactionReceive userPerformingID(Integer userPerformingID) {
    this.userPerformingID = userPerformingID;
    return this;
  }

  /**
   * Get userPerformingID
   * @return userPerformingID
   **/
  @Schema(example = "54398", required = true, description = "")
      @NotNull

    public Integer getUserPerformingID() {
    return userPerformingID;
  }

  public void setUserPerformingID(Integer userPerformingID) {
    this.userPerformingID = userPerformingID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DTOTransactionReceive dtOTransactionReceive = (DTOTransactionReceive) o;
    return Objects.equals(this.id, dtOTransactionReceive.id) &&
        Objects.equals(this.date, dtOTransactionReceive.date) &&
        Objects.equals(this.amount, dtOTransactionReceive.amount) &&
        Objects.equals(this.to, dtOTransactionReceive.to) &&
        Objects.equals(this.from, dtOTransactionReceive.from) &&
        Objects.equals(this.userPerformingID, dtOTransactionReceive.userPerformingID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, amount, to, from, userPerformingID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DTOTransactionReceive {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    userPerformingID: ").append(toIndentedString(userPerformingID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AccountType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DTOAccountReceive
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-02T15:38:47.810Z[GMT]")


public class DTOAccountReceive   {
  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("balance")
  private BigDecimal balance = null;

  @JsonProperty("Absolutelimit")
  private BigDecimal absolutelimit = null;

  @JsonProperty("AccountType")
  private AccountType accountType = null;

  @JsonProperty("UserId")
  private Integer userId = null;

  @JsonProperty("Disabled")
  private Boolean disabled = false;

  public DTOAccountReceive iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * Get iban
   * @return iban
   **/
  @Schema(example = "NL91 ABNA 0417 1643 00", description = "")
  
    public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public DTOAccountReceive balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
   **/
  @Schema(example = "5000", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public DTOAccountReceive absolutelimit(BigDecimal absolutelimit) {
    this.absolutelimit = absolutelimit;
    return this;
  }

  /**
   * Get absolutelimit
   * @return absolutelimit
   **/
  @Schema(example = "0", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getAbsolutelimit() {
    return absolutelimit;
  }

  public void setAbsolutelimit(BigDecimal absolutelimit) {
    this.absolutelimit = absolutelimit;
  }

  public DTOAccountReceive accountType(AccountType accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public AccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }

  public DTOAccountReceive userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @Schema(example = "123", description = "")
  
    public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public DTOAccountReceive disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Get disabled
   * @return disabled
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DTOAccountReceive dtOAccountReceive = (DTOAccountReceive) o;
    return Objects.equals(this.iban, dtOAccountReceive.iban) &&
        Objects.equals(this.balance, dtOAccountReceive.balance) &&
        Objects.equals(this.absolutelimit, dtOAccountReceive.absolutelimit) &&
        Objects.equals(this.accountType, dtOAccountReceive.accountType) &&
        Objects.equals(this.userId, dtOAccountReceive.userId) &&
        Objects.equals(this.disabled, dtOAccountReceive.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, balance, absolutelimit, accountType, userId, disabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DTOAccountReceive {\n");
    
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    absolutelimit: ").append(toIndentedString(absolutelimit)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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

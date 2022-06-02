package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Role;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DTOUserReceive
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-02T15:38:47.810Z[GMT]")


public class DTOUserReceive   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private BigDecimal phone = null;

  @JsonProperty("transactionLimit")
  private BigDecimal transactionLimit = null;

  @JsonProperty("dailylimit")
  private BigDecimal dailylimit = null;

  @JsonProperty("roles")
  @Valid
  private List<Role> roles = null;

  public DTOUserReceive id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "1", required = true, description = "")
      @NotNull

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DTOUserReceive username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @Schema(example = "login credentials", required = true, description = "")
      @NotNull

    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public DTOUserReceive firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   **/
  @Schema(example = "Gigi", description = "")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public DTOUserReceive lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   **/
  @Schema(example = "D'alessio", description = "")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public DTOUserReceive email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(example = "gigidalessio@gmail.it", required = true, description = "")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public DTOUserReceive phone(BigDecimal phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   **/
  @Schema(example = "34595603123", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getPhone() {
    return phone;
  }

  public void setPhone(BigDecimal phone) {
    this.phone = phone;
  }

  public DTOUserReceive transactionLimit(BigDecimal transactionLimit) {
    this.transactionLimit = transactionLimit;
    return this;
  }

  /**
   * Get transactionLimit
   * @return transactionLimit
   **/
  @Schema(example = "99999", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getTransactionLimit() {
    return transactionLimit;
  }

  public void setTransactionLimit(BigDecimal transactionLimit) {
    this.transactionLimit = transactionLimit;
  }

  public DTOUserReceive dailylimit(BigDecimal dailylimit) {
    this.dailylimit = dailylimit;
    return this;
  }

  /**
   * Get dailylimit
   * @return dailylimit
   **/
  @Schema(example = "9999", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getDailylimit() {
    return dailylimit;
  }

  public void setDailylimit(BigDecimal dailylimit) {
    this.dailylimit = dailylimit;
  }

  public DTOUserReceive roles(List<Role> roles) {
    this.roles = roles;
    return this;
  }

  public DTOUserReceive addRolesItem(Role rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<Role>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
   **/
  @Schema(description = "")
      @Valid
    public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DTOUserReceive dtOUserReceive = (DTOUserReceive) o;
    return Objects.equals(this.id, dtOUserReceive.id) &&
        Objects.equals(this.username, dtOUserReceive.username) &&
        Objects.equals(this.firstName, dtOUserReceive.firstName) &&
        Objects.equals(this.lastName, dtOUserReceive.lastName) &&
        Objects.equals(this.email, dtOUserReceive.email) &&
        Objects.equals(this.phone, dtOUserReceive.phone) &&
        Objects.equals(this.transactionLimit, dtOUserReceive.transactionLimit) &&
        Objects.equals(this.dailylimit, dtOUserReceive.dailylimit) &&
        Objects.equals(this.roles, dtOUserReceive.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, firstName, lastName, email, phone, transactionLimit, dailylimit, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DTOUserReceive {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    transactionLimit: ").append(toIndentedString(transactionLimit)).append("\n");
    sb.append("    dailylimit: ").append(toIndentedString(dailylimit)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

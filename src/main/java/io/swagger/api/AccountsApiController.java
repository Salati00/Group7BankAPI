package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.DTOAccountReceive;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-02T15:38:47.810Z[GMT]")
@RestController
public class AccountsApiController implements AccountsApi {

    private static final Logger log = LoggerFactory.getLogger(AccountsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AccountsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<DTOAccountReceive> createcurrentaccount(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Minimum Value that the account can hold" ,required=true,schema=@Schema( defaultValue="0")) @Valid @RequestParam(value = "Absolute limit", required = true, defaultValue="0") BigDecimal absoluteLimit,@Parameter(in = ParameterIn.QUERY, description = "ID of the user for which to make an account" ,schema=@Schema()) @Valid @RequestParam(value = "User ID", required = false) Integer userID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DTOAccountReceive>(objectMapper.readValue("{\n  \"balance\" : 5000,\n  \"Absolutelimit\" : 0,\n  \"UserId\" : 123,\n  \"iban\" : \"NL91 ABNA 0417 1643 00\",\n  \"Disabled\" : false,\n  \"AccountType\" : \"Currentaccount\"\n}", DTOAccountReceive.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DTOAccountReceive>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DTOAccountReceive>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteaccount(@Parameter(in = ParameterIn.PATH, description = "The ID of the account that needs to be deleted", required=true, schema=@Schema()) @PathVariable("iban") String iban) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> depositMoney(@Parameter(in = ParameterIn.QUERY, description = "Amount of money to deposit" ,schema=@Schema()) @Valid @RequestParam(value = "Amount", required = false) BigDecimal amount) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DTOAccountReceive> getAccountByIban(@Parameter(in = ParameterIn.PATH, description = "Iban of account to return", required=true, schema=@Schema()) @PathVariable("iban") String iban) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DTOAccountReceive>(objectMapper.readValue("{\n  \"balance\" : 5000,\n  \"Absolutelimit\" : 0,\n  \"UserId\" : 123,\n  \"iban\" : \"NL91 ABNA 0417 1643 00\",\n  \"Disabled\" : false,\n  \"AccountType\" : \"Currentaccount\"\n}", DTOAccountReceive.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DTOAccountReceive>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DTOAccountReceive>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DTOAccountReceive> updateAccount(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Minimum Value that the account can hold" ,required=true,schema=@Schema( defaultValue="0")) @Valid @RequestParam(value = "Absolute limit", required = true, defaultValue="0") BigDecimal absoluteLimit,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Whether the account has been disabled for soft deletion" ,required=true,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "Disabled", required = true, defaultValue="false") Boolean disabled,@Parameter(in = ParameterIn.PATH, description = "The ID of the account that needs to be deleted", required=true, schema=@Schema()) @PathVariable("iban") String iban) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DTOAccountReceive>(objectMapper.readValue("{\n  \"balance\" : 5000,\n  \"Absolutelimit\" : 0,\n  \"UserId\" : 123,\n  \"iban\" : \"NL91 ABNA 0417 1643 00\",\n  \"Disabled\" : false,\n  \"AccountType\" : \"Currentaccount\"\n}", DTOAccountReceive.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DTOAccountReceive>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DTOAccountReceive>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> withdrawMoney(@Parameter(in = ParameterIn.QUERY, description = "Amount of money to withdraw" ,schema=@Schema()) @Valid @RequestParam(value = "Amount", required = false) BigDecimal amount) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}

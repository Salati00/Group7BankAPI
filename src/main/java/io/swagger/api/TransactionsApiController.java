package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.DTOTransactionReceive;
import io.swagger.model.DTOTransactionSend;
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
public class TransactionsApiController implements TransactionsApi {

    private static final Logger log = LoggerFactory.getLogger(TransactionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TransactionsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<DTOTransactionReceive> getTransferById(@Parameter(in = ParameterIn.PATH, description = "Numeric id of the transaction to get", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DTOTransactionReceive>(objectMapper.readValue("{\n  \"UserPerformingID\" : 54398,\n  \"Amount\" : 123.45,\n  \"id\" : 1234,\n  \"To\" : \"NL91 ABNA 0417 1643 00\",\n  \"From\" : \"NL91 ABNA 0417 1643 00\",\n  \"Date\" : \"01/01/2000\"\n}", DTOTransactionReceive.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DTOTransactionReceive>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DTOTransactionReceive>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<DTOTransactionReceive>> getTransfers(@Parameter(in = ParameterIn.QUERY, description = "amount of transactions to return" ,schema=@Schema()) @Valid @RequestParam(value = "count", required = false) Integer count,@Parameter(in = ParameterIn.QUERY, description = "amount of transactions to skip" ,schema=@Schema()) @Valid @RequestParam(value = "skip", required = false) Integer skip,@Parameter(in = ParameterIn.QUERY, description = "value of transaction" ,schema=@Schema()) @Valid @RequestParam(value = "value", required = false) BigDecimal value,@Parameter(in = ParameterIn.QUERY, description = "iban of account whose transactions to retrieve" ,schema=@Schema()) @Valid @RequestParam(value = "iban", required = false) String iban,@Parameter(in = ParameterIn.QUERY, description = "start date of transactions to return" ,schema=@Schema()) @Valid @RequestParam(value = "startDate", required = false) String startDate,@Parameter(in = ParameterIn.QUERY, description = "final date of transaction to return" ,schema=@Schema()) @Valid @RequestParam(value = "endDate", required = false) String endDate) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<DTOTransactionReceive>>(objectMapper.readValue("[ {\n  \"UserPerformingID\" : 54398,\n  \"Amount\" : 123.45,\n  \"id\" : 1234,\n  \"To\" : \"NL91 ABNA 0417 1643 00\",\n  \"From\" : \"NL91 ABNA 0417 1643 00\",\n  \"Date\" : \"01/01/2000\"\n}, {\n  \"UserPerformingID\" : 54398,\n  \"Amount\" : 123.45,\n  \"id\" : 1234,\n  \"To\" : \"NL91 ABNA 0417 1643 00\",\n  \"From\" : \"NL91 ABNA 0417 1643 00\",\n  \"Date\" : \"01/01/2000\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<DTOTransactionReceive>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<DTOTransactionReceive>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<DTOTransactionReceive>> transferMoney(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody DTOTransactionSend body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<DTOTransactionReceive>>(objectMapper.readValue("[ {\n  \"UserPerformingID\" : 54398,\n  \"Amount\" : 123.45,\n  \"id\" : 1234,\n  \"To\" : \"NL91 ABNA 0417 1643 00\",\n  \"From\" : \"NL91 ABNA 0417 1643 00\",\n  \"Date\" : \"01/01/2000\"\n}, {\n  \"UserPerformingID\" : 54398,\n  \"Amount\" : 123.45,\n  \"id\" : 1234,\n  \"To\" : \"NL91 ABNA 0417 1643 00\",\n  \"From\" : \"NL91 ABNA 0417 1643 00\",\n  \"Date\" : \"01/01/2000\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<DTOTransactionReceive>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<DTOTransactionReceive>>(HttpStatus.NOT_IMPLEMENTED);
    }

}

package io.swagger.api;

import io.swagger.model.BearerTokenDto;
import io.swagger.model.DTOAccountReceive;
import io.swagger.model.DTOUserReceive;
import io.swagger.model.DTOUserSend;
import io.swagger.model.LoginDto;
import io.swagger.model.User;
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
public class UsersApiController implements UsersApi {

    private static final Logger log = LoggerFactory.getLogger(UsersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UsersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<DTOUserSend> createUser(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody DTOUserSend body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DTOUserSend>(objectMapper.readValue("{\n  \"firstName\" : \"Gigi\",\n  \"lastName\" : \"D'alessio\",\n  \"phone\" : 34595603123,\n  \"roles\" : [ \"User\", \"User\" ],\n  \"dailylimit\" : 9999,\n  \"transactionLimit\" : 99999,\n  \"email\" : \"gigidalessio@gmail.it\",\n  \"username\" : \"login credentials\"\n}", DTOUserSend.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DTOUserSend>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DTOUserSend>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteUserById(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DTOAccountReceive> getAllAcountsFromTheUser(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id) {
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

    public ResponseEntity<List<DTOUserReceive>> getAllUsers(@NotNull @Min(20L) @Max(50L) @Parameter(in = ParameterIn.QUERY, description = "the limit to get number of users" ,required=true,schema=@Schema(allowableValues={  }, minimum="20", maximum="50"
)) @Valid @RequestParam(value = "limit", required = true) Long limit,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "email", required = true) String email,@Parameter(in = ParameterIn.QUERY, description = "the user name to be searched" ,schema=@Schema()) @Valid @RequestParam(value = "lastName", required = false) String lastName,@Min(1L)@Parameter(in = ParameterIn.QUERY, description = "the userId to be fetched" ,schema=@Schema(allowableValues={  }, minimum="1"
)) @Valid @RequestParam(value = "userId", required = false) Long userId,@Min(0)@Parameter(in = ParameterIn.QUERY, description = "The number of items to skip before starting to collect the result set." ,schema=@Schema(allowableValues={  }
)) @Valid @RequestParam(value = "offset", required = false) Integer offset,@Min(10) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "The maximum number of items to return." ,schema=@Schema(allowableValues={  }, minimum="10", maximum="50"
, defaultValue="10")) @Valid @RequestParam(value = "max", required = false, defaultValue="10") Integer max) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<DTOUserReceive>>(objectMapper.readValue("[ {\n  \"firstName\" : \"Gigi\",\n  \"lastName\" : \"D'alessio\",\n  \"phone\" : 34595603123,\n  \"roles\" : [ \"User\", \"User\" ],\n  \"dailylimit\" : 9999,\n  \"id\" : 1,\n  \"transactionLimit\" : 99999,\n  \"email\" : \"gigidalessio@gmail.it\",\n  \"username\" : \"login credentials\"\n}, {\n  \"firstName\" : \"Gigi\",\n  \"lastName\" : \"D'alessio\",\n  \"phone\" : 34595603123,\n  \"roles\" : [ \"User\", \"User\" ],\n  \"dailylimit\" : 9999,\n  \"id\" : 1,\n  \"transactionLimit\" : 99999,\n  \"email\" : \"gigidalessio@gmail.it\",\n  \"username\" : \"login credentials\"\n}, {\n  \"firstName\" : \"Gigi\",\n  \"lastName\" : \"D'alessio\",\n  \"phone\" : 34595603123,\n  \"roles\" : [ \"User\", \"User\" ],\n  \"dailylimit\" : 9999,\n  \"id\" : 1,\n  \"transactionLimit\" : 99999,\n  \"email\" : \"gigidalessio@gmail.it\",\n  \"username\" : \"login credentials\"\n}, {\n  \"firstName\" : \"Gigi\",\n  \"lastName\" : \"D'alessio\",\n  \"phone\" : 34595603123,\n  \"roles\" : [ \"User\", \"User\" ],\n  \"dailylimit\" : 9999,\n  \"id\" : 1,\n  \"transactionLimit\" : 99999,\n  \"email\" : \"gigidalessio@gmail.it\",\n  \"username\" : \"login credentials\"\n}, {\n  \"firstName\" : \"Gigi\",\n  \"lastName\" : \"D'alessio\",\n  \"phone\" : 34595603123,\n  \"roles\" : [ \"User\", \"User\" ],\n  \"dailylimit\" : 9999,\n  \"id\" : 1,\n  \"transactionLimit\" : 99999,\n  \"email\" : \"gigidalessio@gmail.it\",\n  \"username\" : \"login credentials\"\n}, {\n  \"firstName\" : \"Gigi\",\n  \"lastName\" : \"D'alessio\",\n  \"phone\" : 34595603123,\n  \"roles\" : [ \"User\", \"User\" ],\n  \"dailylimit\" : 9999,\n  \"id\" : 1,\n  \"transactionLimit\" : 99999,\n  \"email\" : \"gigidalessio@gmail.it\",\n  \"username\" : \"login credentials\"\n}, {\n  \"firstName\" : \"Gigi\",\n  \"lastName\" : \"D'alessio\",\n  \"phone\" : 34595603123,\n  \"roles\" : [ \"User\", \"User\" ],\n  \"dailylimit\" : 9999,\n  \"id\" : 1,\n  \"transactionLimit\" : 99999,\n  \"email\" : \"gigidalessio@gmail.it\",\n  \"username\" : \"login credentials\"\n}, {\n  \"firstName\" : \"Gigi\",\n  \"lastName\" : \"D'alessio\",\n  \"phone\" : 34595603123,\n  \"roles\" : [ \"User\", \"User\" ],\n  \"dailylimit\" : 9999,\n  \"id\" : 1,\n  \"transactionLimit\" : 99999,\n  \"email\" : \"gigidalessio@gmail.it\",\n  \"username\" : \"login credentials\"\n}, {\n  \"firstName\" : \"Gigi\",\n  \"lastName\" : \"D'alessio\",\n  \"phone\" : 34595603123,\n  \"roles\" : [ \"User\", \"User\" ],\n  \"dailylimit\" : 9999,\n  \"id\" : 1,\n  \"transactionLimit\" : 99999,\n  \"email\" : \"gigidalessio@gmail.it\",\n  \"username\" : \"login credentials\"\n}, {\n  \"firstName\" : \"Gigi\",\n  \"lastName\" : \"D'alessio\",\n  \"phone\" : 34595603123,\n  \"roles\" : [ \"User\", \"User\" ],\n  \"dailylimit\" : 9999,\n  \"id\" : 1,\n  \"transactionLimit\" : 99999,\n  \"email\" : \"gigidalessio@gmail.it\",\n  \"username\" : \"login credentials\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<DTOUserReceive>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<DTOUserReceive>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DTOUserReceive> getUserById(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DTOUserReceive>(objectMapper.readValue("{\n  \"firstName\" : \"Gigi\",\n  \"lastName\" : \"D'alessio\",\n  \"phone\" : 34595603123,\n  \"roles\" : [ \"User\", \"User\" ],\n  \"dailylimit\" : 9999,\n  \"id\" : 1,\n  \"transactionLimit\" : 99999,\n  \"email\" : \"gigidalessio@gmail.it\",\n  \"username\" : \"login credentials\"\n}", DTOUserReceive.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DTOUserReceive>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DTOUserReceive>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<BearerTokenDto> loginUser(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody LoginDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BearerTokenDto>(objectMapper.readValue("{\n  \"bearerToken\" : \"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJsb2dnZWRJbkFzIjoiYWRtaW4iLCJpYXQiOjE0MjI3Nzk2Mzh9.gzSraSYS8EXBxLN_oWnFSRgCzcmJmMjLiuyu5CSpyHI\"\n}", BearerTokenDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BearerTokenDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BearerTokenDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> updateUserById(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody DTOUserReceive body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\n  \"Role\" : \"User\",\n  \"firstName\" : \"John\",\n  \"lastName\" : \"Doe\",\n  \"phone\" : \"0612345678\",\n  \"dailylimit\" : 10000,\n  \"id\" : 123,\n  \"transactionLimit\" : 10000,\n  \"email\" : \"JohnDoe123@hotmail.com\",\n  \"username\" : \"JohnDoe123\"\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

}

package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ReportApiService;
import io.swagger.api.factories.ReportApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.ReportItem;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import javax.validation.constraints.*;


@Path("/report")


@io.swagger.annotations.Api(description = "the report API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-21T18:46:33.206Z[GMT]")

public class ReportApi  {
   private final ReportApiService delegate;

   public ReportApi(@Context ServletConfig servletContext) {
      ReportApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ReportApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ReportApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ReportApiServiceFactory.getReportApi();
      }

      this.delegate = delegate;
   }


    @POST
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "add a new report in system", notes = "add a new report in system", response = Void.class, tags={ "Report", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Report created", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid Report Input", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Report already exist", response = Void.class) })
    public Response addReport(@ApiParam(value = "Report to store" ,required=true) ReportItem body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addReport(body,securityContext);
    }

    @DELETE
    @Path("/{reportId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a report", notes = "", response = Void.class, tags={ "Report", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Report not found", response = Void.class) })
    public Response deleteReport(@ApiParam(value = "Report id to delete",required=true) @PathParam("reportId") Long reportId
,@ApiParam(value = "" )@HeaderParam("api_key") String apiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteReport(reportId,apiKey,securityContext);
    }

    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "returns all registried reports.", notes = "returns all registried reports.", response = ReportItem.class, responseContainer = "List", tags={ "Report", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportItem.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class) })
    public Response getAllReports(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllReports(securityContext);
    }

    @GET
    @Path("/{reportId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find report by ID", notes = "Returns a single report", response = ReportItem.class, tags={ "Report", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportItem.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Report not found", response = Void.class) })
    public Response getReportById(@ApiParam(value = "ID of report to return",required=true) @PathParam("reportId") Long reportId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getReportById(reportId,securityContext);
    }

    @PUT
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Update an existing report", notes = "", response = Void.class, tags={ "Report", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Report not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
    public Response updateReport(@ApiParam(value = "Report object that needs to be added to the store" ,required=true) ReportItem body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateReport(body,securityContext);
    }

}


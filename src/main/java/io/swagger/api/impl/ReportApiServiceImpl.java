package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;
import java.util.UUID;
import io.swagger.model.ReportItem;


import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-21T18:46:33.206Z[GMT]")

public class ReportApiServiceImpl extends ReportApiService {
    
    //list_set
	List<ReportItem> reports_list = new ArrayList<>();
	
    @Override
    public Response addReport(ReportItem body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
    	ReportItem report_item = new ReportItem();
    	report_item.setIdReport(body.getIdReport());
    	report_item.setDate(body.getDate());
    	report_item.setDescription(body.getDescription());
    	reports_list.add(report_item);
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Report added!")).build();
    }
    
    @Override
    public Response deleteReport(Long reportId, String apiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response getAllReports(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, this.reports_list.toString())).build();
    }
    
    @Override
    public Response getReportById(Long reportId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response updateReport(ReportItem body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
}


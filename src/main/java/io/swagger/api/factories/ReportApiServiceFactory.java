package io.swagger.api.factories;

import io.swagger.api.ReportApiService;
import io.swagger.api.impl.ReportApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-21T18:46:33.206Z[GMT]")
public class ReportApiServiceFactory {
    private final static ReportApiService service = new ReportApiServiceImpl();

    public static ReportApiService getReportApi() {
        return service;
    }
}

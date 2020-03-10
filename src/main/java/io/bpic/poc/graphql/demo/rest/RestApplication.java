package io.bpic.poc.graphql.demo.rest;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
@OpenAPIDefinition(
        info = @Info(
                title = "Profile Service",
                version = "1.0.0",
                contact =
                @Contact(
                        name = "Bruno Palermo",
                        email = "bruno@bpic.io",
                        url = "http://www.phillip-kruger.com")
        ), servers = @Server(url = "/", description = "Localhost")
)
public class RestApplication extends Application {

}

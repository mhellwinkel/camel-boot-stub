package org.mhellwinkel.camelboot.routes;


import org.apache.camel.spring.boot.FatJarRouter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ExampleRouter extends FatJarRouter {
    private static final Logger log = LoggerFactory.getLogger(ExampleRouter.class);

    @Override
    public void configure() throws Exception {
        from("direct:example").to("mock:done");
    }
}

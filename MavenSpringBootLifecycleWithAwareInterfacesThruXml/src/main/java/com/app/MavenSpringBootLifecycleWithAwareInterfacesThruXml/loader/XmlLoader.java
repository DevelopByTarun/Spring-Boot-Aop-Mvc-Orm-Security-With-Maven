package com.app.MavenSpringBootLifecycleWithAwareInterfacesThruXml.loader;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({
	"classpath*:bean_imp_aware.xml",
	"classpath*:bean_imp_custom_method.xml"
})
public class XmlLoader {

}

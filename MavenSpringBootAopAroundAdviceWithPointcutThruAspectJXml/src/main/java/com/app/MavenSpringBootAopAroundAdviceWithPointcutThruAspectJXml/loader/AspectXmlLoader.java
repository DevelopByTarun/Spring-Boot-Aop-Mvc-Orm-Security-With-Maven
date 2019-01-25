package com.app.MavenSpringBootAopAroundAdviceWithPointcutThruAspectJXml.loader;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({
	"classpath*:aspect.xml"
})
public class AspectXmlLoader {
}

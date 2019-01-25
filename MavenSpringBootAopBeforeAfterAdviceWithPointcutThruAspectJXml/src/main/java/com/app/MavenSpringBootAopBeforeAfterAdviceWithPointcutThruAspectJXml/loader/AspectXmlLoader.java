package com.app.MavenSpringBootAopBeforeAfterAdviceWithPointcutThruAspectJXml.loader;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({
	"classpath*:aspect.xml"
})
public class AspectXmlLoader {
}

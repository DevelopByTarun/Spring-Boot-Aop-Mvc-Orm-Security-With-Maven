package com.app.MavenSpringBootCachingWithLog4jThruAnnotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.app.MavenSpringBootCachingWithLog4jThruAnnotation.service.MusicService;
import com.app.MavenSpringBootCachingWithLog4jThruAnnotation.service.MusicServiceIml;

@EnableAutoConfiguration
@SpringBootApplication
public class MavenSpringBootCachingWithLog4jThruAnnotationApplication {
	
	private static Logger log = LoggerFactory.getLogger(MavenSpringBootCachingWithLog4jThruAnnotationApplication.class);

    @Autowired
    private MusicService musicService;

	public static void main(String[] args) {
		SpringApplication.run(MavenSpringBootCachingWithLog4jThruAnnotationApplication.class, args);
	}
	
	    public void run(String... args) throws Exception {
	        log.info("Spring Boot Conditional Caching and Other Caching Annotations Example");

	        String service = MusicServiceIml.class.getSimpleName();
	        log.info("Calling: " + service + ".findAll();");
	        log.info("Occurrences: " + musicService.findAll());
	        log.info("Calling: " + service + ".findAll();");
	        log.info("Occurrences: " + musicService.findAll());
	        log.info("Calling: " + service + ".findByIndex();");
	        musicService.findByIndex(1);
	        log.info("Calling: " + service + ".findByIndex();");
	        musicService.findByIndex(1);
	        log.info("Calling: " + service + ".findByIndex();");
	        musicService.findByIndex(0);
	        log.info("Calling: " + service + ".findByIndex();");
	        musicService.findByIndex(0);
	        log.info("Calling: " + service + ".save();");
	        musicService.save("Saxophone");
	        log.info("Calling: " + service + ".findAll();");
	        log.info("Occurrences: " + musicService.findAll());
	        log.info("Calling: " + service + ".delete();");
	        musicService.delete("Bass");
	        log.info("Calling: " + service + ".findAll();");
	        log.info("Occurrences: " + musicService.findAll());
	        log.info("Calling: " + service + ".deleteAll();");
	        musicService.deleteAll();
	        log.info("Calling: " + service + ".findAll();");
	        log.info("Occurrences: " + musicService.findAll());

	        play("trombone");
	        play("guitar");
	        play("trombone");
	        play("bass");
	        play("trombone");
	    }

	    private void play(String instrument){
	        log.info("Calling: " + MusicServiceIml.class.getSimpleName() + ".play(\"" + instrument + "\");");
	        musicService.play(instrument);
	    }
}

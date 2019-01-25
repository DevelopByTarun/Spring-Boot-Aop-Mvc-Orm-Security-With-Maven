package com.app.MavenSpringBootCachingWithLog4jThruAnnotation.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.*;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootCachingWithLog4jThruAnnotation.MavenSpringBootCachingWithLog4jThruAnnotationApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@CacheConfig(cacheNames = {"directory", "instruments"})
public class MusicServiceIml implements MusicService {

    private static Logger log = LoggerFactory.getLogger(MavenSpringBootCachingWithLog4jThruAnnotationApplication.class);

    private static List<String> instruments = new ArrayList<String>(Arrays.asList("Guitar", "Bass", "Keyboard"));

    @Cacheable(unless = "#result.size() > 25")
    @Override
    public List<String> findAll() {
        log.info("Executing: " + this.getClass().getSimpleName() + ".findAll();");
        return instruments;
    }

    @Caching(cacheable = {
            @Cacheable(condition = "#index == 1"),
            @Cacheable(condition = "#index > 10")
    })
    @Override
    public String findByIndex(int index) {
        log.info("Executing: " + this.getClass().getSimpleName() + ".findByIndex(\"" + index + "\");");
        return instruments.get(index);
    }

    @CachePut
    @Override
    public void save(String instrument) {
        log.info("Executing: " + this.getClass().getSimpleName() + ".save(\"" + instrument + "\");");
        instruments.add(instrument);
    }

    @CacheEvict
    @Override
    public void delete(String instrument) {
        log.info("Executing: " + this.getClass().getSimpleName() + ".delete(\"" + instrument + "\");");
        instruments.remove(instrument);
    }

    @CacheEvict(allEntries = true)
    @Override
    public void deleteAll() {
        log.info("Executing: " + this.getClass().getSimpleName() + ".deleteAll();");
        instruments.removeAll(instruments);
    }

    @Cacheable(condition = "#instrument.equals('trombone')")
    public String play(String instrument) {
        log.info("Executing: " + this.getClass().getSimpleName() + ".play(\"" + instrument + "\");");
        return "paying " + instrument + "!";
    }
}

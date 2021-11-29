package com.tts.weatherapp.repository;

import java.util.List;
import com.tts.weatherapp.domain.Request;
import org.springframework.data.repository.CrudRepository;

public interface ZipRepository extends CrudRepository<Request, Long> {
    List<Request> storeZipCodes(String zipCode);
}
